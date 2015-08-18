/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V29;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
import java.math.BigInteger;
public class P2904_SuperSum {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int t;
        t=sc.nextInt();
        BigInteger sum=BigInteger.ZERO;
        while(t-->0){
            sum=sum.add(sc.nextBigInteger());
        }
        out.println(sum.toString());
        out.flush();
    }
    
}
