/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V100;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10071_BackToHighSchoolPhysics {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int v,t;
        while(sc.hasNextInt()){
            v=sc.nextInt();
            t=sc.nextInt();
            out.println(v*2*t);
        }
        out.flush();
    }
}
