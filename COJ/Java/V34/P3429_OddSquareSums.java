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

import java.io.PrintWriter;
import java.util.Scanner;
public class P3429_OddSquareSums {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int smx = 1000100;
    static long sq[] = new long[smx];
    static long MOD = 1000000007;
    
    public static void main(String[] args) {
        sq[0] = 0;
        for(long i=1;i<smx;i++){
            if(i%2==0) sq[(int)i] = sq[(int)i-1];
            else sq[(int)i] = (sq[(int)i-1]+(i*i)%MOD)%MOD;
        }
        int N;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            out.println(sq[N]);
        }
        out.close();
        
    }
    
}


