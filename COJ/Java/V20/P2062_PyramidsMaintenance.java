package V20;

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
public class P2062_PyramidsMaintenance {
    
    public static double getL(double q, double t){
        double b=q;
        double ang=t*Math.PI/180;
        double k=(b*Math.tan(Math.PI/3))/(2*Math.tan(ang));
        double h=k*Math.tan(ang);
        double ans=Math.sqrt(k*k+h*h);
        return ans;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        double q, r,ans;
        while(n-->0){
            q=sc.nextDouble();
            r=sc.nextDouble();
            ans=getL(r,q);
            out.printf("%.4f\n",ans);
        }
        out.flush();
    }
}
