/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V11;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
public class P1131_Divisors {
    static final int max=10010;
    static int[]p=new int[max];
    static boolean[]b=new boolean[max];
    static int k=0;
    public static void sieve(){
        b[0]=b[1]=true;
        p[k++]=2;
        for(int i=2;i*2<max;i++){
            b[2*i]=true;
        }
        for(int i=3;i<max;i++){
            if(b[i]==false){
                p[k++]=i;
                for(int j=3;i*j<max;j++){
                    b[i*j]=true;
                }
            }
        }
    }
    
    public static HashMap<Integer,Integer>get(int n){
        int nn,c;
        HashMap<Integer,Integer>N=new HashMap<Integer,Integer>();
        int d=0;
        while(n>1){
            nn=n;
            for(int i=0;nn>1&&(nn<=3||p[i]<=nn)&&i<k;i++){
                if(b[nn]==false){
                    if(N.containsKey(nn)){
                        N.put(nn,N.get(nn)+1);
                    }else{
                        N.put(nn,1);
                    }
                    break;
                }else{
                    if(nn%p[i]==0){
                        c=0;
                        while(nn%p[i]==0){
                            c++;
                            nn/=p[i];
                        }
                        if(N.containsKey(p[i])){
                            N.put(p[i],N.get(p[i])+c);
                        }else{
                            N.put(p[i],c);
                        }
                    }
                }
            }
            n--;
        }
        return N;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        sieve();
        //System.out.println(java.util.Arrays.toString(p));
        int n,k;
        long ans;
        HashMap<Integer,Integer> N,K,NK;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n<0)break;
            k=sc.nextInt();
            N=get(n);
            K=get(k);
            NK=get(n-k);
            /*System.out.println(N.toString());
            System.out.println(K.toString());
            System.out.println(NK.toString());*/
            for(int i:K.keySet()){
                N.put(i, N.get(i)-K.get(i));
            }
            for(int i:NK.keySet()){
                N.put(i, N.get(i)-NK.get(i));
            }
            //System.out.println(N.toString());
            ans=1;
            for(int i:N.values()){
                ans*=(i+1);
            }
            out.println(ans);
        }
        out.flush();
    }
}
