/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V05;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P516_PrimeLand {
    static PrintWriter out=new PrintWriter(System.out);
    static int max=32767;
    static boolean[] primest=new boolean[max];
    static long[]primes=new long[(int)(Math.ceil(max/(Math.log(max)-1))*1.07)];
    static int k=0;
    
    public static long[] sieveB(){
        int i,j;
        for(i=2; i<max;i++){
            if(primest[i]==false){
                primes[k++]=(long)i;
                for(j=2;i*j<max;j++){
                    primest[i*j]=true;
                }
            }
        }
        primes[0]=2;
        primest[0]=primest[1]=true;
        return primes;
    }
    
    public static long getNum(String[]s){
        long num=1;
        for(int i=0; i<s.length;i+=2){
            num*=Math.pow(Integer.parseInt(s[i]), Integer.parseInt(s[i+1]));
        }
        return num;
    }
    
    public static String factors(long n){
        String s="";
        boolean first=true;
        int cont=0;
        if(!primest[(int)n]){
            return s+=n+" 1";
        }
        for(int i=0;i*i<n;i++){
            if(n%primes[i]==0){
                cont=0;
                while(n%primes[i]==0){
                    cont++;
                    n/=primes[i];
                }
                if(first){
                    first=false;
                    s=primes[i]+" "+cont+s;
                }else{
                    s=primes[i]+" "+cont+" "+s;
                }
            }
        }
        if(n!=1){
            s=n+" 1 "+s;
        }
        return s;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String espacios="\\s+";
        String s=sc.nextLine();
        String s2;
        String[]s3;
        long num;
        
        sieveB();
        
        while(true){
            if(s.length()==1 && Integer.parseInt(s)==0){
                break;
            }
            
            s2=s.trim().replaceAll(espacios, " ");
            s3=s2.split(espacios);
            num=getNum(s3)-1;
            out.println(factors(num));
            s=sc.nextLine();
        }
        out.flush();
        
    }
}
