/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V03;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.HashMap;
public class P369_Combinations {
    static PrintWriter out=new PrintWriter(System.out);
    static long[] factorial=new long[22];
    
    public static void initFact(){
        factorial[0]=1;
        factorial[1]=1;
        for(int i=2;i<factorial.length;i++){
            factorial[i]=factorial[i-1]*i;
        }
    }
    
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    
    public static long combinations(int n, int m){
        long ans=1L;
        boolean c=false;
        int min,max,rest;
        long amin,g;
        max=(n-m)<=m?m:(n-m);
        min=(n-m)<=m?(n-m):m;
        //System.out.println(max+" "+min);
        rest=max+1;
        amin=1;
        for(int i=rest,j=0;i<=n && j<min;j++,i++){
            ans*=i;
            if(!c){
                if((min-j)<=21){
                    amin*=factorial[min-j];
                    c=true;
                }else{
                    amin*=(min-j);
                }
            }
            g=gcd(ans,amin);
            //System.out.println(ans+" "+amin+" "+g);
            ans/=g;
            amin/=g;
        }
        
        return ans;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        initFact();
        int n,m;
        
        while(sc.hasNextInt()){
            n=sc.nextInt();
            m=sc.nextInt();
            if(n==0 && m==0){
                break;
            }
            out.println(n+" things taken " +m +" at a time is " +combinations(n,m)+" exactly.");
        }
        out.flush();
    }
}
