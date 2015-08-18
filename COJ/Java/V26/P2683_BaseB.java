/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V26;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P2683_BaseB {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int t,n,b;
        t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            b=sc.nextInt();
            out.println(BigInteger.valueOf(n).toString(b).toUpperCase());
        }
        out.flush();       
    }
}

