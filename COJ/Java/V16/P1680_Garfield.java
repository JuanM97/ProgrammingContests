/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V16;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1680_Garfield {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        String seq,ssq;
        while(sc.hasNext()){
            seq=sc.next();
            if(seq.equals("000"))break;
            ssq=sc.next();
            while(seq.contains(ssq)==true){
                seq=seq.replaceAll(ssq,"");
            }
            out.println(seq);
        }
        out.flush();
    }
}
