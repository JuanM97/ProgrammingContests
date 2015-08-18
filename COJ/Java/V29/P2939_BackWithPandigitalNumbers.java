/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V29;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P2939_BackWithPandigitalNumbers {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        int t=sc.nextInt();
        String numB;
        boolean isPm1=false;
        BigInteger num;
        while(t-->0){
            num=sc.nextBigInteger();
            numB=num.toString(2);
            isPm1=true;
            //System.out.println(numB);
            for(int i=numB.length()-1;i>0;i--){
                if(numB.charAt(i)=='0'){
                    isPm1=false;
                    break;
                }
            }
            out.printf("%s\n",isPm1?"NO":"YES");
        }
        out.flush();
    }
}
