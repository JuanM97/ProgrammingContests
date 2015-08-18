/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V104;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10469_ToCarryOrNotToCarry {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int a,b;
        while(sc.hasNext()){
            a=sc.nextInt();
            //if(a==-1)break;
            b=sc.nextInt();
            out.println(a^b);
        }
        out.flush();
    }
}
