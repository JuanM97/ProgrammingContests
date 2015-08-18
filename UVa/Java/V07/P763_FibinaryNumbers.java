/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V07;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P763_FibinaryNumbers {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int max=105;
    static BigInteger[]f=new BigInteger[max];
    
    public static void ff(){
        f[0]=f[1]=BigInteger.ONE;
        for(int i=2;i<max;i++){
            f[i]=f[i-1].add(f[i-2]);
        }
    }
    
    public static BigInteger toD(String a){
        BigInteger ans=BigInteger.ZERO;
        for(int i=a.length()-1;i>=0;i--){
            ans=ans.add(f[a.length()-i].multiply(BigInteger.valueOf((int)a.charAt(i)-'0')));
        }
        return ans;
    }
    
    public static String toF(BigInteger a){
        String s="";
        int d=0;
        d=java.util.Arrays.binarySearch(f,a);
        if(d<0){
            d=Math.abs(d+2);
        }
        for(int j=d;j>0;j--){
            if(f[j].compareTo(a)<=0){
                a=a.subtract(f[j]);
                s=s+"1";
            }else{
                s=s+"0";
            }
        }
        return s;
    }
    
    public static void main(String[]args){
        BigInteger a,b,r,s;
        ff();
        boolean f=true;
        //out.println(java.util.Arrays.toString(f));
        while(sc.hasNext()){
            a=sc.nextBigInteger();
            if(a.compareTo(BigInteger.ZERO)<0)break;
            b=sc.nextBigInteger();
            
            r=toD(a.toString());
            s=toD(b.toString());
            //out.println(r.toString()+" "+s.toString());
            r=r.add(s);
            if(f){
                out.println(toF(r));
                f=false;
            }else{
                out.println();
                out.println(toF(r));
            }
            
        }
        out.flush();
    }
}
