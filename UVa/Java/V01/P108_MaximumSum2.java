/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P108_MaximumSum2 {
    static PrintWriter out=new PrintWriter(System.out);
    
    static long maxSum(int[][] colPrefix, int N) {
        int KadaneSum = 0, colSum, i, j, w, max = Integer.MIN_VALUE;
        
        for (w = 1; w <= N; w++){
                for (i = 0; i <= N - w; i++, KadaneSum = 0){
                        for (j = 0; j < N; j++) {
                                colSum = colPrefix[i + w][j] - colPrefix[i][j];
                                KadaneSum = ((KadaneSum >= 0) ? KadaneSum : 0) + colSum;
                                max = KadaneSum > max ? KadaneSum : max;

                        }
                }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[][] a = new int[N + 1][N + 1];
            if(N==0)break;
            for (int i=1; i <= N; i++){
                    for (int j = 0; j < N; j++){
                            a[i][j] = sc.nextInt() + a[i - 1][j];
                    }
            }
            out.println(java.util.Arrays.deepToString(a));
            out.println(maxSum(a, N));
        }
        out.flush();
    }

}

