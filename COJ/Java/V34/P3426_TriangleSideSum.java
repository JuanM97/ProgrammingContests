/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V34;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P3426_TriangleSideSum {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        long a,b,m;
        while(sc.hasNext()){
            a = sc.nextLong();
            if(a<0)break;
            b = sc.nextLong();
            m = Math.abs(b-a)+1;
            out.println(((a+b)*(a+b-1) - m*(m-1))/2);
        }
        out.close();
    }
    
}


