/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V14;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1448_TriGraphs {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 100100;
    static long[][] g= new long[smx][6];
    static long[][] dp= new long[smx][6];
    public static void main(String[] args) {
        int N, k = 1;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<=0)break;
            for(int i=1;i<=N;i++){
                g[i][1] = sc.nextInt();
                g[i][2] = sc.nextInt();
                g[i][3] = sc.nextInt();
            }
            for(int i=0;i<smx;i++){
                for(int j=0;j<6;j++){
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            dp[1][1] = Integer.MAX_VALUE;
            dp[1][2] = g[1][2];
            dp[1][3] = g[1][2]+g[1][3];
            for(int i=2;i<=N;i++){
                for(int j=1;j<=3;j++){
                    dp[i][j] = Math.min(
                            Math.min( Math.min(dp[i-1][j-1],dp[i-1][j]),
                            dp[i][j-1]),dp[i-1][j+1])+g[i][j];
                }
            }
            /*for(int i=0;i<=N;i++){
                for(int j=0;j<5;j++){
                    out.print(g[i][j]+" ");
                }out.println();
            }out.println();
            for(int i=0;i<=N;i++){
                for(int j=0;j<5;j++){
                    out.print(dp[i][j]+" ");
                }out.println();
            }*/
            out.println((k++)+". "+dp[N][2]);
        }
        out.close();
    }
    
}


