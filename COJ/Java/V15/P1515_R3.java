/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V15;

/**
 *
 * @author JuanManuel
 */
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigDecimal;
public class P1515_R3 {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        double r;
        BigDecimal b,rb;
        while(t-->0){
        	b=sc.nextBigDecimal();
                rb=b.multiply(b).multiply(b).multiply(BigDecimal.valueOf(2)).divide(BigDecimal.valueOf(3),3,BigDecimal.ROUND_HALF_UP);
        	out.println(rb.setScale(3).toString());
        }
        out.flush();
    }
}