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

import java.util.Scanner;
import java.io.PrintWriter;
public class P3406_HelpWithTheHomework {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int T;
        String s;
        StringBuilder sb = new StringBuilder("");
        T = sc.nextInt();
        while(T-->0){
            sb.delete(0,sb.length());
            s = sc.next();
            sb.append(s);
            for(int i=0;i<s.length();i++) sb.append("0");
            out.println(sb);
        }
        out.close();
    }
    
}

