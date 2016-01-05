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
public class P1478_BasicEditDistance {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static final int smx = 530;
    static int[][] dp = new int[smx][smx];
    static String a,b;
    
    static int getBasicEditDistance(){
        for(int i=0;i<=a.length()+10;i++)dp[i][0]=i;
        for(int i=0;i<=b.length()+10;i++)dp[0][i]=i;
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                dp[i][j] =  Math.min(dp[i-1][j]+1,
                            Math.min(dp[i][j-1]+1,
                            dp[i-1][j-1]+(a.charAt(i-1)!=b.charAt(j-1)?1:0)));
                //out.print(dp[i][j]+" ");
            }//out.println();
        }
        return dp[a.length()][b.length()];
    }
    
    public static void main(String[] args) {
        while(sc.hasNext()){
            a = sc.next();
            if(a.equals("-1"))break;
            b = sc.next();
            out.println(getBasicEditDistance());
        }
        out.close();
    }
    
}


