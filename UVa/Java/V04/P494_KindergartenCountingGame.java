/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.InputStreamReader;
public class P494_KindergartenCountingGame {
    static PrintWriter out=new PrintWriter(System.out);
    
    /*
    public static boolean isWord(String a){
        int cont=0;
        for(int i=0; i<a.length();i++){
            cont+=(int)a.charAt(i);
        }
        if(cont<a.length()*64&&cont<a.length()*123){
            return false;
        }else{
            return true;
        }
    }*/
    
    public static void main(String[]args){
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        boolean word=false;
        String line;
        int cont;
        while(sc.hasNext()){
            line=sc.nextLine().trim();
            
            cont=0;
            for(int i=0; i<line.length();i++){//65-90 o 97-122
                if(((int)line.charAt(i)>=65 && (int)line.charAt(i)<=90) || ((int)line.charAt(i)>=97 && (int)line.charAt(i)<=122)){
                    word=true;
                }else{
                    if(word){
                        cont++;
                        word=false;
                    }
                }
            }
            out.println(cont);
        }
        out.flush();
    }
}
