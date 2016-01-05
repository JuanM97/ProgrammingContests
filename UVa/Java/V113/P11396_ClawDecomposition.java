/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V113;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class P11396_ClawDecomposition {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int N, a, b, smx = 310;
    static boolean[] vis= new boolean[smx];
    static int color[] = new int[smx];
    static ArrayList<Integer>[] graph = new ArrayList[smx];
    static Queue<Integer> q= new LinkedList();
    //Check if graph is bipartite
    static boolean isClaw(){
        int f = 0;
        q.clear();
        for(int i=1;i<=N;i++){
            if(!vis[i]){
                //if(graph[i].size()!=3)return false;
                f = i;
                q.add(f);
                int tmp = 0, clr = 1;
                color[f] = clr;
                vis[f] = true;
                while(!q.isEmpty()){
                    //out.println(q.toString());
                    tmp = q.poll();
                    clr = color[tmp];
                    //vis[tmp] = true;
                    for(int n : graph[tmp]){
                        if(!vis[n]){
                            vis[n] = true;
                            color[n] = clr^1;
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
            N = sc.nextInt();
            if(N==0)break;
            for(int i=0;i<smx;i++){
                graph[i].clear();
                vis[i] = false;
                color[i]=0;
            }
            while(true){
                a = sc.nextInt();
                b = sc.nextInt();
                if(a==0 && b==0)break;
                graph[a].add(b);
                graph[b].add(a);
            }
            //for(int i=0;i<=N;i++)
            //    System.out.println(i+": "+graph[i].toString());
            out.println(isClaw()?"YES":"NO");
            //out.println(q.toString());
        }
        out.close();
    }
    
}


