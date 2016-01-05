/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V34;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P3433_Teamwork {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int smx = 110;
    static boolean[] s = new boolean[smx];
    static boolean[] l = new boolean[smx];
    
    public static void main(String[] args) {
        int X,Y,d,sv,wsv,usv;
        while(sc.hasNext()){
            for(int i=0;i<smx;i++){s[i] = false; l[i] = false;}
            X = sc.nextInt();
            if(X<0)break;
            Y = sc.nextInt();
            for(int i=0;i<X;i++) l[sc.nextInt()] = true;
            for(int i=0;i<Y;i++) s[sc.nextInt()] = true;
            sv = wsv = usv = 0;
            for(int i=1;i<=100;i++){
                if(l[i] && s[i]){
                    sv++;
                }else{
                    if(l[i] || s[i]){
                        wsv++;
                    }else{
                        usv++;
                    }
                }
            }
            out.printf("Unsolvable: %d%n",usv);
            out.printf("Weakly solvable: %d%n",wsv);
            out.printf("Strongly solvable: %d%n",sv);
        }
        out.close();        
    }
    
}


