package V15;

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
public class P1506_ExamGrader {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        String ex=sc.next();
        String c;
        int num=sc.nextInt();
        double calif;
        while(num-->0){
            calif=0;
            c=sc.next();
            for(int i=0; i<n;i++){
                if(c.charAt(i)=='#'){
                }else{
                    if(c.charAt(i)==ex.charAt(i)){
                        calif+=1;
                    }else{
                        calif-=0.25;
                    }
                }
            }
            out.printf("%.2f\n",calif);
        }
        out.flush();
    }
}
