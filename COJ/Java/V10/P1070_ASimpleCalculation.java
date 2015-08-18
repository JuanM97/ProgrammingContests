package V10;

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
public class P1070_ASimpleCalculation {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n,c,r;
        while(sc.hasNextInt()){
            n=sc.nextInt();
            //if(n==0)break;
            c=(n*(n+1)*(2*n+1))/6;
            r=(int)Math.pow((n*(n+1))/2, 2);
            out.println(c+" "+r);
        }
        out.flush();
    }
}
