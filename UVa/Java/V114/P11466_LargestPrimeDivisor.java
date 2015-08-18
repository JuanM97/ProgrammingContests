/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V114;

/**
 *
 * @author JuanM
 */

//Largest Prime Divisor

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashMap;
public class P11466_LargestPrimeDivisor {
    static PrintWriter out = new PrintWriter(System.out);
    
    /**********************************/
    //Primality Test
    
    public static Long modularExponentiation(Long base, Long exp, Long mod){
        String ps=Long.toBinaryString(exp);
        long c=0;
        long d=1;
        for(int i=0; i<ps.length();i++){
            c=2*c;
            d=(d*d)%mod;
            if(ps.charAt(i)=='1'){
                c++;
                d=(d*base)%mod;
            }
        }
        return d;
    }
    
    public static long[]getNums(long n){
        long u=0;
        long t=0;
        long d=1;
        for(long i=1;i<=n/2 && d<=n/2;i++){
            if(n%d==0){
                t=i;
            }
            d*=2;
        }
        u=(long)(n/Math.pow(2,t));
        long[]ans={t,u};
        return ans;
    }
    
    public static boolean witness(long a, long n){
        long[]arr=getNums(n);
        long t=arr[0];
        long u=arr[1];
        long x=modularExponentiation(a,u,n);
        long x2=0;
        for(int i=1; i<=t;i++){
            x2=(x*x)%n;
            if(x2==1 && x!=1 && x!=n-1)
                return true;
            x=x2;
        }
        if(x2!=1)
            return true;
        return false;
    }
    
    public static boolean millerRabinIsPrime(long n, long s){
        for(int j=1; j<=s;j++){
            long a=(long)((Math.random()*(n-1))+1);
            if(witness(a,n))
                return false;   //Definitely
        }
        return true;            //Almost sure ... :)
    }
    
    /**********************************/
    
    public static HashMap<Long, Long> getMap(long size){
        HashMap<Long,Long> primes = new HashMap<Long, Long>();
        primes.put(2L, 1L);
        for(long i=3L;i*i<=size;i+=2){
            if(millerRabinIsPrime(i,2))
                primes.put(i,1L);
        }
        return primes;
    }
    
    public static int getTable(int n){
        int max=n;
        long[]primes=new long[n];
        boolean[] ver=new boolean[n];
        int i,j,k=0;
        for(i=2; i<max;i++){
            if(ver[i]==false){
                primes[k++]=(long)i;
                for(j=2;i*j<=max;j++)
                    if(i*j<n)
                        ver[i*j]=true;
            }
        }
        primes[0]=2;
        return k;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /*Long num=sc.nextLong();
        HashMap<Long, Long> primes=getMap(99999999999999L);
        
        while(num!=0){
            if(millerRabinIsPrime(num,3))
                out.println("-1");
            else{
                out.println();
            }
            num=sc.nextLong();
        }
        out.flush();*/
        System.out.println(getTable(20));
    }
    
}
