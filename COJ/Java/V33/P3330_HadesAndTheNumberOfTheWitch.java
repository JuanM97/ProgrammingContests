/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */


import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class P3330_HadesAndTheNumberOfTheWitch{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter (System.out);
    
    public static void main(String[] args) {
        
        int a,b;
        long cont;
        int mod=1000000007;
        char[] s;
        char[] p;
        while(sc.hasNext()){
            a = sc.nextInt();
            if(a<0)break;
            b = sc.nextInt();
            s = sc.next().toCharArray();
            p = sc.next().toCharArray();
            long[][] dp = new long[a][b];
            long index = p.length-1;
            boolean first = true;
            for (int i = s.length-1; i >= 0; i--) {
                for (int j = p.length-1; j >= 0; j--) {
                    if(p[j]==s[i]){                    
                        cont=0;
                        if(i==s.length-1){
                            cont=1;
                        }else{
                            for (int k = j+1; k <= index; k++) {
                                cont+=dp[i+1][k]%mod;
                                cont%=mod;
                                if(dp[i][k]>0){
                                    cont+=dp[i][k]%mod;
                                    cont%=mod;
                                    break;
                                }
                                
                            }
                        }
                        dp[i][j]=cont;
                        if(first){
                            index=j;
                            first=false;
                        }
                    }
                }
                first = true;
                
            }
//            out.println(Arrays.deepToString(dp));
            cont=0;
            for (int i = 0; i < p.length; i++) {
                cont+=dp[0][i]%mod;
                cont%=mod;
            }
            out.println(cont);
            
        }       
        out.close();
        
    }
    
}


