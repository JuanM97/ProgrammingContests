/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V101;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P10106_Product {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[]args){
        BigInteger a,b;
        while(sc.hasNext()){
            a = sc.nextBigInteger();
            if(a.equals(BigInteger.ZERO))break;
            b = sc.nextBigInteger();
            out.println(a.multiply(b));
        }
        out.flush();
    }
    
}


