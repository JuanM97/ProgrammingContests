package V10;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1013_PerfectPthPowers {
    static int max=100000;
    static boolean[] b=new boolean[max];
    static long[]p=new long[(int)(Math.ceil(max/(Math.log(max)-1))*1.07)];
    
    public static void sieve(){
        int k=1;
        for(int i=2;2*i<max;i++){
            b[2*i]=true;
        }
        for(int i=3; i<max;i+=2){
            if(b[i]==false){
                p[k++]=(long)i;
                for(int j=2;i*j<max;j++){
                    b[i*j]=true;
                }
            }
        }
        p[0]=2;
        b[0]=b[1]=true;
    }
    
    public static int count(long a){
        long n=Math.abs(a);
        int c=0;
        int cD=0;
        if(n<max){
            if(b[(int)n]==false){
                return 1;
            }
        }
        for(int i=0; p[i]>0 && i<max && cD<2;i++){
            if(n%p[i]==0){
                cD++;
                while(n%p[i]==0 && cD<2){
                    n/=p[i];
                    c++;
                }
            }
        }
        if(cD==0 || cD>=2){
            return 1;
        }
        if(a>0){
            return c;
        }else{
            if(a<0 && c%2==1){
                return c;
            }else{
                return 1;
            }
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        sieve();
        long n=sc.nextLong();
        while(n!=0){
            out.println(count(n));
            n=sc.nextLong();
        }
        out.flush();
    }
}
