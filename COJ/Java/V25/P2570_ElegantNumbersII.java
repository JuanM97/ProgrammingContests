/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V25;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2570_ElegantNumbersII {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        StringBuilder s;
        int a,b;
        while(sc.hasNext()){
            s=new StringBuilder(sc.next());
            //if(s.toString().equals("0"))break;
            a=Integer.parseInt(s.toString());
            b=Integer.parseInt(s.reverse().toString());
            if(b>a){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        out.flush();
    }
}
