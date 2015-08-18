package V12;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1238_FactorialAgain {
    static long[] fact=new long[7];
    
    public static void ff(){
        fact[0]=1;
        for(int i=1;i<fact.length;i++){
            fact[i]=fact[i-1]*i;
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        ff();
        String n;
        long s;
        while(true){
            s=0;
            n=sc.next();
            if(n.equals("0"))break;
            for(int i=0;i<n.length();i++){
                s=s+(n.charAt(i)-'0')*fact[n.length()-i];
            }
            out.println(s);
        }
        out.flush();
    }
}
