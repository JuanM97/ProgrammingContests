/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V10;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class P1071_Bishops {
    static Scanner sc=new Scanner(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        BigInteger a;
        while(sc.hasNext()){
            a=sc.nextBigInteger();
            if(a.compareTo(BigInteger.ZERO)<0)break;
            if(a.compareTo(BigInteger.ONE)==0){
                out.println(1);
            }else{
                out.println((a.multiply(BigInteger.valueOf(2))).subtract(BigInteger.valueOf(2)));
            }
        }
        out.flush();
    }
}
