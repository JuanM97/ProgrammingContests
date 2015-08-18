/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V14;

/**
 *
 * @author JuanM
 */
import java.util.Scanner;
import java.io.PrintWriter;
public class P1493_GeometricalTaskII {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        String s;
        double a,b;
        while(sc.hasNext()){
            s=sc.next();
            //if(s.equals("0"))break;
            if(s.equals("circle")){
                a=sc.nextDouble();
                out.printf("%.2f\n",a*a*3.14);
            }else{
                a=sc.nextDouble();
                b=sc.nextDouble();
                out.printf("%.2f\n",a*b/2);
            }
        }
        out.flush();
    }
}
