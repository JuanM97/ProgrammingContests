package V10;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1000_ApB {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int a,b;
        while(sc.hasNextInt()){
            a=sc.nextInt();
            //if(a==0)break;
            b=sc.nextInt();
            out.println(a+b);
        }
        out.flush();
    }
}
