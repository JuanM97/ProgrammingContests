/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.BufferedOutputStream;
import java.util.Scanner;
public class P111_HistoryGrading {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), true);
    static int nums[];
    static int exam[];
    static int dp[];
    
    static boolean isBefore(int a,int b){
        int ma=0,mb=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a)ma=i;
            if(nums[i]==b)mb=i;
        }
        return ma<mb;
    }
    
    public static void main(String[]args){
        int n, mx,aux;
        n = sc.nextInt();
        nums = new int[n];
        exam = new int[n];
        dp = new int[n];
        for(int i=0;i<n;i++){
            aux = sc.nextInt();
            nums[aux-1] = i;
        }
        while(sc.hasNext()){
            for(int i=0;i<n;i++){
                dp[i] = 0;
                aux = sc.nextInt();
                exam[aux-1] = i;
            }
            dp[0]=1;
            mx=-1;
            for(int i=1;i<n;i++){
                mx=0;
                for(int j=0;j<i;j++){
                    if(isBefore(exam[j],exam[i]))mx = Math.max(mx,dp[j]);
                }
                dp[i] = mx+1;
            }
            mx=-1;
            for(int i=0;i<n;i++){
                //out.print(dp[i]+" ");
                if(mx<dp[i])mx=dp[i];
            }//out.println();
            out.println(mx);
        }
        out.flush();
    }
    
}


