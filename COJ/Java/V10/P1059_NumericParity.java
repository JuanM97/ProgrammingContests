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
public class P1059_NumericParity {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        Integer n=sc.nextInt();
        String s;
        int count;
        while(n!=0){
            count=0;
            s=n.toBinaryString(n);
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            out.printf("The parity of %s is %d (mod 2).\n",s,count);
            n=sc.nextInt();
        }
        out.flush();
    }
}
