/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V18;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P1888_EvilNumbers {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        BigInteger n;
        char[] nar;
        int sum;
        boolean c6 = false;
        boolean m6 = false;
        boolean sd6 = false;
        while(sc.hasNext()){
            n = sc.nextBigInteger();
            if(n.compareTo(BigInteger.valueOf(0))==0)break;
            c6 = false;
            m6 = false;
            sd6 = false;
            sum = 0;
            nar = n.toString().toCharArray();
            for(int i=0;i<nar.length;i++){
                if(nar[i]=='-')continue;
                if(nar[i]=='6')c6 = true;
                sum = (sum+nar[i]-'0')%6;
            }
            m6 = n.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO);
            sd6 = (sum%6==0);
            if(c6 && m6 && sd6){
                out.println("EVIL");
            }else{
                out.println("GOOD");
            }
        }
        out.close();
    }
    
}


