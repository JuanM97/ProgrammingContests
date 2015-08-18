/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V13;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1388_LastDigitOfApB {
    
    public static long modularExponentiation(long base, long exp, long mod){
        String ps=Long.toBinaryString(exp);
        long c=0;
        long d=1;
        for(int i=0; i<ps.length();i++){
            c=2*c;
            d=(d*d)%mod;
            if(ps.charAt(i)=='1'){
                c++;
                d=(d*base)%mod;
            }
        }
        return d;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        int a,b;
        long ans;
        while(t-->0){
            a=sc.nextInt();
            b=sc.nextInt();
            ans=modularExponentiation(a,b,10);
            out.println(ans);
        }
        out.flush();
    }
}
