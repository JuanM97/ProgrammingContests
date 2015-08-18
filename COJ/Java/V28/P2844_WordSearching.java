/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V28;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P2844_WordSearching {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        String word,line;
        int ct=0;
        word=sc.next();
        while(sc.hasNext()){
            line=sc.nextLine();
            if(line.equals("000"))break;
            for(int i=0;i<line.length()-word.length()+1;i++){
                if(line.substring(i,i+word.length()).equals(word)) ct++;
            }
        }
        out.println(ct);
        out.flush();
    }
    
}

