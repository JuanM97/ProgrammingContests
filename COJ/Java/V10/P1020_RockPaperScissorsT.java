/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V10;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1020_RockPaperScissorsT {
    static int[]w=new int[130];
    static int s;
    
    public static void match(int a, String sa, int b, String sb){
        if(!sa.equals(sb)){
            if((sa.equals("rock")&&sb.equals("scissors"))||(sa.equals("paper")&&sb.equals("rock"))||
                    (sa.equals("scissors")&&sb.equals("paper"))){
                w[a-1]++;
            }else{
                w[b-1]++;
            }
            s++;
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n,num,m,nm;
        double r;
        int msf,tm;
        boolean isF=true;
        while(true){
            n=sc.nextInt();
            num=n;
            if(n==0)break;
            m=sc.nextInt();
            nm=m;
            s=0;
            msf=0;
            tm=m*n*(n-1)/2;
            while(msf++<tm){
                match(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
            }
            if(!isF){
                out.println();
            }
            if(s==0){
                int j=0;
                while(j++<num){
                    out.printf("-\n");
                }
            }else{
                for(int i=0;i<num;i++){
                    out.printf("%.3f\n",((double)w[i]/s));
                }
            }
            isF=false;
            for(int i=0;i<130;i++)w[i]=0;
        }
        out.flush();
    }
}
