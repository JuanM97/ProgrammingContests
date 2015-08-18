package V12;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1226_FactoringLargeNumbers {
    
    static PrintWriter out=new PrintWriter(System.out);
    static int max=1000000;
    static boolean[] primest=new boolean[max];
    static long[]primes=new long[(int)(Math.ceil(max/(Math.log(max)-1))*1.07)];
    
    public static long[] sieveB(){
        int i,j,k=0;
        for(i=2; i<max;i++){
            if(primest[i]==false){
                primes[k++]=(long)i;
                for(j=2;i*j<max;j++){
                    primest[i*j]=true;
                }
            }
        }
        primes[0]=2;
        primest[0]=primest[1]=true;
        return primes;
    }
    
    public static void getP(long n){
        for(int i=0;primes[i]!=0 && i<n;i++){
            if(n%primes[i]==0){
                while(n%primes[i]==0){
                    out.printf("    %d\n",primes[i]);
                    n/=primes[i];
                }
            }
        }
        if(n!=1){
            out.printf("    %d\n",n);
        }
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        sieveB();
        boolean isF=true;
        long num=sc.nextLong();
        while(num>=0){
            if(isF){
                getP(num);
                isF=false;
                out.println();
            }else{
                //out.println();
                getP(num);
                out.println();
            }
            num=sc.nextLong();
        }
        out.flush();
        
    }
}
