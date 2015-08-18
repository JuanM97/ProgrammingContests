/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V22;

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P2228_MathDare {
    static int maxp=31630000;
    static boolean[] ver=new boolean[maxp+1];
    static long[]primes=new long[6000000];
    
    public static long isInS(long num){
        long n=0;
        for(int i=0;i<solved.length;i++){
            if(solved[i][0]==num){
                n=solved[i][1];
                break;
            }
        }
        return n;
    }
    
    public static long[] sieve(){
        int i,j,k=0;
        if(ver[2]==false){
            primes[k++]=(long)2;
            for(j=2;2*j<maxp;j++){
                ver[2*j]=true;
            }
        }
        for(i=3; i<maxp;i+=2){
            if(ver[i]==false){
                primes[k++]=(long)i;
                for(j=2;i*j<maxp;j++){
                    ver[i*j]=true;
                }
            }
        }
        primes[0]=2;
        return primes;
    }
    static long[][]solved;
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        sieve();
        solved=new long[50][2];
        int t=sc.nextInt();
        long num,ans,r;
        int ind=0;
        while(t-->0){
            ans=1;
            num=sc.nextLong();
            r=num;
            //if((ans=isInS(num))!=0){
            //}else{
                ans=1;
                for(int i=0;num!=1&&primes[i]!=0&&primes[i]*primes[i]<=num;i++){
                    if(num%primes[i]==0){
                        while(num%primes[i]==0){
                            num/=primes[i];
                        }
                        ans*=primes[i];
                    }
                }
                if(num!=1){
                    ans*=num;
                }
                //solved[ind][0]=r;
                //solved[ind++][1]=ans;
            //}
            out.println(ans);
        }
        out.flush();
    }
}
