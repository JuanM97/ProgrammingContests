/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V03;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class P357_LetMeCountTheWays {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static int change[] = {1,5,10,25,50};
    static int smx = 30100;
    static long dp[] = new long[smx];
    
    static void calc(){
        dp[0] = 1;
        for(int i=0;i<change.length;i++){
            for(int j=0;j<smx;j++){
                if(j-change[i]>=0){
                    dp[j]+=dp[j-change[i]];
                }
            }
        }
    }
    
    public static void main(String[] args) {
        calc();
        //out.println(Arrays.toString(dp));
        int m = 0;
        while(sc.hasNext()){
            m = sc.nextInt();
            if(m<0)break;
            if(dp[m]==1){
                out.printf("There is only 1 way to produce %d cents change.\n",m);
            }else{
                out.printf("There are %d ways to produce %d cents change.\n",dp[m],m);
            }
        }
        out.flush();
    }
    
}


