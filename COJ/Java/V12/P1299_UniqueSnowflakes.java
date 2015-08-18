/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V12;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashSet;
public class P1299_UniqueSnowflakes {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[]args){
        HashSet<Integer> snf = new HashSet();
        int t,n,ct,ctmax;
        int nums[] = new int[1000100];
        t=sc.nextInt();
        
        while(t-->0){
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            ctmax=-1;
            for(int i=0;i<n;i++){
                snf.clear();
                ct=0;
                for(int j=i;j<n;j++){
                    if(!snf.add(nums[j]))break;
                    ct++;
                }
                if(ct>ctmax)ctmax=ct;
            }
            out.println(ctmax);
        }
        out.flush();
        
    }
    
}
