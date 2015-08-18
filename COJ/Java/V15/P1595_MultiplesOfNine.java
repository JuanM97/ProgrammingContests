/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V15;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1595_MultiplesOfNine {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static String n;
    
    public static boolean isMult(){
        int c=0;
        for(int i=0;i<n.length();i++){
            c=c+(int)(n.charAt(i)-'0');
        }
        if(c%9==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static int count(int n){
        int d=0;
        String f=Integer.toString(n);
        if(f.length()==1){
            return 1;
        }else{
            int c=0;
            for(int i=0;i<f.length();i++){
                c=c+(int)(f.charAt(i)-'0');
            }
            return 1+count(c);
        }
        
    }
    
    public static void main(String[]args){
        
        while(true){
            int d;
            n=sc.next();
            if(n.charAt(0)=='0')break;
            if(isMult()){
                int c=0;
                for(int i=0;i<n.length();i++){
                    c=c+(int)(n.charAt(i)-'0');
                }
                d=count(c);
                out.printf("%s is a multiple of 9 and has 9-degree %d.\n",n,d);
            }else{
                out.printf("%s is not a multiple of 9.\n",n);
            }
        }
        out.flush();
    }
}
