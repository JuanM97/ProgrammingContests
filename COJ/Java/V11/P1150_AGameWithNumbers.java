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
public class P1150_AGameWithNumbers {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String a;
        int n=1000;
        while(n-->0){
            a=sc.next();
            if(a.charAt(a.length()-1)!='0'){
                out.println("1");
                out.println(a.charAt(a.length()-1));
            }else{
                out.println("2");
            }
            /*if(n>0){
                out.println();
            }*/
        }
        out.flush();
    }
}
