/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V16;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P1656_BessieWeightProblem {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 45500;
    static boolean ws[] = new boolean[smx];
    public static void main(String[] args) {
        int W, N, a;
        while(sc.hasNext()){
            W = sc.nextInt();
            if(W<0) break;
            N = sc.nextInt();
            for(int i=0;i<smx;i++) ws[i] = false;
            ws[0] = true;
            for(int i=0;i<N;i++){
                a = sc.nextInt();
                for(int j=W+1;j>0;j--){
                    if(ws[j] && j+a<=W+10){
                        ws[j+a] = true;
                    }
                }
                ws[a] = true;
                /*for(int ix=0;ix<smx;ix++){
                    if(ws[ix])out.print(ix+" ");
                }out.println();*/
            }
            for(int i=W;i>=0;i--){
                if(ws[i]){
                    out.println(i);
                    break;
                }
            }
        }
        out.close();
    }
    
}

