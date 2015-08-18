/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P414_MachinedSurfaces {
    static int[]a;
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        String s;
        int c,ind,cm;
        while(true){
            int t=sc.nextInt();
            if(t==0)break;
            sc.nextLine();
            a=new int[t];
            cm=25;
            ind=0;
            while(t-->0){
                s=sc.nextLine().trim();
                c=0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)==' '){
                        c++;
                    }
                }
                a[ind++]=c;
                if(c<cm){
                    cm=c;
                }
            }
            c=0;
            //System.out.println(java.util.Arrays.toString(a));
            for(int i=0;i<a.length;i++){
                c+=(a[i]-cm);
            }
            out.println(c);
        }
        out.flush();
    }
    
}
