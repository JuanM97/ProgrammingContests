/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V110;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class P11080_PlaceTheGuards {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int T, V, E, a, b, smx = 210, cnt, tot, tT;
    static boolean[] vis= new boolean[smx];
    static int color[] = new int[smx];
    static ArrayList<Integer>[] graph = new ArrayList[smx];
    static Queue<Integer> q= new LinkedList();
    //Check if graph is bipartite
    static boolean isClaw(){
        int f = 0;
        tT = 0;
        q.clear();
        cnt = 0;
        tot = 0;
        for(int i=0;i<V;i++){
            tot = 0;
            cnt = 0;
            //out.println(i+": "+graph[i].toString());
            if(!vis[i]){
                //if(graph[i].size()!=3)return false;
                f = i;
                q.add(f);
                int tmp = 0, clr = 1;
                color[f] = clr;
                if(clr==1)cnt++;
                tot++;
                vis[f] = true;
                while(!q.isEmpty()){
                    //out.println(q.toString());
                    tmp = q.poll();
                    clr = color[tmp];
                    //vis[tmp] = true;
                    for(int n : graph[tmp]){
                        if(!vis[n]){
                            tot++;
                            vis[n] = true;
                            color[n] = clr^1;
                            if(color[n]==1)cnt++;
                            q.add(n);
                        }else{
                            if(color[n]==clr){
                                return false;
                            }
                        }
                    }
                }
                //out.println(cnt+": "+tot);
                tT += (tot==1 ? 1 : Math.min(cnt,tot-cnt));
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        for(int i=0;i<smx;i++){
            graph[i] = new ArrayList();
        }
        q.clear();
        T = sc.nextInt();
        while(T-->0){
            V = sc.nextInt();
            E = sc.nextInt();
            for(int i=0;i<smx;i++){
                graph[i].clear();
                vis[i] = false;
                color[i]=0;
            }
            for(int i=0;i<E;i++){
                a = sc.nextInt();
                b = sc.nextInt();
                graph[a].add(b);
                graph[b].add(a);
            }
            //for(int i=0;i<=N;i++)
            //    System.out.println(i+": "+graph[i].toString());
            if(isClaw()){
                out.println(tT);
                //out.println(Math.min(cnt,V-cnt));
            }else{
                out.println(-1);
            }
            //out.println(q.toString());
        }
        out.close();
    }
    
}


