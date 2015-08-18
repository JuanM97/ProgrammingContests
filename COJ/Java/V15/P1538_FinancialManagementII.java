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
public class P1538_FinancialManagementII {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t;
        double suma;
        t=sc.nextInt();
        for(int ix=1;ix<=t;ix++){
            suma=0;
            for(int i=0; i<12;i++){
                suma=suma+sc.nextDouble();
            }
            suma/=12.0;
            out.printf("%d $%,.2f%n",ix,suma);
        }
        out.flush();
        out.close();
    }
}
