/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V26;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P2616_EasyChange {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static final int smx = 100100;
    static int[] dp = new int[smx];
    static int[] coins = {1,3,5,6};
    
    static void preCalc(){
        dp[0]=0;
        int min=0;
        for(int i=1;i<smx;i++){
            min=Integer.MAX_VALUE;
            for(int j=0;j<coins.length && i-coins[j]>=0;j++){
                min = Math.min(min, dp[i-coins[j]]);
            }
            dp[i] = min+1;
        }
        
    }
    
    public static void main(String[] args) {
        int numberOfCases = 0, n = 0;
        preCalc();
        //for(int i=0;i<10;i++)out.print(dp[i]+" ");
        //out.println();
        numberOfCases = sc.nextInt();
        for(int i=1;i<=numberOfCases;i++){
            n = sc.nextInt();
            out.printf("Case %d: %d%n",i,dp[n]);
        }
        out.close();
    }
    
}


