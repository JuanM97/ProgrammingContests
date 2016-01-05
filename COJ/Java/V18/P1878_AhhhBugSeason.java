/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V18;

/**
 *
 * @author JuanM
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
public class P1878_AhhhBugSeason {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static class Point{
        int a,b;
        Point(int a, int b){
            this.a=a;
            this.b=b;
        }
        
        public boolean equals(Point q){
            return (this.a == q.a && this.b==q.b);
        }
    }
    
    static int smxW = 5000, smxH = 5000;
    static int W, H;
    static char[][] g = new char[smxH][smxW];
    static Queue<Point> q = new LinkedList();
    static void ff(int x, int y){
        Point tmp;
        q.add(new Point(x,y));
        while(!q.isEmpty()){
            tmp = q.poll();
            if(g[tmp.a-1][tmp.b]=='0'){
                g[tmp.a-1][tmp.b] = '1';
                q.add(new Point(tmp.a-1,tmp.b));
            }
            if(g[tmp.a][tmp.b-1]=='0'){
                g[tmp.a][tmp.b-1] = '1';
                q.add(new Point(tmp.a,tmp.b-1));
            }
            if(g[tmp.a][tmp.b+1]=='0'){
                g[tmp.a][tmp.b+1] = '1';
                q.add(new Point(tmp.a,tmp.b+1));
            }
            if(g[tmp.a+1][tmp.b]=='0'){
                g[tmp.a+1][tmp.b] = '1';
                q.add(new Point(tmp.a+1,tmp.b));
            }
        }
        
    }
    
    public static void main(String[] args) {
        char[] tmp;
        int ct = 0;
        while(sc.hasNext()){
            W = sc.nextInt();
            if(W<0)break;
            H = sc.nextInt();
            for(int i=0;i<smxH;i++){
                for(int j=0;j<smxW;j++){
                    g[i][j] = '1';
                }
            }
            for(int i=1;i<=H;i++){
                tmp = sc.next().toCharArray();
                for(int j=1;j<=W;j++){
                    g[i][j] = (tmp[j-1]);
                }
            }
            /*for(int i=0;i<30;i++){
                for(int j=0;j<30;j++){
                    out.print(g[i][j]);
                }out.println();
            }out.println();*/
            ct = 0;
            q.clear();
            for(int i=1;i<=H;i++){
                for(int j=1;j<=W;j++){
                    if(g[i][j]=='0'){
                        ff(i,j);
                        ct++;
                    }
                }
            }
            out.println(ct);
        }
        out.close();
    }
    
}


