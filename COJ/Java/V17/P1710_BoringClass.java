/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V17;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class P1710_BoringClass {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int smx = 101000;
    static ArrayList<Integer> p = new ArrayList();
    static boolean pb[] = new boolean[smx];
    
    public static void sieve(){
        pb[0] = true;
        pb[1] = true;
        p.add(2);
        for(int i=4;i<smx;i+=2){
            pb[i] = true;
        }
        for(int i=3;i<smx;i+=2){
            if(!pb[i]){
                p.add(i);
                for(int j=i;j<smx;j+=i){
                    pb[j] = true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        sieve();
        int T;
        long n;
        int ct;
        T = sc.nextInt();
        while(T-->0){
            n = sc.nextLong();
            ct = 0;
            for(int i=0;i<p.size() && p.get(i)<=n;i++){
                if(n%p.get(i)==0){
                    ct++;
                    while(n%p.get(i)==0){
                        n/=p.get(i);
                    }
                }
            }
            if(n!=1)ct++;
            out.println(ct);
        }
        out.close();
    }
    
}

