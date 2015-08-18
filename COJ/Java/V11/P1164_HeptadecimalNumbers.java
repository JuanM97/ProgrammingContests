/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V11;

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;
public class P1164_HeptadecimalNumbers {
    public static PrintWriter out=new PrintWriter(System.out);
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[]args){
        String a,b;
        BigInteger n,m;
        while(true){
            a=sc.next();
            b=sc.next();
            if(a.equals("*")&&b.equals("*"))break;
            n=new BigInteger(a,17);
            m=new BigInteger(b,17);
            //out.printf(n.toString()+" "+m.toString());
            if(n.equals(m)){
                out.printf("=\n");
            }else{
                if(n.compareTo(m)>0){
                    out.printf(">\n");
                }else{
                    out.printf("<\n");
                }
            }
        }
        out.flush();
        
    }
    
}


/*
    static String a,b;
    
    public static void trimm(){
        int idx=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                idx++;
            }else{
                continue;
            }
        }
        a=a.substring(idx);
        idx=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='0'){
                idx++;
            }else{
                continue;
            }
        }
        b=b.substring(idx);
    }
    
    public static void compare(){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(i)){
                out.println(">");
                break;
            }else{
                if(a.charAt(i)<b.charAt(i)){
                    out.println("<");
                    break;
                }
            }
        }
    }
    
    public static void main(String[]args){
        
        while(sc.hasNext()){
            a=sc.next().toUpperCase();
            b=sc.next().toUpperCase();
            if(a.equals("*")&&b.equals("*"))break;
            trimm();
            //System.out.println(a+" "+b);
            if(a.length()>b.length()){
                out.println(">");
            }else{
                if(a.length()<b.length()){
                    out.println("<");
                }else{
                    if(a.equals(b)){
                        out.println("=");
                    }else{
                        compare();
                    }
                }
            }
        }
        out.flush();
    }
    */