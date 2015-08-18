/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P488_TriangleWave {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void wave(int l){
        for(int i=1;i<=l;i++){
            for(int j=1;j<=i;j++){
                out.print(i);
            }
            out.println();
        }
        for(int i=l-1;i>0;i--){
            for(int j=1;j<=i;j++){
                out.print(i);
            }
            out.println();
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m,fr;
        boolean f=true;
        while(t-->0){
            m=sc.nextInt();
            fr=sc.nextInt();
            for(int i=0;i<fr;i++){
                if(f){
                    wave(m);
                    f=false;
                }else{
                    out.println();
                    wave(m);
                }
            }
            
        }
        out.flush();
    }
}
