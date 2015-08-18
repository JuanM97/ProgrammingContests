/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V28;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2815_EasyStringProblem {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int t,cnt;
        t=sc.nextInt();
        String s,c;
        while(t-->0){
            s=sc.next();
            c=sc.next();
            cnt=0;
            while(s.contains(c)){
                s=s.replace(c,"");
                cnt++;
            }
            out.println(cnt);
        }
        out.flush();
    }
}


