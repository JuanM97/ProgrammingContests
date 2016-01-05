/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V26;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2637_RangeSumQuery {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int T, N, Q, a, b, mn, mx, smx = 100100;
        long ar[] = new long[smx];
        T = sc.nextInt();
        while(T-->0){
            N = sc.nextInt();
            Q = sc.nextInt();
            ar[0] = 0;
            for(int i=1;i<=N;i++){
                ar[i] = ar[i-1]+sc.nextInt();
            }
            for(int i=0;i<Q;i++){
                a = sc.nextInt();
                b = sc.nextInt();
                mn = Math.min(a,b);
                mx = Math.max(a,b);
                out.println(ar[mx+1]-ar[mn]);
            }
            if(T!=0)out.println();
        }
        out.close();
        
    }
    
}


