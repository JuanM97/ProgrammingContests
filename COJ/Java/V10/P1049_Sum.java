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
public class P1049_Sum {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt(),n2;
        while(sc.hasNext()){
            if(n==0)break;
            if(n>=0){
                out.println((n*(n+1))/2);
            }else{
                n2=Math.abs(n);
                out.println(-1*((n2*(n2+1))/2-1));
            }
            n=sc.nextInt();
        }
        out.flush();
    }
}
