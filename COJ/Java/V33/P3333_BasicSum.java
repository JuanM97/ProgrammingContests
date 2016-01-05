/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P3333_BasicSum {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int smx = 100100;
    static int[] ar = new int[smx];
    
    public static void main(String[] args) {
        int N,Q,a,b;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            for(int i=1;i<=N;i++) ar[i] = sc.nextInt();
            for(int i=2;i<=N;i++) ar[i] += ar[i-1];
            //for(int i=0;i<10;i++)System.out.print(ar[i]+" ");
            Q = sc.nextInt();
            while(Q-->0){
                a = sc.nextInt();
                b = sc.nextInt();
                out.println(ar[b]-ar[a-1]);
            }
            
        }
        out.close();        
    }
    
}


