/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V102;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class P10235_SimplyEmirp {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 1000100;
    static boolean[] pb = new boolean[smx];
    
    static void dp(){
        pb[0] = true;
        pb[1] = false;
        for(int i=4;i<smx;i+=2){
            pb[i] = true;
        }
        for(int i=3;i<smx;i+=2){
            if(!pb[i]){
                for(int j=i+i;j<smx;j+=i){
                    pb[j] = true;
                }
            }
        }
    }
    
    static int getRev(int n){
        int nr = 0;
        while(n>0){
            nr = nr*10+(n%10);
            n/=10;
        }
        return nr;
    }
    
    public static void main(String[] args) {
        dp();
        //System.out.println(Arrays.toString(Arrays.copyOfRange(pb,0,15)));
        int n = 0, nr = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n<0)break;
            if(pb[n]){
                out.printf("%d is not prime.%n",n);
            }else{
                nr = getRev(n);
                //out.println("nr:"+nr);
                if(!pb[n] && !pb[nr] && n!=nr) out.printf("%d is emirp.%n",n);
                else out.printf("%d is prime.%n",n);
            }
        }
        out.close();
    }
    
}

