/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P3323_EvenNumberOfDivisors {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        long a,b;
        while(sc.hasNext()){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0&&b==0)break;
            out.println((b-(long)Math.sqrt(b))-((a-1)-(long)Math.sqrt(a-1)));
        }
        out.close();
    }
    
}

