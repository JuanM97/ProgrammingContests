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
import java.util.Scanner;
public class P11094_Continents {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 30, N, M, maxCt, ct;
    static char[][] map = new char[smx][smx];
    static char land;
    
    static void floodfill(int i, int j){
        if(j==M) j = 0;
        if(j==-1)j = M-1;
        if(i<0 || i>=N || j<0 || j>=M) return;
        if(map[i][j]==land){
            map[i][j] = '.';
            ct++;
            floodfill(i+1,j);
            floodfill(i-1,j);
            floodfill(i,j+1);
            floodfill(i,j-1);
        }
    }
    
    public static void main(String[] args) {
        int x, y;
        char[] line;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            M = sc.nextInt();
            for(int i=0;i<N;i++){
                line = sc.next().toCharArray();
                for(int j=0;j<M;j++){
                    map[i][j] = line[j];
                }
            }
            x = sc.nextInt();
            y = sc.nextInt();
            land = map[x][y];
            floodfill(x,y);
            maxCt = -1;
            ct = 0;
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    ct = 0;
                    if(map[i][j]==land){
                        floodfill(i,j);
                    }
                    if(ct>maxCt)maxCt = ct;
                }
            }
            out.println(maxCt);
        }
        out.close();
    }
    
}


