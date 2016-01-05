/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V16;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P1630_HesOffside {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int A, D, a, aMin, ct;
        while(true){
            A = sc.nextInt();
            D = sc.nextInt();
            if(A==0 && D==0)break;
            aMin = Integer.MAX_VALUE;
            while(A-->0){
                a = sc.nextInt();
                if(a<aMin)aMin = a;
            }
            ct = 0;
            while(D-->0){
                a = sc.nextInt();
                if(a<=aMin)ct++;
            }
            //out.println("MIN: "+aMin+" ct: "+ct);
            if(ct>=2){
                out.println("N");
            }else{
                out.println("Y");
            }
        }
        out.close();
        
    }
    
}


