/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V19;

/**
 *
 * @author JuanM
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P1973_Times17 {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        BigInteger n,m,sev=BigInteger.valueOf(17);
        while(sc.hasNext()){
            n=sc.nextBigInteger(2);
            if(n.equals(BigInteger.ZERO))break;
            out.println(n.multiply(sev).toString(2));
        }
        out.flush();
    }
}
