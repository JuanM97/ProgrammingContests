/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V06;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P694_TheCollatzSequence {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[]args){
        long A,a,lim;
        int ct=0,csN=1;
        while(sc.hasNext()){
            A=sc.nextLong();
            a=A;
            lim=sc.nextLong();
            if(a==-1 && lim==-1)break;
            ct=0;
            while(a>1 && a<=lim){
                ct++;
                a=((a%2==1)?(3*a+1):(a>>1));
                //System.out.println(a);
            }
            ct=(a==1)?ct+1:ct;
            out.printf("Case %d: A = %d, limit = %d, number of terms = %d%n",csN++,A,lim,ct);
        }
        out.flush();
    }
}


