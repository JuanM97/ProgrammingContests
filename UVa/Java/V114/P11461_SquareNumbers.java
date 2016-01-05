/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V114;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P11461_SquareNumbers {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int a, b;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==0 && b==0)break;
            out.println((int)Math.sqrt(b)-(int)Math.sqrt(a-1));
        }
        out.close();
    }
    
}

