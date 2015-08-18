/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V26;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2655_AVION {
    
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        String s[]=new String[6];
        String FBI="FBI";
        boolean isF;
        while(sc.hasNext()){
            for(int i=0;i<5;i++){
                s[i]=sc.next();
            }
            isF=true;
            for(int i=0;i<5;i++){
                if(s[i].contains(FBI)){
                    if(isF){
                        out.print(i+1);
                        isF=false;
                    }else{
                        out.print(" "+(i+1));
                    }
                }
            }
            if(isF){
                out.print("HE GOT AWAY!");
            }
            out.println();
        }
        out.flush();
    }
    
}
