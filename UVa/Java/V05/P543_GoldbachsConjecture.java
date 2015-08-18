/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V05;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;

//Goldbach's Conjecture
public class P543_GoldbachsConjecture {
    
    public static long modularExponentiation(long base, long exp, long mod){
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
            long a=(long)(Math.random()*(n-1))+1;
            if(witness(a,n))
                return false;   //Definitely
        }
        return true;            //Almost sure ... :)
    }
    
    public static void generateGC(int num){
        boolean p=false;
        for(int i=3;i<=1000000;i+=2){
            if(millerRabinIsPrime(3,23) && millerRabinIsPrime(num-i,23)){
                System.out.println(num+" = "+i+" + "+(num-i));
                p=true;
                break;
            }
        }
        if(!p)
            System.out.println("Goldbach's conjecture is wrong.");
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0){
           generateGC(num);
           num=sc.nextInt();
        }
        
    }
    
}
