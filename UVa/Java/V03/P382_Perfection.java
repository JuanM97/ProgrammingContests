/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V03;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P382_Perfection {
    static String[]l={"DEFICIENT","PERFECT","ABUNDANT"};
    /*
    static final int max=60015;
    static boolean[]b=new boolean[max];
    static int[]primes=new int[(int)(Math.ceil(max/(Math.log(max)-1))*1.07)];
    static int k;
    
    public static void primes(){
        k=1;
        for(int i=2;i*2<max;i++){
            b[i*2]=true;
        }
        for(int i=3; i<max;i++){
            if(b[i]==false){
                primes[k++]=i;
                for(int j=3;i*j<max;j++){
                    b[i*j]=true;
                }
            }
        }
        primes[0]=2;
        b[0]=b[1]=true;
    }
    */
    public static int sumOfD(int n){
        int sumD=1;
        if(n==1){
            return 0;
        }
        int aux,n2;
        for(int i=2;i<n;i++){
            if(n%i==0){
                sumD+=i;
            }
        }
        return sumD;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        //primes();
        int n=sc.nextInt();
        int s;
        String le;
        out.println("PERFECTION OUTPUT");
        while(n!=0){
            s=sumOfD(n);
            if(s<n){
                le=l[0];
            }else{
                if(s==n){
                    le=l[1];
                }else{
                    le=l[2];
                }
            }
            out.printf("%5d  %s\n",n,le);
            n=sc.nextInt();
        }
        out.println("END OF OUTPUT");
        out.flush();
    }
}
