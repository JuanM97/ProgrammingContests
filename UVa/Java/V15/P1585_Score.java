/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V15;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P1585_Score {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n, ct;
        n = sc.nextInt();
        String s, ar[];
        while(n-->0){
            s = sc.next();
            ar = s.split("X");
            ct = 0;
            for(String st : ar){
                ct += (st.length()*(st.length()+1)/2);
            }
            out.println(ct);
        }
        out.close();
    }
}

