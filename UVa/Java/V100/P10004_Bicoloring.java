/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V100;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P10004_Bicoloring {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(new InputStreamReader(System.in));
    static int[][]graph;
    static int color[];
    // You have to check any odd-number cycle, not just three-cycle
    public static boolean bicolored(){
        int first = -1;
        for(int i=0; i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                if(graph[i][j]==1){
                    first = i;
                    break;
                }
            }
            if(first!=-1)break;
        }
        Queue<Integer> q = new LinkedList();
        int curN = first;
        //out.println("first:" + curN);
        q.add(first);
        color[first]=1;
        while(!q.isEmpty()){
            //out.println("a");
            curN = q.poll();
            //out.println("curN:"+curN);
            for(int i=0;i<graph.length;i++){
                //out.print(i+", ");
                if(graph[curN][i]==0)continue;
                if(graph[curN][i]==1 && color[i]==0){
                    //out.print(".");
                    q.add(i);
                    if(color[curN]==1){
                        if(color[i]==0) color[i]=2;
                        else if(color[i]==1) return false;
                    }else{
                        if(color[i]==0) color[i]=1;
                        else if(color[i]==2) return false;
                    }
                }else{
                    //out.print("-");
                    if(color[i]==color[curN]) return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[]args){
        graph = new int[203][203];
        color = new int[203];
        int nodes,edges, i, j;
        nodes=sc.nextInt();
        while(nodes!=0){
            edges=sc.nextInt();
            for(int ix=0;ix<graph.length;ix++){
                for(int jx=0;jx<graph[ix].length;jx++){
                    graph[ix][jx]=0;
                }
            }
            for(int jx=0;jx<color.length;jx++){
                color[jx]=0;
            }
            while(edges-->0){
                i=sc.nextInt();
                j=sc.nextInt();
                graph[i][j]=1;
                graph[j][i]=1;
            }
            /*for(int ix=0;ix<10;ix++){
                for(int jx=0;jx<10;jx++){
                    out.print(graph[ix][jx]);
                }out.println();
            }*/
            boolean canBeBicolored = bicolored();
            /*for(int jx=0;jx<10;jx++){
                out.print(color[jx]);
            }out.println();*/
            if(canBeBicolored){
                out.println("BICOLORABLE.");
            }else{
                out.println("NOT BICOLORABLE.");  
            }
            nodes=sc.nextInt();
        }
        out.flush();
    }
}


