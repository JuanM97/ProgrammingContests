/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V103;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P10303_HowManyTrees {
    static int max=1003;
    static BigInteger[] cn=new BigInteger[max];
    
    public static void fcn(){
        BigInteger d=new BigInteger("2");
        BigInteger c=new BigInteger("4");
        cn[0]=cn[1]=BigInteger.ONE;
        for(int i=1;i<max-1;i++){
            cn[i+1]=(c.multiply(BigInteger.valueOf(i)).add(d)).multiply(cn[i]).divide(d.add(BigInteger.valueOf(i)));
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        fcn();
        int t;
        //System.out.println(java.util.Arrays.toString(cn));
        while(sc.hasNext()){
            t=sc.nextInt();
            //if(t<0)break;
            out.println(cn[t]);
        }
        out.flush();
    }
}
