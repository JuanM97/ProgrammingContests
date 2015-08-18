/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V103;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P10338_MischievousChildren {
    static PrintWriter out=new PrintWriter(System.out);
    static long[] fact=new long[30];
    
    public static void facts(){
        fact[0]=1;
        for(int i=1; i<fact.length;i++){
            fact[i]=fact[i-1]*i;
        }
    }
    
    public static long countDb(String s){
        long ans=factorial(s.length());
        int[] let=new int[26];
        for(int i=0; i<s.length();i++){
            let[s.charAt(i)-'A']++;
        }
        for(int i=0; i<let.length;i++){
            for(int j=1; j<=let[i];j++){
                ans/=j;
            }
        }
        return ans;
    }
    
    
    public static long factorial(int num){
        if(num<fact.length && fact[num]!=0){
            return fact[num];
        }else{
            if(num==0 || num== 1){
                return 1;
            }else{
                return num*factorial(num-1);
            }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        facts();
        int c=1;
        int num=sc.nextInt();
        String s;
        for(int i=0; i<num;i++){
            s=sc.next();
            out.println("Data set " +c++ +": "+countDb(s));
        }
        out.flush();
    }
}
