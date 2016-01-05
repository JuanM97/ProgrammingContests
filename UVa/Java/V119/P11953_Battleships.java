/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V119;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P11953_Battleships {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 110;
    static char[][] grid = new char[smx][smx];
    
    static void floodfill(int i, int j){
        if(grid[i][j]=='.') return;
        grid[i][j] = '.';
        floodfill(i+1,j);
        floodfill(i-1,j);
        floodfill(i,j+1);
        floodfill(i,j-1);
    }
    
    public static void main(String[] args) {
        int T, N, cont,cs = 1;
        char[] line;
        T = sc.nextInt();
        while(T-->0){
            for(int i=0;i<smx;i++){
                for(int j=0;j<smx;j++){
                    grid[i][j] = '.';
                }
            }
            N = sc.nextInt();
            for(int i=1;i<=N;i++){
                line = sc.next().toCharArray();
                for(int j=1;j<=N;j++){
                    grid[i][j] = line[j-1];
                }
            }
            cont = 0;
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(grid[i][j]=='x'){
                        floodfill(i,j);
                        cont++;
                    }
                }
            }
            out.printf("Case %d: %d\n",cs++,cont);
        }
        out.close();
    }
    
}

