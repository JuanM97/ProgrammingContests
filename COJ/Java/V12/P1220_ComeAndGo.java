/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V12;

/**
 *
 * @author JuanM
 */


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class P1220_ComeAndGo {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int T, V, E, a, b, c, smx = 2150;
    static boolean[] vis= new boolean[smx];
    static ArrayList<Integer>[] graph = new ArrayList[smx];
    static Queue<Integer> q= new LinkedList();
    static boolean isReachable(int s){
        for(int i=0;i<smx;i++){
            vis[i] = false;
        }
        q.clear();
        int tmp = s;
        q.add(tmp);
        vis[tmp] = true;
        while(!q.isEmpty()){
            tmp = q.poll();
            for(int n : graph[tmp]){
                if(!vis[n]){
                    vis[n] = true;
                    q.add(n);
                }
            }
        }
        int cnt = 0;
        for(int i=0;i<=V;i++){
            cnt+=(vis[i]?1:0);
        }
        //System.out.println("cnt: "+cnt+" : "+V);
        return cnt==V;
    }
    static boolean isConnected(){
        for(int i=1;i<=V;i++){
            boolean isR = isReachable(i);
            //System.out.println("V: "+i+" "+isR);
            if(isR==true)continue;
            else return false;
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
            E = sc.nextInt();
            if(V==0 && E==0)break;
            for(int i=0;i<smx;i++){
                graph[i].clear();
                vis[i] = false;
            }
            for(int i=0;i<E;i++){
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                if(c==1){
                    graph[a].add(b);
                }else{
                    graph[a].add(b);
                    graph[b].add(a);
                }
            }
            /*for(int i=1;i<=V;i++){
                System.out.println(graph[i]);
            }*/
            out.println(isConnected()?1:0);
        }
        out.close();
    }
    
}


