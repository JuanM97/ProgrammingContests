/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V13;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class P1385_WeedInvasion {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 110;
    static int C, R, xi, yi;
    static char g[][] = new char[smx][smx];
    static boolean v[][] = new boolean[smx][smx];
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};
    static Queue<Point> q = new LinkedList();
    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public boolean equals(Point p){
            return (this.x==p.x && this.y==p.y);
        }
        @Override
        public String toString(){
            return String.format("[%d,%d]",this.x,this.y);
        }
    }
    static int invade(int a, int b){
        int cnt = 0;
        q.clear();
        q.add(new Point(a,b));
        v[a][b] = true;
        g[a][b] = 'M';
        Point tmp, signal = new Point(-1,-1);
        q.add(signal);
        while(!q.isEmpty()){
            //System.out.println(q.toString());
            tmp = q.poll();
            if(tmp.equals(signal)){
                if(q.isEmpty())break;
                cnt++;
                q.add(signal);
                /*for(int i=0;i<=R;i++){
                    for(int j=0;j<=C;j++){
                        out.print(g[i][j]);
                    }out.println();
                }*/
            }else{
                for(int i=0;i<dx.length;i++){
                    if(tmp.x+dx[i]<1 || tmp.x+dx[i]>R || tmp.y+dy[i]<1 ||
                            tmp.y+dy[i]>C || v[tmp.x+dx[i]][tmp.y+dy[i]]){
                        //System.out.println("x,y:"+(tmp.x+dx[i])+" "+(tmp.y+dy[i]));
                        continue;
                    }
                    if(!v[tmp.x+dx[i]][tmp.y+dy[i]]){
                        //System.out.println("In: x,y:"+(tmp.x+dx[i])+" "+(tmp.y+dy[i]));
                        q.add(new Point(tmp.x+dx[i],tmp.y+dy[i]));
                        v[tmp.x+dx[i]][tmp.y+dy[i]] = true;
                        g[tmp.x+dx[i]][tmp.y+dy[i]] = 'M';
                    }
                }
            }
            
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        char[] l;
        while(sc.hasNext()){
            C = sc.nextInt();
            if(C<0)break;
            R = sc.nextInt();
            yi = sc.nextInt();
            xi = R+1-sc.nextInt();
            for(int i=0;i<smx;i++){
                for(int j=0;j<smx;j++){
                    g[i][j] = '0';
                    v[i][j] = false;
                }
            }
            v[xi][yi] = true;
            for(int i=1;i<=R;i++){
                l = sc.next().toCharArray();
                for(int j=1;j<=C;j++){
                    g[i][j] = l[j-1];
                    if(l[j-1]!='.')v[i][j] = true;
                }
            }
            out.println(invade(xi,yi));
        }
        out.close();
    }
    
}


