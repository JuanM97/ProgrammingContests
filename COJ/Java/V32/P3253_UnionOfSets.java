/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V32;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashSet;
public class P3253_UnionOfSets {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashSet<Integer>set = new HashSet<>();
    public static void main(String[]args){
        int t,c;
        while(sc.hasNext()){
            set.clear();
            t=sc.nextInt();
            if(t==0)break;
            while(t-->0){
                c=sc.nextInt();
                while(c-->0){
                    set.add(sc.nextInt());
                }
            }
            out.println(set.size());
        }
        out.flush();
    }
}
