package V11;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1157_uCalculateE {
    static double[]f=new double[10];
    
    public static void f(){
        f[0]=1;
        for(int i=1;i<10;i++){
            f[i]=i*f[i-1];
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int k=10;
        double sum=0;
        f();
        out.println("n e");
        out.println("- -----------");
        for(int i=0; i<k;i++){
            sum+=(1/f[i]);
            if(i>=3){
                out.printf("%d %.9f\n",i,sum);
            }else{
                if(i<2){
                    out.println(i+" "+(int)sum);
                }else{
                    out.println(i+" "+sum);
                }
            }
        }
        out.flush();
    }
}
