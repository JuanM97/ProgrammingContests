/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V102;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P10220_ILoveBigNumbers {
    static int k;
    static BigInteger[] a=new BigInteger[1001];
    
    public static void f(){
        a[0]=BigInteger.ONE;
        for(int i=1;i<a.length;i++){
            a[i]=a[i-1].multiply(BigInteger.valueOf(i));
        }
    }
    
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        f();
        int n,sum;
        String s;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n<0)break;
            sum=0;
            s=a[n].toString();
            for(int i=0;i<s.length();i++){
                sum+=(s.charAt(i)-'0');
            }
            out.println(sum);
        }
        out.flush();
    }
}
