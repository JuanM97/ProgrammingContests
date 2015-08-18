/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V125;

/**
 *
 * @author JuanM
 */


import java.io.PrintWriter;
import java.util.Scanner;
public class P12543_LongestWord {
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s,sM="";
        int max=-1;
        while(sc.hasNext()){
            s=sc.next();
            if(s.equals("E-N-D"))break;
            if(s.length()>max){
                max=s.length();
                sM=s;
            }
        }
        System.out.println(sM.toLowerCase());
    }
}
