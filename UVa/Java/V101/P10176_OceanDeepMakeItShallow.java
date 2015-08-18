/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V101;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10176_OceanDeepMakeItShallow {
    static int mod=131071;
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String espacios="\\s+";
        boolean complete=true;
        String s2="";
        while(s!=null && s.length()!=0){
            if(!complete){
                s2+=s.trim().replaceAll(espacios,"");
            }else{
                s2=s.trim().replaceAll(espacios,"");
            }
            if(s2.charAt(s2.length()-1)=='#'){
                complete=true;
                int num=0;
                for(int i=0;s2.charAt(i)!='#' && i<s2.length();i++){
                    num+=(int)s2.charAt(i)-48;
                    num=num<<1;
                    num%=mod;
                }
                if(num==0){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }else{
                complete=false;
            }
            s=sc.nextLine();
        }
        out.flush();
    }
}
