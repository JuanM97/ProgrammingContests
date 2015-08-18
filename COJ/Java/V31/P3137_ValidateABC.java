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
public class P3137_ValidateABC {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        int t;
        BigInteger a,b,c;
        t=sc.nextInt();
        while(t-->0){
            a=sc.nextBigInteger();
            b=sc.nextBigInteger();
            c=sc.nextBigInteger();
            if(a.add(b).equals(c)||a.subtract(b).equals(c)||a.multiply(b).equals(c)){
                out.println("YES");
            }else{
                if(!b.equals(BigInteger.ZERO) && (a.divide(b).equals(c)||a.mod(b).equals(c))){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }
        }
        out.flush();
    }
}
