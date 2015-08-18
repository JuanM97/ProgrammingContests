/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V11;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P1197_MegaSearcher {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
     public static void main(String[]args){
        String aa,bb;
        String d1[];
        String d2[];
        long a,b;
        while(sc.hasNext()){
            aa=sc.next();
            if(aa.equals("000"))break;
            bb=sc.next();
            d1=(aa.split("\\."));
            d2=(bb.split("\\."));
            //out.printf("%d ",Long.parseLong(d1[3])<<1);
            a=(Long.parseLong(d1[0])<<24)|(Long.parseLong(d1[1])<<16)|(Long.parseLong(d1[2])<<8)|Long.parseLong(d1[3]);
            b=(Long.parseLong(d2[0])<<24)|(Long.parseLong(d2[1])<<16)|(Long.parseLong(d2[2])<<8)|Long.parseLong(d2[3]);
            out.println(a-b+1);
        }
        out.flush();
    }
    
    /*
    public static void main(String[]args){
        String aa,bb;
        String d1[];
        String d2[];
        int a,b,c,d;
        while(sc.hasNext()){
            aa=sc.next();
            if(aa.equals("000"))break;
            bb=sc.next();
            d1=(aa.split("\\."));
            d2=(bb.split("\\."));
            a=Integer.parseInt(d1[0])-Integer.parseInt(d2[0]);
            b=Integer.parseInt(d1[1])-Integer.parseInt(d2[1]);
            c=Integer.parseInt(d1[2])-Integer.parseInt(d2[2]);
            d=Integer.parseInt(d1[3])-Integer.parseInt(d2[3]);
            out.println((a<<24)+(b<<16)+(c<<8)+(d)+1);
        }
        out.flush();
    }
    */
}
