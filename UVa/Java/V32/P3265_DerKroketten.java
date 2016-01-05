/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V32;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P3265_DerKroketten {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        String line[];
        
        while(sc.hasNext()){
            line = sc.nextLine().trim().split(" ");
            if(line[0].equals("-1"))break;
            boolean isFirst = true;
            for(String s : line){
                if(s.toLowerCase().equals("kroketten"))out.print(isFirst?"croqueta":" croqueta");
                else out.print(isFirst?s:" "+s);
                if(isFirst) isFirst = false;
            }
            out.println();
        }
        out.close();
        
    }
    
}


