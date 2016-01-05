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
import java.math.BigInteger;
public class P3319_Primorial {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int pb[] = {0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,
        1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1};
    static int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
    static int smx = 53;
    static long p[] = new long[smx];
    
    static void calc(){
        p[0] = 0;
        p[1] = 1;
        for(int i=2;i<smx;i++){
            if(pb[i]==1){
                p[i] = i*p[i-1];
            }else{
                p[i] = p[i-1];
            }
        }
    }
    
    public static void main(String[] args) {
        int T, N;
        calc();
        T = sc.nextInt();
        long s = 1;
        while(T-->0){
            N = sc.nextInt();
            out.println(p[N]);
        }
        out.close();
    }
    
    
}

