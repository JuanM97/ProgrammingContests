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
public class P2686_HelpingNolberto {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner scL=new Scanner(System.in);
        Scanner scw;
        int n;
        boolean isF,antL0;
        String line,word;
        
        n=scL.nextInt();
        scL.nextLine();
        while(n-->0){
            line=scL.nextLine().toUpperCase();
            scw=new Scanner(line);
            isF=true;
            antL0=false;
            while(scw.hasNext()){
                if(!isF&&!antL0){out.printf(" ");}
                if(isF){
                    if(line.charAt(0)==' '){out.printf(" ");}
                }
                isF=false;
                word=scw.next();
                while(word.length()>0&&word.charAt(word.length()-1)=='S'){
                    word=word.substring(0,word.length()-1);
                }
                antL0=false;
                if(word.length()==0){antL0=true;}
                out.printf("%s",word);
            }out.printf("\n");
        }
        out.flush();
        
    }
}
