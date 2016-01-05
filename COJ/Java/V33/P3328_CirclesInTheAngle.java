/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P3328_CirclesInTheAngle {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        double R1, R2, T, X, a, b, g, g2, At, Acc, Acs;
        
        while(sc.hasNext()){
            R1 = sc.nextDouble();
            R2 = sc.nextDouble();
            if(R1==0 && R2==0)break;
            g = R1/R2;
            g2 = g*g;
            T = R1*(R1+R2)/(R1-R2);
            X = Math.sqrt(T*T-R1*R1);
            a = Math.acos(X/T);
            b = Math.PI/2 - a;
            At = X*R1;
            Acc = (Math.PI-b)*R1*R1;
            Acs = Math.PI*R1*R1*g2/(g2-1);
            out.println(At-Acs+Acc);
        }
        out.close();
        
    }
    
}


