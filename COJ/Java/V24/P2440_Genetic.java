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
public class P2440_Genetic {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int n=sc.nextInt();
        String s,g;
        while(n-->0){
            s=sc.next();
            g=sc.next();
            if(s.contains(g)&&s.contains("T")){
                out.println("Y");
            }else{
                out.println("N");
            }
        }
        out.flush();
    }
}

