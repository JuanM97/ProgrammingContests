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
public class P1051_Div3 {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        long n,ans;
        
        while(sc.hasNextLong()){
            n=sc.nextLong();
            if(n==0)break;
            ans=(2*(n-1)/3)+(n-1)%3;
            out.println(ans);
        }
        out.flush();
    }
}
