/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V114;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class P11462_AgeSort {
    static int[] d;
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t;
        boolean f;
        while(true){
            t=sc.nextInt();
            if(t==0)break;
            d=new int[101];
            for(int i=0;i<t;i++){
                d[sc.nextInt()]++;
            }
            f=true;
            for(int i=1;i<101;i++){
                for(int j=0;j<d[i];j++){
                    if(f){
                        f=false;
                        out.print(i);
                    }else{
                        out.print(" "+i);
                    }
                }
            }
            out.println();
        }
        out.flush();        
    }
    
}
