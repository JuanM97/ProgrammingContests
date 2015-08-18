/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V05;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P583_PrimeFactors {
    
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
    
    public static String getP(long n){
        int num=(int)n;
        boolean isN=false;
        boolean first=true;
        boolean gotPrimes=false;
        String s=n+" = ";
        if(n<0){
            isN=true;
            s+="-1 x ";
            n*=-1;
            num*=-1;
        }
        
        if(n+1<max && primest[num]==false){
                if(isN){
                    s+=n;
                }else{
                    s+=n;
                }
        }else{
            for(int i=0;primes[i]!=0 && i<n;i++){
                if(n%primes[i]==0){
                    while(n%primes[i]==0){
                        if(first){
                            s+=primes[i];
                            n/=primes[i];
                            gotPrimes=true;
                            first=false;
                        }else{
                        s=s+" x " +primes[i];
                        n/=primes[i];
                        gotPrimes=true;
                        }
                    }
                }
            }
            if(n!=1){
                s=s+" x " +n;
            }
            if(!gotPrimes){
                s+=n;
            }
        }
        return s;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        sieveB();
        long num=sc.nextLong();
        while(num!=0){
            out.println(getP(num));
            num=sc.nextLong();
        }
        out.flush();
    }
    
}
