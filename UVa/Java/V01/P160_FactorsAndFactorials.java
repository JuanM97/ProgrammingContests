/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P160_FactorsAndFactorials {
    static int mx = 110;
    static int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};    
    static int[][] table = new int[primes.length][mx];
    static int[][] sumT = new int[primes.length][mx];
    
    public static void getFactorials(){
        int num = 0;
        for(int i=1;i<mx;i++){
            num = i;
            for(int j=0;j<primes.length;j++){
                while(num>1 && num>=primes[j] && num%primes[j]==0){
                    num/=primes[j];
                    table[j][i]++;
                }
            }
        }
        for(int i=1;i<mx;i++){
            for(int j=0;j<primes.length;j++){
                sumT[j][i] = sumT[j][i-1]+table[j][i];
            }
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n;
        getFactorials();
        /*for(int i=0;i<10;i++){
            out.println(i+": ");
            for(int j=0;j<primes.length;j++){
                out.print(table[j][i]+" ");
            }out.println();
        }
        for(int i=0;i<10;i++){
            out.println(i+": ");
            for(int j=0;j<primes.length;j++){
                out.print(sumT[j][i]+" ");
            }out.println();
        }*/
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n==0)break;
            out.printf("%3d! =",n);
            for(int i=0;i<primes.length;i++){
                if(sumT[i][n]==0)break;
                if(i!=0 && i%15==0)out.printf("%n      ");
                out.printf("%3d",sumT[i][n]);
            }out.println();
        }
        out.flush();
    }
}


