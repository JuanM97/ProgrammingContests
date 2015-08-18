/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V17;

/**
 *
 * @author JuanM
 */


import java.io.PrintWriter;
import java.util.Scanner;
public class P1717_PrimePath {
    static final int max=10010;
    static int[]p=new int[max];
    static boolean[]b=new boolean[max];
    static int k=0;
    public static void sieve(){
        b[0]=b[1]=true;
        p[k++]=2;
        for(int i=2;i*2<max;i++){
            b[2*i]=true;
        }
        for(int i=3;i<max;i++){
            if(b[i]==false){
                p[k++]=i;
                for(int j=3;i*j<max;j++){
                    b[i*j]=true;
                }
            }
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        sieve();
        int t=sc.nextInt();
        int pi, pf;
        while(t-->0){
            pi=sc.nextInt();
            pf=sc.nextInt();
        }
        out.flush();
    }
}
