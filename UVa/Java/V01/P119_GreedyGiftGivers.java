/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
public class P119_GreedyGiftGivers {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    static LinkedHashMap<String,Integer> hm=new LinkedHashMap();
    static int n,ps;
    static double mny,mt;
    static String name;
    static int ct=0;
    public static void main(String[]args){
        while(sc.hasNext()){
            hm.clear();
            n=sc.nextInt();
            if(n==-1)break;
            for(int i=0;i<n;i++){
                hm.put(sc.next(),0);
            }
            while(n-->0){
                name=sc.next();
                mny=sc.nextDouble();
                ps=sc.nextInt();
                if(ps>0){
                    hm.put(name,hm.get(name)-(int)mny+(int)(mny%ps));
                }else{
                    //hm.put(name,hm.get(name)+(int)mny);
                }
                mt=(mny-mny%ps)/ps;
                while(ps-->0){
                    name=sc.next();
                    hm.put(name,hm.get(name)+(int)mt);
                }
            }
            if(ct>0){
                out.println();
            }
            ct++;
            for(String n:hm.keySet()){
                out.println(n+" "+hm.get(n));
            }
            
        }
        out.flush();
    }
}
