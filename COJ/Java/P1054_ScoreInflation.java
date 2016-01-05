/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V10;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1054_ScoreInflation {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int Wt, N, mxN = 10100, mxW = 10100;
    static int[]w = new int[mxN];
    static int[]c = new int[mxN];
    static int[]dp = new int[mxW];
    
    public static void main(String[] args) {
        int T;
        T = sc.nextInt();
        while(T-->0){
            Wt = sc.nextInt();
            N = sc.nextInt();
            for(int i=0;i<N;i++){
                c[i] = sc.nextInt();
                w[i] = sc.nextInt();
            }
            for(int i=0;i<mxW;i++)
                dp[i] = 0;
            
            for(int i=1;i<=N;i++){
                for(int j=0;j<=Wt;j++){
                    if(j>=w[i-1])
                        dp[j] = Math.max(dp[j],dp[j-w[i-1]]+c[i-1]);
                }
            }
            /*for(int i=0;i<=Wt;i++)
                System.out.print(dp[i]+" ");
            System.out.println("");*/
            out.println(dp[Wt]);
            
        }
        out.close();
    }
    
}


