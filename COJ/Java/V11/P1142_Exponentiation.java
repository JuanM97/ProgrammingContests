package V11;

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
import java.math.BigDecimal;
public class P1142_Exponentiation {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        long a=1;long b=3;
        BigDecimal d=BigDecimal.valueOf(a/b);
        System.out.printf("%.10f",d);
    }
}
