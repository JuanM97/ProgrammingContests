/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V21;

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P21_QuadraticEquations {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        int i=0,a,b,c;
        while(i++<t){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(b*b>=4*a*c){
                out.println("SI");
            }else{
                out.println("NO");
            }
        }
        out.flush();
    }
}
