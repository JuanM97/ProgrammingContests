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
public class P3409_BraveWomen {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        long w;
        while(sc.hasNext()){
            w = sc.nextLong();
            if(w<0)break;
            out.println((int)(0.035*w));
        }
        out.close();
    }
    
}

