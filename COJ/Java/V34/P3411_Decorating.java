/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V34;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P3411_Decorating {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int T;
        double r;
        double pi = 2*Math.acos(0);
        T = sc.nextInt();
        while(T-->0){
            r = sc.nextDouble();
            out.printf("%.2f%n",r*r*(pi-2));
        }
        out.close();
    }
    
}

