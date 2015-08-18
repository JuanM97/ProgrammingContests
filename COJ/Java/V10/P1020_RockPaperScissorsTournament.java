/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V10;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1020_RockPaperScissorsTournament {
    
    static int s2i(String j){
        if(j.equals("rock")) return 0;
        if(j.equals("paper")) return 1;
        return 2;
    }
    
    static int rps(int j1, int j2){
        return (j1-j2+3)%3;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int ganados[] = new int[110];
        int perdidos[] = new int[110];
        int n,k,j1,j2,ju1,ju2,res;
        
        n=sc.nextInt();
        while(n!=0){
            k=sc.nextInt();
            for(int i=0;i<n*(n-1)*k/2;i++){
                j1=sc.nextInt();
                ju1=s2i(sc.next());
                j2=sc.nextInt();
                ju2=s2i(sc.next());
                //res = rps(ju1,ju2);
                res = (ju1-ju2+3)%3;
                if(res==1){
                    ganados[j1]++;
                    perdidos[j2]++;
                }
                else if(res==2){
                    ganados[j2]++;
                    perdidos[j1]++;
                }
            }
            for(int i=1;i<=n;i++){
                if(ganados[i]+perdidos[i]==0)out.println("-");
                else out.printf("%.3f\n",(ganados[i]/((float)ganados[i]+perdidos[i])));
            }
            n=sc.nextInt();
            if(n!=0) out.println();
            for(int i=0;i<110;i++){
                ganados[i]=0;
                perdidos[i]=0;
            }
        }
        out.flush();
    }
}


/*
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

*/
