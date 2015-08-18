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
import java.io.PrintWriter;
import java.io.InputStreamReader;
public class P543A_GoldbachsConjecture {
    static int max=1000005;
    static boolean[] primest=new boolean[max];
    static int[]primes=new int[max];
    static int k=0;
    
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
        primes[0]=3;
        primest[0]=primest[1]=true;
    }
    
    public static String generateGC(int num){
        boolean p=true;
        String s="";
        for(int i=0; i<=max;i++){
            if(primest[primes[i]]==false && primest[num-primes[i]]==false){
                s=(num+" = "+primes[i]+" + "+(num-primes[i]));
                p=false;
                break;
            }
        }
        if(p)
            s=("Goldbach's conjecture is wrong.");
        return s;
    }
    
    public static void main(String[]args){
        sieveB();
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int num=sc.nextInt();
        String s;
        //System.out.println(java.util.Arrays.toString(primes));
        //System.out.println(java.util.Arrays.toString(primest));
        while(num!=0){
           s=generateGC(num);
           out.println(s);
           num=sc.nextInt();
        }
        out.flush();
    }
}
