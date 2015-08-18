package V10;

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
public class P1099_PythagoreanNumbers {
    
    public static boolean isP(int q, int r, int s){
        boolean isP=false;
        if(q*q+r*r==s*s || q*q+s*s==r*r || r*r+s*s==q*q){
            isP=true;
        }
        return isP;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int a=sc.nextInt();
        
        while(a!=0){
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(isP(a,b,c)){
                out.println("right");
            }else{
                out.println("wrong");
            }
            a=sc.nextInt();
        }
        out.flush();
    }
}
