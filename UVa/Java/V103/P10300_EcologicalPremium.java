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
public class P10300_EcologicalPremium {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n,a,b,ans;
        while(t-->0){
            ans=0;
            n=sc.nextInt();
            while(n-->0){
                a=sc.nextInt();
                sc.nextInt();
                b=sc.nextInt();
                ans+=a*b;
            }
            out.println(ans);
        }
        out.flush();
        
    }
}
