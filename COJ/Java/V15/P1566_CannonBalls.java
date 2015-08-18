package V15;

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
public class P1566_CannonBalls {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        int ans;
        while(n!=0){
            ans=(n*(n+1)*(2*n+1))/6;
            out.println(ans);
            n=sc.nextInt();
        }
        out.flush();
    }
}
