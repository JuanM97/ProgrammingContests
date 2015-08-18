/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V27;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
public class P2712_SoftwareForSearching {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashMap<String,Integer> map = new HashMap();
    public static void main(String[]args){
        int t,n;
        String s;
        while(sc.hasNext()){
            t=sc.nextInt();
            //if(t==0)break;
            map.clear();
            for(int i=0;i<t;i++){
                s=sc.next();
                s=sc.next();
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else{
                    map.put(s,1);
                }
            }
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                s=sc.next();
                s=sc.next();
                if(map.containsKey(s)){
                    out.println(map.get(s));
                }else{
                    out.println(0);
                }
            }
        }
        out.flush();
    }
}

