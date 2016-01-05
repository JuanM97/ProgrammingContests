/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V22;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class P2299_ElevatorTrouble {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 1000100;
    static boolean vis[] = new boolean[smx];
    static Queue<Integer> q = new LinkedList();
    static int F, S, G, U, D, cnt;
    
    static boolean isReachable(){
        q.clear();
        q.add(S);
        vis[S] = true;
        q.add(-1);
        cnt = 0;
        int tmp = 0;
        while(!q.isEmpty()){
            //out.println(q.toString());
            tmp = q.poll();
            if(tmp==G)return true;
            if(tmp==-1){
                if(q.isEmpty())break;
                q.add(-1);
                cnt++;
            }else{
                if(tmp+U<=F && !vis[tmp+U]){
                    q.add(tmp+U);
                    vis[tmp+U] = true;
                }
                if(tmp-D>0 && !vis[tmp-D]){
                    q.add(tmp-D);
                    vis[tmp-D] = true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        while(sc.hasNext()){
            F = sc.nextInt();
            if(F<0)break;
            S = sc.nextInt();
            G = sc.nextInt();
            U = sc.nextInt();
            D = sc.nextInt();
            for(int i=0;i<smx;i++){
                vis[i] = false;
            }
            cnt = 0;
            if(isReachable()){
                out.println(cnt);
            }else{
                out.println("use the stairs");
            }
        }
        out.close();
        
    }
    
}


