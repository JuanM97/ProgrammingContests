/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V125;

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P12502_ThreeFamilies {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        int i=0,a,b,c;
        while(i++<t){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            out.println(c*(2*a-b)/(a+b));
        }
        out.flush();
    }
}
