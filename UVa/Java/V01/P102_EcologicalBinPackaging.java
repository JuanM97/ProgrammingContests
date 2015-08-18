/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P102_EcologicalBinPackaging {
    static PrintWriter out=new PrintWriter(System.out);
    static long[]bins=new long[9];
    static long[]sum=new long[6];
    static String[]order={"BCG","BGC","CBG","CGB","GBC","GCB"};
    
    //Order: BGC
    public static String ans(){
        sum[0]=bins[3]+bins[6]+bins[2]+bins[8]+bins[1]+bins[4]; //BCG
        sum[1]=bins[3]+bins[6]+bins[1]+bins[7]+bins[2]+bins[5]; //BGC
        sum[2]=bins[5]+bins[8]+bins[0]+bins[6]+bins[1]+bins[4]; //CBG
        sum[3]=bins[5]+bins[8]+bins[1]+bins[7]+bins[0]+bins[3]; //CGB
        sum[4]=bins[2]+bins[4]+bins[5]+bins[6]+bins[0]+bins[7]; //GBC
        sum[5]=bins[0]+bins[2]+bins[3]+bins[4]+bins[7]+bins[8]; //GCB
        
        long min=sum[0];
        int ind=0;
        for(int i=1;i<sum.length;i++){
            if(min>sum[i]){
                ind=i;
                min=sum[i];
            }
        }
        String ans=order[ind]+" "+min;
        return ans;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        long[]ans;
        while(sc.hasNextLong()){
            for(int i=0; i<9;i++){
                bins[i]=sc.nextLong();
            }
            String a=ans();
            out.println(a);
        }
        out.flush();
    }
}
