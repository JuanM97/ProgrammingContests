/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V26;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class P2634_BirthdayStatistics {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int n;
        String date[]=new String[3];
        int month[]=new int[14];
        n=sc.nextInt();
        
        while(n-->0){
            sc.next();
            date=sc.next().split("/");
            //System.out.println("H: " +Arrays.toString(date));
            month[Integer.parseInt(date[1])]++;
        }
        for(int i=1;i<13;i++){
            out.println(i+" "+month[i]);
        }
        out.flush();
    }
}
