/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V107;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class P10773_BackToIntermediateMath {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        double d,r,b,ans;
        while(i++<t){
            d=sc.nextDouble();
            r=sc.nextDouble();
            b=sc.nextDouble();
            if(r>=b||r==0||b==0){
                out.printf("Case %d: can't determine%n",i);
            }else{
                ans=(d/b)*(b/Math.sqrt(b*b-r*r)-1);
                out.printf("Case %d: %.3f%n",i,Math.abs(ans));
            }
        }
        out.flush();
    }
}
