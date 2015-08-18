/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P458_TheDecoder {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String coded, decoded;
        while(sc.hasNextLine()){
            decoded="";
            coded=sc.nextLine();
            if(coded.equals("Lol"))break;
            for(int i=0; i<coded.length();i++){
                decoded+=(char)(coded.charAt(i)+'*'-'1');
            }
            out.println(decoded);
        }
        out.flush();
    }
}
