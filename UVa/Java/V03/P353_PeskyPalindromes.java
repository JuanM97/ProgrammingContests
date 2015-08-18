/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V03;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashSet;
public class P353_PeskyPalindromes {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static String s;
    static HashSet<String> hs=new HashSet();
    public static boolean isP(String a){
        for(int i=0;i<=a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-i-1))return false;
        }
        return true;
    }
    static int c;
    public static void main(String[]args){
        
        while(sc.hasNext()){
            s=sc.next();
            hs.clear();
            //if(s.equals("-1"))break;
            c=0;
            for(int i=0;i<s.length();i++){
                for(int j=i;j<s.length();j++){
                    if(isP(s.substring(i,j+1))&&!hs.contains(s.substring(i,j+1))){
                        //out.println(s.substring(i,j+1));
                        hs.add(s.substring(i,j+1));
                        c++;
                    }
                }
            }
            out.printf("The string '%s' contains %d palindromes.%n",s,c);
        }
        out.flush();
    }
}
