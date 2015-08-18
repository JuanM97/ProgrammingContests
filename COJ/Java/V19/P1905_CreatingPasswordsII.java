/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V19;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class P1905_CreatingPasswordsII {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    
    public static void main(String[]args){
        int t;
        t=sc.nextInt();
        sc.nextLine();
        String ws[];
        StringBuffer s=new StringBuffer("");
        while(t-->0){
            ws=sc.nextLine().split("\\ +");
            //out.println(Arrays.toString(ws)+" "+ws[1]);
            s.delete(0,s.length());
            s.append(ws[0].substring(0,2));
            //out.println(ws.length-1);
            for(int i=ws.length-1;i>0;i--){
                s.append(ws[i]);
                if(i!=1)s.append("*");
            }
            s.append(ws[0].substring(2,4));
            out.println(s.toString());
        }
        out.flush();
    }
    
}
