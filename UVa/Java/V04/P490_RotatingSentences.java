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
public class P490_RotatingSentences {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int mx = 110, idx = 0, mxLen = 0;
    static char sentences[][] = new char[mx][mx];
    
    public static void rotate(){
        for(int j=0;j<mxLen;j++){
            for(int i=idx-1;i>=0;i--){
                out.print(sentences[i][j]);
            }out.println();
        }
    }
    
    public static void main(String[]args){
        String line;
        for(int ix=0;ix<mx;ix++){
            for(int j=0;j<mx;j++){
                sentences[ix][j] = ' ';
            }
        }
        while(sc.hasNext()){
            line = sc.nextLine().trim();
            if(line.equals("p"))break;
            for(int j=0;j<line.length();j++){
                sentences[idx][j] = line.charAt(j);
                mxLen = Math.max(mxLen,line.length());
                //System.out.print(sentences[idx][j]);
            }//System.out.println();
            idx++;
        }
        /*for(int ix=0;ix<5;ix++){
            for(int j=0;j<40;j++){
                out.print(sentences[ix][j]+" ");
            }out.println();
        }*/
        rotate();
        out.flush();
        
    }
}


