/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V12;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashMap;
public class P1237_ExpertEnough {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashMap<String,Integer[]>hm = new HashMap();
    public static void main(String[]args){
        int t,d,nq,qq,ct;
        String car="";
        t=sc.nextInt();
        for(int ddx=0;ddx<t;ddx++){
            d=sc.nextInt();
            hm.clear();
            for(int i=0;i<d;i++){
                hm.put(sc.next(), new Integer[]{sc.nextInt(),sc.nextInt()});
            }
            nq=sc.nextInt();
            for(int i=0;i<nq;i++){
                qq=sc.nextInt();
                ct=0;
                car="";
                for(String s:hm.keySet()){
                    if(qq>=hm.get(s)[0] && qq<=hm.get(s)[1]){
                        car=s;
                        ct++;
                    }
                    if(ct>1)break;
                }
                out.printf("%s\n",ct==1?car:"UNDETERMINED");
            }//out.println();
            if(ddx!=t-1)out.println();
        }
        out.flush();
    }
}
