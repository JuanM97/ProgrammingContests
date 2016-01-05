/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V11;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1112_Circumferences {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        double r1,r2,k,a,l1,r3;
        while(sc.hasNext()){
            r1 = sc.nextDouble();
            if(r1<0)break;
            r2 = sc.nextDouble();
            k = r1/r2;
            l1 = k*(r1+r2)/(1-k);
            a = Math.asin(r1/l1)*180/Math.PI;
            r3 = (l1+r1)*r1/l1;
            out.printf("%.4f %.2f%n",r3,2*a);
        }
        out.close();
    }
    
}

