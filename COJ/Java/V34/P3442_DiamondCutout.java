/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V34;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P3442_DiamondCutout {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String s = "";
        char[]ar;
        int k;
        while(sc.hasNext()){
            s = sc.next();
            if(s.equals("-1"))break;
            if(s.length()%2==0){
                out.println("error");
                continue;
            }
            ar = s.toCharArray();
            out.println(s);
            k = s.length()/2;
            for(int i=0;i<s.length()/2;i++){
                for(int j=0;j<s.length();j++){
                    if(j<k || j>=s.length()-k) out.print(ar[j]);
                    else out.print(" ");
                }out.println();
                k--;
            }
            k+=2;
            for(int i=0;i<s.length()/2;i++){
                for(int j=0;j<s.length();j++){
                    if(j<k || j>=s.length()-k) out.print(ar[j]);
                    else out.print(" ");
                }out.println();
                k++;
            }
            
        }
        out.close();
    }
    
}


