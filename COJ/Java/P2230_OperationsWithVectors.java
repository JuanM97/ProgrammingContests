/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V22;

/**
 *
 * @author JuanM
 */


import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
public class P2230_OperationsWithVectors {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 10;
    static int N;
    static long[] a = new long[smx];
    static long[] b = new long[smx];
    
    public static void main(String[] args) {
        long ans = 0;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            for(int i=0;i<N;i++){
                a[i] = sc.nextLong();
            }
            for(int i=0;i<N;i++){
                b[i] = sc.nextLong();
            }
            Arrays.sort(b,0,N);
            Arrays.sort(a,0,N);
            ans = 0;
            for(int i=0;i<N;i++){
                ans += a[N-1-i]*b[i];
            }
            out.println(ans);
        }
        out.close();
    }
    
}


