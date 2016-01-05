/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V30;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class P3081_Bicoloring {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int T, V, E, a, b, smx = 1250;
    static boolean[] vis= new boolean[smx];
    static int color[] = new int[smx];
    static ArrayList<Integer>[] graph = new ArrayList[smx];
    static Queue<Integer> q= new LinkedList();
    //Check if graph is bipartite
    static boolean isBicolorable(){
        q.clear();
        int tmp = 0, clr = 0;
        for(int i=0;i<1;i++){
            //out.println(i+": "+graph[i].toString());
            if(!vis[i]){
                q.add(i);
                clr = 1;
                color[i] = clr;
                vis[i] = true;
                while(!q.isEmpty()){
                    //out.println(q.toString());
                    tmp = q.poll();
                    clr = color[tmp];
                    for(int n : graph[tmp]){
                        if(!vis[n]){
                            vis[n] = true;
                            color[n] = (1-clr);
                            q.add(n);
                        }else{
                            if(color[n]==clr){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        for(int i=0;i<smx;i++){
            graph[i] = new ArrayList();
        }
        q.clear();
        while(sc.hasNext()){
            V = sc.nextInt();
            if(V==0)break;
            E = sc.nextInt();
            for(int i=0;i<smx;i++){
                graph[i].clear();
                vis[i] = false;
                color[i]=1;
            }
            for(int i=0;i<E;i++){
                a = sc.nextInt();
                b = sc.nextInt();
                graph[a].add(b);
                graph[b].add(a);
            }
            //for(int i=0;i<=N;i++)
            //    System.out.println(i+": "+graph[i].toString());
            q.clear();
            if(isBicolorable()){
                out.println("BICOLORABLE.");
            }else{
                out.println("NOT BICOLORABLE.");
            }
        }
        out.close();
    }
    
}


