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
public class P3407_Statistics {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static final int smx = 2030;
    static String[] y = new String[smx];
    static int[] p = new int[smx];
    public static void main(String[] args) {
        int N;
        int i1=0,i2=0,i3=0,pMin=Integer.MAX_VALUE,pc = 0;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            for(int i=0;i<N;i++){
                y[i] = sc.next();
                p[i] = sc.nextInt();
            }
            pMin = Integer.MAX_VALUE;
            pc = 0;
            for(int i=2;i<N;i++){
                pc = p[i]+p[i-1]+p[i-2];
                if(pc<=pMin){
                    pMin = pc;
                    i1 = i-2;
                    i2 = i-1;
                    i3 = i;
                }
            }
            out.printf("%s %s %s%n",y[i1],y[i2],y[i3]);
        }
        out.close();
    }
    
}

