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
public class P1198_PrimeGap {
    
    static final int max=1300000;
    static boolean[] primest=new boolean[max];
    //static int[]primes=new int[max];
    static int k=1;
    
    public static void sieveB(){
        int i,j;
        for(int m=2;m*2<max;m++){
            primest[m*2]=true;
        }
        for(i=3; i<max;i++){
            if(primest[i]==false){
                //primes[k++]=i;
                for(j=3;i*j<max;j++){
                    primest[i*j]=true;
                }
            }
        }
        //primes[0]=2;
        primest[0]=primest[1]=true;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n,c;
        sieveB();
        boolean r,l;
        
        while(true){
            n=sc.nextInt();
            if(n==0)break;
            c=2;
            r=l=true;
            if(primest[n]==false){
                c=0;
                l=r=false;
            }else{
                for(int i=1;l||r;i++){
                    if(l&&primest[n-i]==true){
                        c++;
                    }else{
                        if(l){
                            l=false;
                        }
                    }
                    if(r&&primest[n+i]==true){
                        c++;
                    }else{
                        if(r){
                            r=false;
                        }
                    }
                }
            }
            out.println(c);
        }
        out.flush();
    } 
}
