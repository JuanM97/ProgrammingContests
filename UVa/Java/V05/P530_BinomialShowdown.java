/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V05;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P530_BinomialShowdown {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static long C(int n, int k){
        long ans = 1;
        k = Math.min(k,n-k);
        for(int i=1;i<=k;i++){
            ans = ans*(n-k+i)/i;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int n, k;
        while(sc.hasNext()){
            n = sc.nextInt();
            k = sc.nextInt();
            if(n==0 && k==0) break;
            out.println(C(n,k));
        }
        out.close();
    }
    
}

