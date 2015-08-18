/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V16;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P1626_AddingReversedNumbers {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int t=sc.nextInt(),n1,n2;
        StringBuffer a,b;
        while(t-->0){
            a=new StringBuffer(sc.next());
            b=new StringBuffer(sc.next());
            n1=Integer.parseInt(a.reverse().toString());
            n2=Integer.parseInt(b.reverse().toString());
            n1=n1+n2;
            a=new StringBuffer(Integer.toString(n1));
            out.println(Integer.parseInt(a.reverse().toString()));
        }
        out.flush();
    }
}
