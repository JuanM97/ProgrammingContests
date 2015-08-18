package V10;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1004_TraversingGrid {
    static char[][]grid;
    static char[]a={'>','v','<','^'};
    static char[]d={'R','D','L','U'};
    static int[][]spiral;
        
    public static int spiral(int N, int M){
        int current = 1;
        int ind=0;
        char n0=a[ind];
        spiral=new int[N][M];
        // Start in the corner
        int x = 0, y = 0, dx = 1, dy = 0;
        while (current <= N*M) {
            // Go in a straight line
            spiral[x][y] = current++;
            int nx = x + dx, ny = y + dy;
            // When you hit the edge...
            if (nx < 0 || nx == N || ny < 0 || ny == M || spiral[nx][ny] != 0) {
                // ...turn right
                ind=ind+1>=4?0:ind+1;
                n0=a[ind];
                int t = dy;
                dy = dx;
                dx = -t;
            }
            x += dx;
            y += dy;
        }
        return ind;
    }
    
    public static void printG(){
        for(int i=0; i<grid[0].length;i++){
            for(int j=0; j<grid.length;j++){
                System.out.print(grid[j][i]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t,n,m;
        t=sc.nextInt();
        
        while(t-->0){
            n=sc.nextInt();
            m=sc.nextInt();
            //printG();
            int nd=(spiral(m,n)-1)>=0?(spiral(m,n)-1):(spiral(m,n)+3);
            out.println(d[nd]);
        }
        out.flush();
    }
}
