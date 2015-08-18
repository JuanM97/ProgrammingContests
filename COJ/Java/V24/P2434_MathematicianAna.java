/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V24;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2434_MathematicianAna {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    static int p[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
    
    public static int search(int n){
        int i;
        for(i=0;i<p.length;i++){
            if(p[i]>n)break;
        }
        return i;
    }
    
    public static void main(String[]args){
        int n,ix;
        long d;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0)break;
            ix=search(n);
            d=1;
            for(int i=0;i<ix;i++){
                d*=p[i];
            }
            out.println(d);
        }
        out.flush();
    }
}
