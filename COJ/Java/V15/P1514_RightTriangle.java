/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V15;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class P1514_RightTriangle {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        int t;
        double b,c,r;
        String num;
        t=sc.nextInt();
        while(t-->0){
            b=sc.nextDouble();
            c=sc.nextDouble();
            r=Math.pow((b*c)/(b+c),2);
            num=String.format("%.4f",r);
            int idx=num.length();
            for(int i=num.length()-1;i>=0;i--){
                if(num.charAt(i)=='0'){
                    idx=i;
                }else{
                    break;
                }
            }
            out.print(num+" ");
            num=num.substring(0,idx);
            r=Double.parseDouble(num);
            out.println(r);
        }
        out.flush();
    }
}
