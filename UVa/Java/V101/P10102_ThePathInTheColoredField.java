/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V101;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Map;
public class P10102_ThePathInTheColoredField {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int M, smx = 110;
    static char ar[][] = new char[smx][smx];
    static LinkedList<Pair> cx = new LinkedList();
    static LinkedList<Pair> cy = new LinkedList();
    
    static class Pair{
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        int d,dMin,dM;
        char[] line;
        while(sc.hasNext()){
            M = sc.nextInt();
            if(M<0)break;
            for(int i=0;i<M;i++){
                line = sc.next().toCharArray();
                for(int j=0;j<M;j++){
                    ar[i][j] = line[j];
                }
            }
            cx.clear();
            cy.clear();
            Pair m;
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    //out.println("."+ar[i][j]+" ");
                    if(ar[i][j]=='1'){
                        m = new Pair(i,j);
                        cx.add(m);
                    }
                    if(ar[i][j]=='3'){
                        m = new Pair(i,j);
                        cy.add(m);
                    }
                }
            }
            d = 0;
            dMin = Integer.MAX_VALUE;
            dM = 0;
            for(Pair x : cx){
                dMin = Integer.MAX_VALUE;
                for(Pair y : cy){
                    d = Math.abs(x.x-y.x)+Math.abs(x.y-y.y);
                    //out.println("d: "+d);
                    dMin = Math.min(dMin, d);
                }
                dM = Math.max(dM,dMin);
            }
            out.println(dM);
        }
        out.close();
        
    }
    
}


