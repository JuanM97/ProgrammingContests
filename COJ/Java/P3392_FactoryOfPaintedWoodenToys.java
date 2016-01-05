/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P3392_FactoryOfPaintedWoodenToys {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter (System.out);
    
    public static void main(String[] args) {
        
        int N;
        
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N==0)break;
            if(N==1)out.println(0);
            else out.println(12*(N-2));
        }       
        out.close();
        
    }
    
}


