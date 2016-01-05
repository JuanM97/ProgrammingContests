/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V109;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P10931_Parity {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        long n, m;
        int ct = 0;
        while(sc.hasNext()){
            n = sc.nextLong();
            m = n;
            if(n==0)break;
            ct = 0;
            while(n>=1){
                if(n%2==1)ct++;
                n>>=1;
            }
            out.printf("The parity of %s is %d (mod 2).%n",
                    Long.toBinaryString(m),ct);
        }
        out.close();
    }
    
}

