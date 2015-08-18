/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V100;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P10079_PizzaCutting {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        long n=sc.nextLong();
        
        while(n>=0){
            if(n%2==1){
                out.println(((n+1)/2)*n+1);
            }else{
                out.println(((n)/2)*(n+1)+1);
            }
            n=sc.nextLong();
        }
        out.flush();
    }
    
}
