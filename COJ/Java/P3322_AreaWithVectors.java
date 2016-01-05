/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P3322_AreaWithVectors {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int T = sc.nextInt();
        int x1,y1,x2,y2;
        double ab,ma,mb,th;
        while(T-->0){
            x1 = sc.nextInt(); y1 = sc.nextInt();
            x2 = sc.nextInt(); y2 = sc.nextInt();
            ma = Math.sqrt(x1*x1+y1*y1);
            mb = Math.sqrt(x2*x2+y2*y2);
            ab = x1*x2+y1*y2;
            th = Math.acos(ab/(ma*mb));
            out.printf("%.1f%n",ma*mb*Math.sin(th)/2);
        }
        out.close();
    }
    
}


