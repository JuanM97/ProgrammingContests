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
import java.math.BigInteger;
public class P1068_PersistentNumbers {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[]args){
        BigInteger[] tests = {BigInteger.valueOf(9),BigInteger.valueOf(8),BigInteger.valueOf(7),BigInteger.valueOf(6),
                              BigInteger.valueOf(5),BigInteger.valueOf(4),BigInteger.valueOf(3),BigInteger.valueOf(2)};
        BigInteger num;
        StringBuilder ret = new StringBuilder();
        boolean isBig;
        while(sc.hasNext()){
            num = sc.nextBigInteger();
            if(num.equals(BigInteger.valueOf(-1))) break;
            ret.delete(0,ret.length());
            isBig = true;
            if(num.toString().length()==1){
                ret.append("1").append(num.toString());
                num = BigInteger.ONE;
            }else{
                for(int i=0; i<tests.length;i++){
                    while(num.mod(tests[i]).equals(BigInteger.ZERO)){
                        num = num.divide(tests[i]);
                        ret.append(tests[i]);
                    }
                }
                if(!num.equals(BigInteger.ONE)) isBig = false;
                ret.reverse();
            }
            if(isBig){
                out.println(ret);
            }else{
                out.println("There is no such number.");
            }
            
        }
        out.flush();
        
    }
}
