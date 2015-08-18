package V11;

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
public class P1140_TheNextPalindrome {
    
    
    public static String getPalindrome(String s){
        String a="";
        String b="";
        int k=0;
        int l=s.length();
        if(l==1){
            return s;
        }else{
            if(l==2){
                if(s.charAt(0)>s.charAt(1)){
                    a=s.charAt(0)+""+s.charAt(0);
                    return a;
                }else{
                    int n=s.charAt(0)-'0'+1;
                    a=n+""+n;
                    return a;
                }
            }else{
                if(l==3){
                    if(s.charAt(0)>s.charAt(2)){
                        a=s.substring(0,2)+s.charAt(0);
                        return a;
                    }else{
                        int n=s.charAt(1)-'0'+1;
                        a=s.charAt(0)+""+n+s.charAt(0);
                        return a;
                    }
                }
            }
        }
        if(l%2==1){
            for(int i=0;i<(l-1)/2;i++){
                a=a+s.charAt(i);
                b=s.charAt(i)+b;
            }
            if(s.charAt(0)>s.charAt(l-1)){
                    k=s.charAt((l-1)/2)-'0';
            }else{
                    k=s.charAt((l-1)/2)-'0'+1;
            }
            a=a+""+k+""+b;
            return a;
        }else{
            for(int i=0;i<(l-2)/2;i++){
                a=a+s.charAt(i);
                b=s.charAt(i)+b;
            }
            if(s.charAt(0)>s.charAt(l-1)){
                    k=s.charAt((l-1)/2)-'0';
            }else{
                    k=s.charAt((l-1)/2)-'0'+1;
            }
            a=a+""+k+""+b;
            return a;
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        String a,b;
        while(n-->0){
            a=sc.next();
            b=getPalindrome(a);
            out.println(b);
        }
        out.flush();
    }
}
