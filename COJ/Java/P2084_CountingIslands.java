/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V20;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2084_CountingIslands {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int N, smx = 110, islT, islC, islMx, islMn;
    static char[][] tab= new char[smx][smx];
    
    static void floodFill(int x, int y){
        if(x<1 || x>N+1 || y<1 || y>N+1 || tab[x][y]=='s')return;
        tab[x][y] = 's';
        islC++;
        floodFill(x-1,y-1);
        floodFill(x-1,y);
        floodFill(x-1,y+1);
        floodFill(x,y-1);
        floodFill(x,y+1);
        floodFill(x+1,y-1);
        floodFill(x+1,y);
        floodFill(x+1,y+1);
    }
    
    public static void main(String[] args) {
        char[] tmp;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N==0)break;
            for(int i=0;i<smx;i++){
                for(int j=0;j<smx;j++){
                    tab[i][j] = 's';
                }
            }
            islT = islC = islMx = 0;
            islMn = smx*smx+1;
            for(int i=1;i<=N;i++){
                tmp = sc.next().toCharArray();
                for(int j=1;j<=N;j++){
                    tab[i][j] = tmp[j-1];
                }
            }
            /*out.println();
            for(int i=0;i<N+2;i++){
                for(int j=0;j<N+2;j++){
                    out.print(tab[i][j]);
                }out.println();
            }*/
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(tab[i][j]=='l'){
                        islT++;
                        islC = 0;
                        floodFill(i,j);
                        islMn = Math.min(islMn,islC);
                        islMx = Math.max(islMx,islC);
                    }
                }
            }
            if(islMn == smx*smx+1)islMn = 0;
            out.printf("%d %d %d\n",islT,islMn,islMx);
            
        }
        out.close();
    }
    
}


