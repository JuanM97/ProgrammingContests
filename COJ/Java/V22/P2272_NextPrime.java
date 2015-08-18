/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V22;
/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P2272_NextPrime {
    static final int max=1000000;
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
    
    public static boolean isP(long n){
        for(int i=0;p[i]*p[i]<=n&&i<k;i++){
            if(n%p[i]==0){
                return false;
            }
        }
        return true;
    }
    
    public static long getNP(long n){
        if(n<max&&p[k-1]>n){
            if(b[(int)n]==false){
                return n;
            }else{
                for(long i=n+1;i<max;i++){
                    if(b[(int)i]==false){
                        return i;
                    }
                }
            }
        }else{
            for(long i=n;;i++){
                if(isP(i)){
                    return i;
                }
            }
        }
        return n;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        sieve();
        int t=sc.nextInt();
        long num;
        while(t-->0){
            num=sc.nextLong();
            out.println(getNP(num));
        }
        out.flush();
    }
}
