/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V01;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P105_TheSkylineProblem {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static int mx = 10100;
    static int city[] = new int[mx];
    
    public static void main(String[]args){
        int a,h,b,max=0;
        for(int i=0;i<mx;i++) city[i] = 0;
        while(sc.hasNext()){
            a = sc.nextInt();
            if(a==-1)break;
            h = sc.nextInt();
            b = sc.nextInt();
            max = Math.max(max,b);
            for(int i=a;i<b;i++){
                if(h>city[i]) city[i] = h;
            }
        }
        //for(int i=0;i<33;i++) System.out.print(city[i]+" ");
        //System.out.println();
        a = 0;
        while(city[a]==0)a++;
        out.print(a);
        h=city[a];
        for(int i=a+1;i<max;i++){
            if(city[i]==h)continue;
            a = i;
            out.print(" "+h+" "+a);
            h = city[i];
        }
        out.println(" "+h+" "+max+" "+0);
        out.flush();
    }
    
}


