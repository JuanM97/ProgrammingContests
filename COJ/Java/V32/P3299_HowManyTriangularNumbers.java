/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V32;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P3299_HowManyTriangularNumbers {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static long m(long a){
        return (-1+(long)Math.sqrt(1+8*a))/2;        
    }
    
    public static void main(String[] args) {
        long a,b;
        while(sc.hasNext()){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0 && b==0)break;
            out.println(m(b)-m(a-1));
        }
        out.close();
    }
    
}


