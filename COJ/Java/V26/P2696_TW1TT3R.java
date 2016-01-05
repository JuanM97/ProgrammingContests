/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V26;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashSet;
public class P2696_TW1TT3R {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 1010;
    static HashSet<Integer>[] tw = new HashSet[smx];
    
    public static void main(String[] args) {
        int N, M, a, b, tMax;
        boolean f = false;
        for(int i=0;i<smx;i++)tw[i] = new HashSet();
        while(sc.hasNext()){
            //for(int i=0;i<30;i++)out.print(tw[i]+" ");
            //out.println();
            N = sc.nextInt();
            if(N<0)break;
            M = sc.nextInt();
            tMax = -1;
            while(M-->0){
                a = sc.nextInt();
                b = sc.nextInt();
                tw[a].add(b);
                tMax = Math.max(tMax,tw[a].size());
            }
            f = true;
            for(int i=1;i<=N;i++){
                if(tw[i].size()==tMax){
                    out.printf("%s%d",(f?"":" "),i);
                    f = false;
                }
            }
            out.println();
            for(int i=0;i<N+3;i++)tw[i].clear();
        }
        out.close();
        
    }
    
}


