/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P495_FibonacciFreeze {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int max=5010;
    static BigInteger[] f=new BigInteger[max];
    
    public static void ff(){
        f[0]=BigInteger.ZERO;
        f[1]=BigInteger.ONE;
        for(int i=2;i<max;i++){
            f[i]=f[i-1].add(f[i-2]);
        }
    }
    
    public static void main(String[]args){
        int t;
        ff();
        while(sc.hasNext()){
            t=sc.nextInt();
            //if(t<0)break;
            out.printf("The Fibonacci number for %d is %s\n",t,f[t].toString());
        }
        out.flush();
    }
}
