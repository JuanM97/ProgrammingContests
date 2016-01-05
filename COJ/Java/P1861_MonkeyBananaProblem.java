/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V18;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;;
public class P1861_MonkeyBananaProblem {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int T, N, smx = 210, k=1;
        long g[][] = new long[smx][smx];
        long dp[][] = new long[smx][smx];
        T = sc.nextInt();
        while(T-->0){
            for(int i=0;i<smx;i++){
                for(int j=0;j<smx;j++){
                    g[i][j] = 0;
                    dp[i][j] = 0;
                }
            }
            N = sc.nextInt();
            for(int i=1;i<=N;i++){
                for(int j=1;j<=i;j++){
                    g[i][N-i+j] = sc.nextLong();
                }
            }
            for(int i=N-1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    g[2*N-i][j] = sc.nextLong();
                }
            }
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    dp[i][j] = g[i][j]+Math.max(dp[i-1][j],dp[i-1][j+1]);
                }
            }
            for(int i=N-1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    dp[2*N-i][j] = g[2*N-i][j]+Math.max(dp[2*N-i-1][j],dp[2*N-i-1][j+1]);
                }
            }
            out.printf("Case %d: %d\n",k++,dp[2*N-1][1]);
            /*for(int i=0;i<=2*N;i++){
                for(int j=0;j<=N;j++){
                    out.print(dp[i][j]+" ");
                }out.println();
            }out.println("*****");*/
        }
        out.close();
    }
    
    
}


