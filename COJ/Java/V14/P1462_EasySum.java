/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V14;

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P1462_EasySum {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        String s,s2;
        int b=0,a=0;
        while(t-->0){
            s=sc.next();
            if(s.length()>3){
                s2=s.substring(s.length()-4,s.length());
            }else{
                s2=s;
            }
            out.print(s2+" ");
            b=Integer.parseInt(s2);
            a=(a+b)%128;
        }
        out.println(a);
        out.flush();
    }
}
