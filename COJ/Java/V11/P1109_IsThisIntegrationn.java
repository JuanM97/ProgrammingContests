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
public class P1109_IsThisIntegrationn {
    static double b=0.3151470535897;
    static double a=0.28539816;
    static double d=0.0216943;
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        double n;
        double j,k,l;
        while(sc.hasNextDouble()){
            n=sc.nextDouble();
            if(n==0)break;
            double area=n*n;
            j=b*area;
            k=(4*a-2*b)*area;
            l=8*d*area;
            out.printf("%.3f %.3f %.3f\n",j,k,l);
        }
        out.flush();
        
    }
}
