/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V24;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2430_TriangularNumbers {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        double k,r;
        while(true){
            k=sc.nextDouble();
            if(k==0)break;
            r=(long)((Math.sqrt(1+8*k))-1)/2;
            //out.printf("%d %d",k,r);
            if((r*(r+1)/2)==k){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        out.flush();
    }
}

