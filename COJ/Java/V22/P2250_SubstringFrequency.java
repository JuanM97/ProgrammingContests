/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V22;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P2250_SubstringFrequency {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        int t,ct;
        String a,b;
        t=sc.nextInt();
        for(int cs=1;cs<=t;cs++){
            a=sc.next();
            b=sc.next();
            ct=0;
            for(int i=0;i<a.length()-b.length()+1;i++){
                if(a.substring(i,i+b.length()).equals(b))ct++;
            }
            out.printf("Case %d: %d\n",cs,ct);
        }
        out.flush();
    }
    
}
