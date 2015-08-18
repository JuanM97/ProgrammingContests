/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V117;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P11799_HorrorDash {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n, cases=1,max,act;
        int N=sc.nextInt();
        while(N-->0){
            max=Integer.MIN_VALUE;
            n=sc.nextInt();
            while(n-->0){
                act=sc.nextInt();
                if(max<act){
                    max=act;
                }
            }
            out.println("Case "+cases++ +": " +max);
        }
        out.flush();
    }
}
