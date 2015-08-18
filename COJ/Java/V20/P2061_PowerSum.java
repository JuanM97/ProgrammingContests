package V20;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P2061_PowerSum {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger inv,num,pow;
        BigInteger mod=BigInteger.valueOf(1000000007);
        while(n-->0){
            num = sc.nextBigInteger();
            pow = sc.nextBigInteger();
            if(!(num.subtract(BigInteger.ONE)).mod(mod).equals(BigInteger.ZERO)){
                inv = (num.subtract(BigInteger.ONE)).modInverse(mod);
                num = (num.modPow(pow.add(BigInteger.ONE),mod)).subtract(BigInteger.ONE);
                out.println((num.multiply(inv)).mod(mod));
            }else{
                out.println((pow.add(BigInteger.ONE)).mod(mod));
            }
            
        }
        out.flush();
    }
}
