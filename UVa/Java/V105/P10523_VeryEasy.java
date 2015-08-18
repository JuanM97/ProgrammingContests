/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V105;

/**
 *
 * @author JuanM
 */


import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P10523_VeryEasy {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n,a;
        BigInteger ans;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0)break;
            a=sc.nextInt();
            ans=BigInteger.ZERO;
            for(int i=1;i<=n;i++){
                ans=ans.add((BigInteger.valueOf(a).pow(i)).multiply(BigInteger.valueOf(i)));
            }
            out.println(ans);
        }
        out.flush();
    }
}
