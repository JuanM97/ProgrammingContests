/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V07;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P713_AddingRevesedNumbers {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuffer s;
        BigInteger a,b,ans;
        while(t-->0){
            a=new BigInteger(new StringBuffer(sc.next()).reverse()+"");
            b=new BigInteger(new StringBuffer(sc.next()).reverse()+"");
            ans=a.add(b);
            s=new StringBuffer(ans.toString()).reverse();
            ans=new BigInteger(s+"");
            out.println(ans);
        }
        out.flush();
    }
}
