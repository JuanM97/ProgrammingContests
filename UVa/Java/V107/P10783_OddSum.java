/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V107;

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P10783_OddSum {
    static PrintWriter out=new PrintWriter(System.out);
    static int[]sum=new int[51];
    
    public static void fill(){
        for(int i=1;i<sum.length;i++){
            sum[i]=sum[i-1]+2*i-1;
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int tc=sc.nextInt();
        int a,b,max,min,extra,cases=1;
        fill();
        while(tc-->0){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b){
                max=a;
                min=b;
            }else{
                max=b;
                min=a;
            }
            if(min%2==1){
                extra=min;
            }else{
                extra=0;
            }
            out.println("Case "+cases++ +": "+(sum[(max+1)/2]-sum[(min+1)/2]+extra));
        }
        out.flush();
    }
}
