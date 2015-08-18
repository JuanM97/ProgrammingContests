/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V21;

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P2127_QuiteAProblem {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String s;
        while(sc.hasNext()){
            s=sc.nextLine().toLowerCase();
            if(s.equals("miau"))break;
            if(s.contains("problem")){
                out.println("yes");
            }else{
                out.println("no");
            }
        }
        out.flush();
    }
    
}
