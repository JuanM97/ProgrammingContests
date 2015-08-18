/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V29;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class P2995_WhatDoesTheFoxSay {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        String sounds,line,ss[];
        List<String>ls;
        int t=0;
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            sounds=sc.nextLine();
            ss=sounds.split("\\s+");
            ls=new LinkedList<String>(Arrays.asList(ss));
            do{
                line=sc.nextLine();
                ss=line.split("\\s+");
                while(ls.contains(ss[2])){
                    ls.remove(ss[2]);
                }
            }while(!line.equals("what does the fox say?"));
            if(!ls.isEmpty()){
                out.print(ls.get(0));
                for(int i=1;i<ls.size();i++){
                    out.print(" "+ls.get(i));
                }
            }
            out.println();
        }
        out.flush();
    }
    
}
