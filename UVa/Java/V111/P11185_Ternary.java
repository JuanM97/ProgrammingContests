/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V111;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P11185_Ternary {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static String toTernary(long n){
        StringBuilder sb = new StringBuilder("");
        while(n>=2){
            sb.append(n%3);
            n/=3;
        }
        if(n!=0)sb.append(n);
        if(sb.toString().equals(""))sb.append("0");
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        long n;
        String t;
        while(sc.hasNext()){
            n = sc.nextLong();
            if(n<0)break;
            t = toTernary(n);
            out.println(t);
        }
        out.close();
    }
    
}
