/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V114;

/**
 *
 * @author JuanM
 */
/*
 *If the number has only one prime factor (like 25 is composed of just 5s), this program
 * will print -1 :)
 */
import java.util.Scanner;
import java.io.PrintWriter;
public class P11466C_LargestPrimeDivisor {
    static PrintWriter out=new PrintWriter(System.out);
    static int max=10001000;
    static boolean[]ver=new boolean[max];
    static long[]primes=new long[max];
    
    public static int sieve(){
        int i,j,k=0;
        for(i=2; i<max;i++){
            if(ver[i]==false){
                primes[k++]=(long)i;
                for(j=2;i*j<max;j++)
                    ver[i*j]=true;
            }
        }
        primes[0]=2;
        return k;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean isNegative;
        int i,j,divcount, plim=sieve();
        long num, lastdiv;
        num=sc.nextLong();
        while(num!=0){
            isNegative=false;
            if(num<0){
                num*=(-1);
                isNegative=true;
            }
            divcount=0;
            lastdiv=-1;
            for(i=0;i<plim&&num>1&&primes[i]<=num;i++){
                if(num%primes[i]==0){
                    divcount++;
                    while(num>1&&num%primes[i]==0){
                        num/=primes[i];
                    }
                    lastdiv=primes[i];
                }
                if(num==1)
                    break;
            }
            if(num==1){
                if(divcount>1)
                    out.println(lastdiv);
                else
                    out.println(-1);
            }else{
                if(divcount>0)
                    out.println(num);
                else
                    out.println(-1);
            } 
            num=sc.nextLong();
        }
        out.flush();
    }
    
}
