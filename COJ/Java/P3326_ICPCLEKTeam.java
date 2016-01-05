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
public class P3326_ICPCLEKTeam{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter (System.out);
    
    public static void main(String[] args) {
        
        int T,N;
        String[] s = new String[1100];
        T = sc.nextInt();
        while(T-->0){
            N = sc.nextInt();
            for(int i=0;i<N;i++){
                s[i] = sc.next();
            }
            for(int i=0;i<N-1;i++){
                if(s[i].compareTo(s[i+1])<0)out.print((i+2)+" ");
                else out.print(-1+" ");
            }
            out.println(-1);
        }       
        out.close();
        
    }
    
}


