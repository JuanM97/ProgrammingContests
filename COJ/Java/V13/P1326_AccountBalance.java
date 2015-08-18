/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V13;

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1326_AccountBalance {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        int n,d;
        while(t-->0){
            d=sc.nextInt();
            n=sc.nextInt();
            while(n-->0){
                if(sc.next().equals("C")){
                    d+=sc.nextInt();
                }else{
                    d-=sc.nextInt();
                }
            }
            out.println(d);
        }
        out.flush();
    }
}
