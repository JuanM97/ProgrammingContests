/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V105;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10539_AlmostPrimeNumbers {
    static PrintWriter out=new PrintWriter(System.out);
    static int maxp=1000005;
    static boolean[] ver=new boolean[maxp+1];
    static long[]primes=new long[(int)(Math.ceil(maxp/(Math.log10(maxp)-1))*1.07)];
    
    public static long[] sieve(){
        int i,j,k=0;
        if(ver[2]==false){
            primes[k++]=(long)2;
            for(j=2;2*j<maxp;j++)
                ver[2*j]=true;
        }
        for(i=3; i<maxp;i+=2){
            if(ver[i]==false){
                primes[k++]=(long)i;
                for(j=2;i*j<maxp;j++)
                    ver[i*j]=true;
            }
        }
        primes[0]=2;
        return primes;
    }
    
    public static long getNum(long a, long b){
        long ansM=0, ansm=0;
        boolean isAP=false, unique=true;
        int l=(int)Math.sqrt(a);
        int h=(int)Math.sqrt(b);
        if(a==b){
            for(int i=0;primes[i]<=h;i++){
                if(a%primes[i]==0&&unique){
                    unique=false;
                    while(a%primes[i]==0){
                        a/=primes[i];
                    }
                    if(a==1){
                        return 1;}
                }
            }
        }
        for(int i=0;primes[i]<=h;i++){
            if(primes[i]<=l){
                ansm=ansm+(long)Math.floor(Math.log10(a)/Math.log10(primes[i]))-1;
            }
            ansM=ansM+(long)Math.floor(Math.log10(b)/Math.log10(primes[i]))-1;
        }
        return ansM-ansm;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        sieve();
        int num=sc.nextInt();
        long min,max,aux;
        while(num-->0){
            min=sc.nextLong();
            max=sc.nextLong();
            if(min>max){
                aux=max;
                max=min;
                min=aux;
            }
            out.println(getNum(min,max));
        }
        out.flush();
    }
    
}
