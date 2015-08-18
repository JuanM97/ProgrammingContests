package V11;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1180_Bijele {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        int k,q,r,b,c,p;
        while(n-->0){
            k=1-sc.nextInt();
            q=1-sc.nextInt();
            r=2-sc.nextInt();
            b=2-sc.nextInt();
            c=2-sc.nextInt();
            p=8-sc.nextInt();
            out.printf("%d %d %d %d %d %d\n",k,q,r,b,c,p);
        }
        out.flush();
    }
}
