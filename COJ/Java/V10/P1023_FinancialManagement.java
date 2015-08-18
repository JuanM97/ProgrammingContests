package V10;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1023_FinancialManagement {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int[]a=new int[12];
        double suma=0;
        for(int i=0; i<12;i++){
            suma+=sc.nextDouble();
        }
        double ans=suma/12;
        System.out.printf("$%.2f",ans);
    }
}