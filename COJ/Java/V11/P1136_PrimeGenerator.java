package V11;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1136_PrimeGenerator {
    
    static final int max=40000;
    static boolean[] primest=new boolean[max];
    static int[]primes=new int[max];
    static int k=1;
    
    public static void sieveB(){
        int i,j;
        for(int m=2;m*2<max;m++){
            primest[m*2]=true;
        }
        for(i=3; i<max;i++){
            if(primest[i]==false){
                primes[k++]=i;
                for(j=3;i*j<max;j++){
                    primest[i*j]=true;
                }
            }
        }
        primes[0]=2;
        primest[0]=primest[1]=true;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        sieveB();
        int t,N,M;
        
        t = sc.nextInt();
        while(t-->0){
            /*if (t > 0){
                out.println();
            }*/
            
            M = sc.nextInt();
            N = sc.nextInt();
            
            if (M < 2){
                M = 2;
            }
            
            boolean[] isprime = new boolean[100001];
            for (int j = 0; j < 100001; j++) {
                isprime[j] = true;
            }
            
            for (int i = 0; i < k; i++) {
                int p = primes[i];
                //System.out.println(p);
                int ini;
                
                if (p >= M){
                    ini = p*2;
                }else{
                    ini = M + ((p - M % p)%p);
                }
                
                for (int j = ini; j <= N; j += p) {
                    isprime[j - M] = false;
                }
            }

            for (int i = M; i <= N; i++) {
                if(isprime[i-M]){
                    out.println(i);
                }
            }
            //if(t>0){
                out.println();
            //}
        }
        out.flush();
    }
}
