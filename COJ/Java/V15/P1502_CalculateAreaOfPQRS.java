/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V15;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
public class P1502_CalculateAreaOfPQRS {
    
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        int t;
        double a;
        t=sc.nextInt();
        while(t-->0){
            a=sc.nextDouble();
            out.printf(Locale.FRENCH,"%.3f\n",2*a*a/9);
        }
        out.flush();
    }
    
}
