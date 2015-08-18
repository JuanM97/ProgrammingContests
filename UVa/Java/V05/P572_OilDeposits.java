/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V05;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P572_OilDeposits {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static char field[][] = new char[110][110];
    static int n,m;
    public static void clean(int i, int j){
        if(i<0 || i>n || j<0 || j>m || field[i][j]!='@')
            return;
        field[i][j]='*';
        clean(i-1,j-1); clean(i-1,j);   clean(i-1,j+1);
        clean(i,j-1);   clean(i,j+1);
        clean(i+1,j-1); clean(i+1,j);   clean(i+1,j+1);
    }
    
    public static void main(String[]args){
        String s;
        int cont=0;
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0)break;
            for(int i=0;i<n;i++){
                s = sc.next();
                for(int j=0;j<s.length();j++){
                    field[i][j] = s.charAt(j);
                }
            }            
            /*for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    out.print(field[i][j]);
                }out.println();
            }*/
            cont=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(field[i][j]=='@'){
                        clean(i,j);
                        cont++;
                        /*for(int ix=0;ix<n;ix++){
                            for(int jx=0;jx<m;jx++){
                                out.print(field[ix][jx]);
                            }out.println();
                        }*/
                    }
                }
            }
            out.println(cont);
        }
        out.flush();
    }
    
}


