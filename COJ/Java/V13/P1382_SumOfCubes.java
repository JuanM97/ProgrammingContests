/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V13;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1382_SumOfCubes {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static long a,b,mod=1000007,rs;
    static int smx=1000010;
    static int t,ia,ib;
    static long cubes[]=new long[smx];
    static long cubesS[]=new long[smx];
    static double getB(){
        //return (unsigned long long int)pow(b,1./3.);
        return Math.pow(b,1./3.);
    }
    
    public static void main(String[]args){
        cubes[0]=0;
        cubesS[0]=0;
        for(long i=1;i<1000010;i++){
            cubes[(int)i]=(((i%mod*i%mod)%mod)*i%mod)%mod;
            cubesS[(int)i]=(((cubesS[(int)i-1]%mod+cubes[(int)i])%mod)+mod)%mod;
        }
        t=sc.nextInt();
        while(t-->0){
            a=sc.nextLong();
            b=sc.nextLong();
            ia=(int)Math.ceil(Math.pow(a,1f/3));            
            ib=(int)Math.pow(b,1f/3);
            rs=(cubesS[ib]%mod-cubesS[ia-1]%mod)%mod;
            out.printf("%d\n",(rs+mod)%mod);
        }
        out.flush();
    }
}
/*
4
1 10
27 27
1 1000000000000000000
1000000000000000000 1000000000000000000
*/