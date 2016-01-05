/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
public class P3332_GCDAndLCM {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 1001000, fmx = 50;
    static boolean pb[] = new boolean[smx];
    static ArrayList<Integer> ps = new ArrayList();
    
    static void sieve(){
        pb[0] = true;
        pb[1] = true;
        ps.clear();
        ps.add(2);
        for(int i=2;2*i<smx;i++){
            pb[2*i] = true;
        }
        for(int i=3;i<smx;i+=2){
            if(!pb[i]){
                ps.add(i);
                for(int j=2;i*j<smx;j++){
                    pb[i*j] = true;
                }
            }
        }
    }
    
    static long getNumPrimes(long n){
        long cnt = 0;
        for(int p : ps){
            if(n%p==0){
                cnt++;
                while(n%p==0){
                    n/=p;
                }
            }
        }
        if(n>1)cnt++;
        return cnt;
    }
    
    public static void main(String[] args) {
        sieve();
        //out.println(ps.subList(0,10));
        int T;
        long a,b,n;
        T = sc.nextInt();
        while(T-->0){
            a = sc.nextLong();
            b = sc.nextLong();
            if(b%a!=0){
                out.println(0);
            }else{
                b = b/a;
                n = getNumPrimes(b);
                if(n==0) out.println(1);
                else out.println((1L<<(n-1)));
            }
        }
        out.close();
    }
    
}


