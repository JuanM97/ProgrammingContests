/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V27;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class P2789_SumOrder {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        String s;
        String[] num;
        while(sc.hasNext()){
            s=sc.next();
            if(s.equals("0"))break;
            num=s.split("\\+");
            Arrays.sort(num);
            //out.println(Arrays.toString(num));
            out.print(num[0]);
            for(int i=1;i<num.length;i++){
                out.print("+"+num[i]);
            }out.println();
        }
        out.flush();
    }
}
