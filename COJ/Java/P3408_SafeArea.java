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
public class P3408_SafeArea {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int N;
        double x1,y1,x2,y2,x3,y3;
        String sM = "",s;
        double aM = Double.MIN_VALUE,ac = -1;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            while(N-->0){
                s = sc.next();
                x1 = sc.nextDouble(); y1 = sc.nextDouble();
                x2 = sc.nextDouble(); y2 = sc.nextDouble();
                x3 = sc.nextDouble(); y3 = sc.nextDouble();
                ac = Math.abs((x1*y2+x2*y3+x3*y1-x2*y1-x3*y2-x1*y3)/2);
                //System.out.println(ac);
                if(ac>aM){
                    sM = s;
                    aM = ac;
                }
            }
            out.printf("%s %.2f km^2%n",sM,aM);
        }
        out.close();
    }
    
}

