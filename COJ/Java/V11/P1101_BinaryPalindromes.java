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
public class P1101_BinaryPalindromes {
    static int max=200000;
    static int[]palnd=new int[max+1];
    
    public static boolean isPalindrome(String s){
        boolean isC=true;
        int l=s.length();
        for(int i=0;isC && i<Math.ceil(l/2);i++){
            if(s.charAt(i)==s.charAt(l-i-1)){
                isC=true;
            }else{
                isC=false;
            }
        }
        return isC;
    }
    
    public static void fill(){
        String s;
        palnd[0]=1;
        for(int i=1; i<=max;i++){
            s=Integer.toBinaryString(i);
            if(isPalindrome(s)){
                palnd[i]=1;
            }else{
                palnd[i]=0;
            }
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        fill();
        int n=sc.nextInt();
        int r,s;
        boolean isF;
        while(n-->0){
            r=sc.nextInt();
            s=sc.nextInt();
            isF=true;
            for(int i=r;i<=s;i++){
                if(palnd[i]==1){
                    if(isF){
                        isF=false;
                        out.print(i);
                    }else{
                        out.print(" "+i);
                    }
                }
            }
            out.println();
        }
        //System.out.println(java.util.Arrays.toString(palnd));
        out.flush();
    }
}
