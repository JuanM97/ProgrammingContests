/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V17;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class P1721_StrangeDialog {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        int n;
        String word,reg="(out|output|puton|in|input|one)*";
        //Pattern regex=Pattern.compile("(out|output|in|puton|input|one)*");
        Matcher m;
        n=sc.nextInt();
        while(n-->0){
            word=sc.next().trim();
            //m=regex.matcher(word);
            //out.printf("%s\n",m.matches()?"YES":"NO");
            out.printf("%s\n",word.matches(reg)?"YES":"NO");
        }
        out.flush();
    }
}
