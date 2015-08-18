/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V02;

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P272_TexQuotes {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String s;
        boolean c=true;
        while(sc.hasNext()){
            s=sc.nextLine();
            if(s.equals("0"))break;
            int t=1;
            while(s.contains("\"")){
                if(c){
                    s=s.replaceFirst("\"", "``");
                    c=false;
                }else{
                    s=s.replaceFirst("\"", "''");
                    c=true;
                }
            }
            out.println(s);
        }
        out.flush();
    }
}
