package V16;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1654_FindingPowers {
    
    public static int modularExponentiation(int base, int exp, int mod){
        String ps=Long.toBinaryString(exp);
        int c=0;
        int d=1;
        for(int i=0; i<ps.length();i++){
            c=2*c;
            d=(d*d)%mod;
            if(ps.charAt(i)=='1'){
                c++;
                d=(d*base)%mod;
            }
        }
        return d;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int x,m,y;
        int c=-1;
        boolean isF;
        while(true){
            isF=true;
            x=sc.nextInt();
            m=sc.nextInt();
            y=sc.nextInt();
            if(x==0 && m==0 && y==0){
                break;
            }
            for(int i=0; i<m;i++){
                int ym=y%m;
                if(modularExponentiation(i,x,m)==ym){
                    if(isF){
                        out.print(i);
                        isF=false;
                    }else{
                        out.print(" "+i);
                    }
                }
            }
            if(isF){
                out.print(-1);
            }
            out.println();
        }
        out.flush();
    }
}
