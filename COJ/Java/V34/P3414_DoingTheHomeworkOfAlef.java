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
public class P3414_DoingTheHomeworkOfAlef {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static final int smx = 110;
    static StringBuilder[] sbar = new StringBuilder[smx];
    public static void main(String[] args) {
        int N;
        sbar[0] = new StringBuilder("625");
        sbar[1] = new StringBuilder("625");
        for(int i=2;i<smx;i++){
            sbar[i] = new StringBuilder(sbar[i-1]+"0");
        }
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            out.println(sbar[N]);
        }
        out.close();
    }

}

