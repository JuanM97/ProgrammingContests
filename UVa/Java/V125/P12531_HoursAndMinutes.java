/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V125;

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P12531_HoursAndMinutes {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int h;
        while(sc.hasNext()){
            h=sc.nextInt();
            //if(h<0)break;
            if(h%6==0){
                out.println("Y");
            }else{
                out.println("N");
            }
        }
        out.flush();
    }
}
