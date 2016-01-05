/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V24;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2458_NumeruzkaTrianglezlayaSequence {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        long N;
        while(sc.hasNext()){
            N = sc.nextLong();
            if(N==0)break;
            out.println((long)Math.ceil((-1+Math.sqrt(1+8*N))/2));
        }
        out.close();
        
    }
    
}


