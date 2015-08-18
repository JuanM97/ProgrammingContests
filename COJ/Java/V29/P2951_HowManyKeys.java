/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V29;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class P2951_HowManyKeys {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static Set<String> set=new HashSet<String>();
    
    static String toString(char s[]){
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
        return sb.toString();
    }
    
    public static void main(String[]args){
        int n;
        n=sc.nextInt();
        char s[];
        set.clear();
        while(n-->0){
            s=sc.next().toCharArray();
            Arrays.sort(s);
            set.add(toString(s));
            //set.add(Arrays.toString(s));
        }
        out.println(set.size());
        out.flush();
    }
}
