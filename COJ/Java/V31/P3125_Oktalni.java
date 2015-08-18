/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V31;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P3125_Oktalni {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        BigInteger num;
        while(sc.hasNext()){
            num=sc.nextBigInteger(2);
            if(num.equals(BigInteger.ZERO))break;
            out.println(num.toString(8));
        }
        out.flush();
    }
}
