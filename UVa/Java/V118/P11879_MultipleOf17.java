/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V118;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P11879_MultipleOf17 {
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        BigInteger a,u,t;
        while(true){
            a=sc.nextBigInteger();
            if(a.equals(BigInteger.ZERO))break;
            u=a.mod(BigInteger.TEN);
            a=a.divide(BigInteger.TEN);
            t=a.subtract(u.multiply(BigInteger.valueOf(5)));
            if(t.mod(BigInteger.valueOf(17)).equals(BigInteger.ZERO)){
                out.println(1);
            }else{
                out.println(0);
            }
        }
        out.flush();
    }
}
