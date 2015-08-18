/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V12;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1215_BinaryClock {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        int n,h1,h2,m1,m2,s1,s2;
        n = sc.nextInt();
        sc.nextLine();
        String s,hrs[];
        for(int i=1;i<=n;i++){
            s = sc.nextLine().trim();
            hrs = s.split("\\)");
            h1=0;
            for(int j=0;j<2;j++){
                h1*=2;
                h1+=(hrs[j].length()-1);
            }
            h2=0;
            for(int j=2;j<6;j++){
                h2*=2;
                h2+=(hrs[j].length()-1);
            }
            m1=0;
            for(int j=6;j<9;j++){
                m1*=2;
                m1+=(hrs[j].length()-1);
            }
            m2=0;
            for(int j=9;j<13;j++){
                m2*=2;
                m2+=(hrs[j].length()-1);
            }
            s1=0;
            for(int j=13;j<16;j++){
                s1*=2;
                s1+=(hrs[j].length()-1);
            }
            s2=0;
            for(int j=16;j<20;j++){
                s2*=2;
                s2+=(hrs[j].length()-1);
            }
            out.printf("Case %d: %d%d:%d%d:%d%d\n",i,h1,h2,m1,m2,s1,s2);
        }
        out.flush();
    }
    
}

