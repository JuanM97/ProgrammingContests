/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V100;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P10035_PrimaryArithmetic {
    static PrintWriter out=new PrintWriter(System.out);
    static int c,count;
    public static void count(String a, String b){
        String max, min;
        int op=0;
        if(a.length()>=b.length()){
            max=a;
            min=b;
        }else{
            max=b;
            min=a;
        }
        //System.out.println(max.length()+" "+min.length());
        for(int i=max.length()-1; i>=0;i--){
            if(i>=max.length()-min.length()){
                op=max.charAt(i)+min.charAt(i-max.length()+min.length())-'0'-'0'+c;
                c=0;
                if(op>=10){
                    count++;
                    c=(op-op%10)/10;
                }
            }else{
                op=max.charAt(i)-'0'+c;
                c=0;
                if(op>=10){
                    count++;
                    c=(op-op%10)/10;
                }
            }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String a,b;
        a=sc.next();
        b=sc.next();
        while(!a.equals("0") || !b.equals("0")){
            c=0;
            count=0;
            count(a,b);
            if(count==0){
                out.println("No carry operation.");
            }else{
                if(count==1){
                    out.println("1 carry operation.");
                }else{
                    out.println(count+" carry operations.");
                }
            }
            a=sc.next();
            b=sc.next();
        }
        out.flush();
    }
}
