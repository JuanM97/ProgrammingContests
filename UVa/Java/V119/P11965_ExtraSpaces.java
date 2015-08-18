/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V119;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P11965_ExtraSpaces {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c;
        String s;
        boolean f=true;
        for(int i=1;i<=t;i++){
            c=sc.nextInt();
            sc.nextLine();
            if(f){
                out.println("Case "+i+":");
                f=false;
            }else{
                out.println("\nCase "+i+":");
            }
            while(c-->0){
                s=sc.nextLine();
                s=s.replaceAll("\\s+"," ");
                out.println(s);
            }
        }
        out.flush();
    }
}
