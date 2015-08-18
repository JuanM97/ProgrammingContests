/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V27;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2775_LATIN {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int t;
        t=sc.nextInt();
        char a1,a2;
        String s;
        while(t-->0){
            s=sc.next();
            if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
                s=s+"cow";
            }else{
                s=s.substring(1)+s.charAt(0)+"ow";
            }
            out.println(s);
        }
        out.flush();        
    }
}

