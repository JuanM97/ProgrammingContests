/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V118;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class P11831_StickerCollectorRobot {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int cont = 0, x = 0, y = 0, o = 0, N = 0, M = 0, S = 0;
    static char[][] tab = new char[110][110];
    
    static void getNextMove(char c){
        switch(c){
            case 'D':
                o = (o+1)%4;
                break;
            case 'E':
                o = (o+3)%4;
                break;
            case 'F':
                if(o%2 == 0){
                    if(o == 0 && x>1 && tab[x-1][y]!='#') x-=1;
                    if(o == 2 && x<N && tab[x+1][y]!='#') x+=1;
                }else{
                    if(o == 1 && y<M && tab[x][y+1]!='#') y+=1;
                    if(o == 3 && y>1 && tab[x][y-1]!='#') y-=1;
                }
                if(tab[x][y]=='*'){
                    cont++;
                    tab[x][y]='.';
                }
                break;
        }
    }
    
    public static void main(String[] args) {
        
        while(sc.hasNext()){
            N = sc.nextInt();
            M = sc.nextInt();
            S = sc.nextInt();
            if(N == 0 && M == 0 && S == 0) break;
            char[] s;
            x = y = o = 0;
            for(int i=1;i<=N;i++){
                s = sc.next().toCharArray();
                for(int j=1;j<=M;j++){
                    tab[i][j] = s[j-1];
                    if(s[j-1]=='N' || s[j-1]=='S' || s[j-1]=='L' || s[j-1]=='O'){
                        x = i;
                        y = j;
                        switch(s[j-1]){
                            case 'N':
                                o = 0;
                                break;
                            case 'S':
                                o = 2;
                                break;
                            case 'L':
                                o = 1;
                                break;
                            case 'O':
                                o = 3;
                                break;
                        }
                    }
                }
            }
            //out.printf("%d %d %d %n",x,y,o);
            s = sc.next().toCharArray();
            cont = 0;
            for(int i = 0;i < S;i++){
                getNextMove(s[i]);
                //out.printf("%c %d %d %d %n",s[i],x,y,o);
            }
            //out.printf("%d %d %d: ",x,y,o);
            out.println(cont);
        }
        out.close();
    }
    
}

