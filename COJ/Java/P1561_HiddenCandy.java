/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V15;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class P1561_HiddenCandy {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static int smx = 1000100;
    static long sqs[] = new long[smx];
    static boolean pb[] = new boolean[smx];
    static ArrayList<Long> p = new ArrayList();
    static void sieve(){
        pb[0] = true;
        pb[1] = true;
        for(int i=4;i<smx;i+=2){
            pb[i] = true;
        }
        p.add(2L);
        for(int i=3;i<smx;i+=2){
            if(!pb[i]){
                p.add((long)i);
                for(int j=i+i;j<smx;j+=i){
                    pb[j] = true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        sieve();
        for(int k = 0;k<p.size();k++){
            sqs[(int)k] = p.get(k)*p.get(k);
        }
        //out.println(p.size()+" "+p.get(p.size()-1));
        //for(int i=0;i<10;i++)out.println(sqs[i]);
        int Q, ctM, ctm;
        Q = sc.nextInt();
        long a, b;
        while(Q-->0){
            ctM = 0;
            ctm = 0;
            a = sc.nextLong();
            b = sc.nextLong();
            while(sqs[ctM++]<=b);
            while(sqs[ctm++]<=(a-1));
            //out.println(ctM+" "+ctm);
            out.println(ctM-ctm);
        }
        out.close();
    }
    
}

