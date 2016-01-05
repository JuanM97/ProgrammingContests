/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V124;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class P12442_ForwardingEmails {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 50010;
    static boolean[] vis = new boolean[smx];
    static int[] p = new int[smx];
    static int[] count = new int[smx];
    
    static int dfs(int u){
        vis[u] = true;
        int ct = 0;
        if(p[u]!=u && !vis[p[u]]){
            //System.out.println("a");
            ct += (dfs(p[u])+1);
        }
        vis[u] = false;
        return count[u] = ct;
    }
    
    public static void main(String[] args) {
        int T, N, a, b, ctMax = -1, vMax = 0, cs = 1, ct, ctT, v;
        T = sc.nextInt();
        while(T-->0){
            for(int i=0;i<smx;i++){
                vis[i] = false;
                count[i] = -1;
                p[i] = i;
            }
            N = sc.nextInt();
            for(int i=0;i<N;i++){
                a = sc.nextInt();
                b = sc.nextInt();
                p[a] = b;
            }
            ctMax = ct = ctT = 0;
            for(int i=1;i<smx;i++){
                if(count[i]==-1) dfs(i);
                if(count[i]>ctMax){
                    ctMax = count[i];
                    vMax = i;
                }
            }
            out.printf("Case %d: %d%n",cs++,vMax);
        }
        out.close();
    }
    
}


