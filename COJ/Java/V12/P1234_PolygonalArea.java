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

import java.io.PrintWriter;
import java.util.Scanner;
public class P1234_PolygonalArea {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        double r1,r2,nLados,alpha,area,ap;
        double PI = 3.141592653589793238462643383;
        while(sc.hasNext()){
            r1=sc.nextDouble();
            r2=sc.nextDouble();
            if(r1==0 && r2==0)break;
            alpha = Math.asin(r2/(r1+r2));
            nLados = Math.PI/alpha;
            System.out.println(alpha+" "+(r1+2*r2)/r1+" "+(1+Math.sin(alpha))/(1-Math.sin(alpha)));
            if((r1+2*r2)/r1==(1+Math.sin(alpha))/(1-Math.sin(alpha))){
                ap=Math.sqrt(r1*r1+2*r1*r2);
                area=r2*nLados*ap;
                out.printf("%.4f\n",area);
            }else{
                out.println("No Solution");
            }
            //ap=Math.sqrt(r1*r1+2*r1*r2);
            //area=r2*nLados*ap;
            //out.printf("%.4f\n",area);
        }
        out.flush();
    }
}
