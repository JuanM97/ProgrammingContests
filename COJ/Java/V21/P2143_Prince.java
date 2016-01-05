/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V21;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P2143_Prince {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int N, Wt, mxN = 310, mxW = 1100;
    static int[]w = new int[mxN];
    static int[]c = new int[mxN];
    static int[][]dp = new int[mxN][mxW];
    
    public static void main(String[] args) {
        int T, ct = 0, ctT = 0;
        T = sc.nextInt();
        while(T-->0){
            N = sc.nextInt();
            Wt = sc.nextInt();
            for(int i=0;i<N;i++){
                w[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            /*for(int i=0;i<N;i++){
                System.out.println(w[i]+" "+c[i]);
            }*/
            for(int i=0;i<mxW;i++)
                dp[0][i] = 0;
            
            for(int i=1;i<=N;i++){
                for(int j=0;j<=Wt;j++){
                    if(j>=w[i-1])
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+c[i-1]);
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
            /*for(int i=1;i<=N;i++){
                for(int j=0;j<=Wt+1;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }*/
            ct = 0;
            for(int i=0;i<=Wt;i++){
                ct = Math.max(ct,dp[N][i]);
            }
            //System.out.println(ct);
            ctT+=ct;
        }
        System.out.println(ctT);
        //out.close();
        
    }
    
}


