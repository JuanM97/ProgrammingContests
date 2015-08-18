/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V16;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
public class P1601_SequencesOfDigits {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static LinkedList<Integer> nl = new LinkedList<>();
    public static void main(String[]args){
        int t;
        int or[] = new int[10];
        int rev[] = new int[10];
        t=sc.nextInt();
        while(t-->0){
            nl.clear();
            for(int i=0;i<10;i++){
                nl.add(i);
                or[i]=sc.nextInt();
            }
            for(int i=0;i<10;i++){
                rev[i]=nl.get(nl.size()-or[9-i]-1);
                nl.remove(nl.size()-or[9-i]-1);
            }
            out.print(rev[9]);
            for(int i=1;i<10;i++){
                out.print(" "+rev[9-i]);
            }out.println();
            
        }
        out.flush();
    }
    
}
