/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V104;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10405_LongestCommonSubsequence {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int L[][] = new int [1010][1010];
    
    static int lcs(String X, String Y){
        int i, j;
        for (i=0; i<=X.length(); i++){
            for (j=0; j<=Y.length(); j++){
                if (i == 0 || j == 0) L[i][j] = 0;
                else if(X.charAt(i-1) == Y.charAt(j-1)) L[i][j] = L[i-1][j-1] + 1;
                else L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
         }
       }
       return L[X.length()][Y.length()];
    }
    
    public static void main(String[]args){
        String a, b;
        while(sc.hasNext()){
            a = sc.nextLine().trim();
            b = sc.nextLine().trim();
            if(a.equals("p"))break;
            for(int i=0;i<L.length;i++){
                for(int j=0;j<L.length;j++){
                    L[i][j] = 0;
                }
            }
            out.println(lcs(a,b));
        }
        out.flush();
    }
}


