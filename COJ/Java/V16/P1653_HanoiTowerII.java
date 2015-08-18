/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V16;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P1653_HanoiTowerII {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int t,n;
        t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            out.println(BigInteger.valueOf(3).pow(n).subtract(BigInteger.ONE).toString());
        }
        out.flush();
    }
    
}
