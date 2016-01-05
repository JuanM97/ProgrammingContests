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
public class P3441_WatchingTheClock {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int smx = 1010;
    static int ar[] = new int[smx];
    
    public static void main(String[] args) {
        ar[0] = ar[1] = 1;
        for(int i=2;i<smx;i++)ar[i] = ar[(int)(i/2)]+1;
        int T = sc.nextInt();
        int k;
        for(int i=1;i<=T;i++){
            k = sc.nextInt();
            out.printf("Case #%d: %d%n",i,ar[k]-1);
        }
        out.close();
    }
    
}


