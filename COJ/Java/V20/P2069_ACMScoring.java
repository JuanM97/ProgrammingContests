/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V20;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;
public class P2069_ACMScoring {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[]args){
        int t,time,n,tt,np,ttr;
        int dur[]=new int[20];
        t=sc.nextInt();
        
        while(t-->0){
            time=sc.nextInt();
            n=sc.nextInt();
            tt=0;np=0;
            for(int i=0;i<n;i++){
                dur[i]=sc.nextInt();
            }
            Arrays.sort(dur,0,n);
            //for(int i=0;i<n;i++)out.print(dur[i]+" ");
            tt=5;
            np=0;
            ttr=0;
            while(np<n && (tt+dur[np])<=time){
                tt+=dur[np];
                ttr+=tt;
                np++;
            }
            out.printf("%d %d\n",np,ttr);
        }
        out.flush();
    }
    
}

