/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V14;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashSet;
public class P1438_CDs {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashSet<Integer> hm=new HashSet();
    
    public static void main(String[]args){
        int jk,jl,k,c;
        while(sc.hasNext()){
            jk=sc.nextInt();
            jl=sc.nextInt();
            if(jk==0&&jl==0)break;
            hm.clear();
            c=0;
            while(jk-->0){
                k=sc.nextInt();
                hm.add(k);
            }
            while(jl-->0){
                k=sc.nextInt();
                if(hm.contains(k)){
                    c++;
                }
            }
            out.println(c);
        }
        out.flush();
    }
}
