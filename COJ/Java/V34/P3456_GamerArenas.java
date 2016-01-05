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
import java.util.Arrays;
import java.util.Scanner;
public class P3456_GamerArenas {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int smx = 50;
    static int[] count = new int[smx];
    public static void main(String[] args) {
        int T = sc.nextInt();
        sc.nextLine();
        char[] a;
        char[] b;
        boolean ang;
        while(T-->0){
            a = sc.nextLine().toCharArray();
            if(a[0]=='-')break;
            b = sc.nextLine().toCharArray();
            //out.println(Arrays.toString(a)+" "+Arrays.toString(b));
            for(int i=0;i<smx;i++)count[i] = 0;
            for(int i=0;i<a.length;i++){
                if(a[i]>='a' && a[i]<='z')count[a[i]-'a']++;
            }
            //out.println(Arrays.toString(count));
            for(int i=0;i<b.length;i++){
                if(b[i]>='a' && b[i]<='z')count[b[i]-'a']--;
            }
            //out.println(Arrays.toString(count));
            ang = true;
            for(int i=0;i<smx;i++){
                if(count[i]!=0){
                    ang = false;
                    break;
                }
            }
            out.println(ang?"yes":"no");
        }
        out.close();
    }
    
}


