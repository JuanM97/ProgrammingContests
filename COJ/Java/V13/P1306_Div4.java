package V13;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1306_Div4 {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        String b,sb;
        int c;
        while(n-->0){
            b=sc.next();
            if(b.length()>=2){
                sb=b.substring(b.length()-2,b.length());
            }else{
                sb=b;
            }
            //System.out.println(sb);
            c=Integer.parseInt(sb);
            if(c%4==0){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        out.flush();
    }
}
