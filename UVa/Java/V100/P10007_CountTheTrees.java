/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V100;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P10007_CountTheTrees {
    static int max=303;
    static BigInteger[] cn=new BigInteger[max];
    static BigInteger[] fct=new BigInteger[2*max];
    
    public static void fct(){
        fct[0]=fct[1]=BigInteger.ONE;
        for(int i=2;i<fct.length;i++){
            fct[i]=fct[i-1].multiply(BigInteger.valueOf(i));
        }
    }
    
    public static void c(){
        BigInteger d=BigInteger.valueOf(2);
        BigInteger c=BigInteger.valueOf(4);
        cn[0]=cn[1]=BigInteger.ONE;
        for(int i=2;i<max-1;i++){
            cn[i]=fct[2*i].divide(fct[i+1]);
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t;
        fct();
        c();
        //System.out.println(java.util.Arrays.toString(cn));
        while(true){
            t=sc.nextInt();
            if(t==0)break;
            out.println(cn[t]);
        }
        out.flush();        
    }
}
