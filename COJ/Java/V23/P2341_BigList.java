/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V23;

/**
 *
 * @author JuanManuel
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashMap;
public class P2341_BigList {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static HashMap<String,Integer> hm = new HashMap();
    public static void main(String[]args){
        int n,m,v;
        String k,s,ar[];
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0)break;
            m=sc.nextInt();
            hm.clear();
            while(n-->0){
                k=sc.next();
                v=sc.nextInt();
                hm.put(k,v);
            }
            sc.nextLine();
            while(m-->0){
                s=sc.nextLine().trim();
                ar=s.split("\\s+");
                if(ar.length==1){
                    out.println("not found");
                }else{
                    if(hm.containsKey(ar[0])&&hm.get(ar[0])==Integer.parseInt(ar[1])){
                        out.println("ok");
                    }else{
                        out.println("wrong");
                    }
                }
            }
        }
        out.flush();
    }
}
