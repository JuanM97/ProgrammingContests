/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V111;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P11172_RelationalOperator {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        long a,b;
        while(n-->0){
            a=sc.nextLong();
            b=sc.nextLong();
            if(a<b){
                out.println("<");
            }else{
                if(a==b){
                    out.println("=");
                }else{
                    out.println(">");
                }
            }
        }
        out.flush();
    }
}
