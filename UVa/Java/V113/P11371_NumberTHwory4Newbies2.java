/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V113;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.InputStreamReader;
public class P11371_NumberTHwory4Newbies2 {
    static PrintWriter out=new PrintWriter(System.out);
    static int[]digits=new int[10];
    
    public static void fill(String s){
        for(int i=0; i<s.length();i++){
            digits[s.charAt(i)-'0']++;
        }
    }
    
    public static String getMax(){
        String a="";
        for(int i=9;i>=0;i--){
            int n=digits[i];
            while(n-->0){
                a+=i;
            }
        }
        return a;
    }
    
    public static String getMin(){
        String a="";
        for(int i=1;i<9;i++){
            if(digits[i]!=0){
                a+=i;
                digits[i]--;
                break;
            }
        }
        for(int i=0;i<10;i++){
            int n=digits[i];
            while(n-->0){
                a+=i;
            }
        }
        return a;
    }
    
    public static void clear(){
        for(int i=0; i<digits.length;i++){
            digits[i]=0;
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String num;
        long max,min, subs;
        while(sc.hasNext()){
            num=sc.next();
            //if(num.equals("0"))break;
            clear();
            fill(num);
            max=Long.parseLong(getMax());
            min=Long.parseLong(getMin());
            subs=max-min;
            out.println(max+" - "+min+" = "+subs+" = 9 * "+subs/9);
        }
        out.flush();
    }
}
