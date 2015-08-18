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

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
public class P2708_FalseSenseOfSecurity {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashMap<String,String> mm = new HashMap<>();
    static HashMap<String,String> mmr = new HashMap<>();
    static int smx = 1010;
    /*
    A .-   H .... O ---  V ...-
    B -... I ..   P .--. W .--
    C -.-. J .--- Q --.- X -..-
    D -..  K -.-  R .-.  Y -.--
    E .    L .-.. S ...  Z --..
    F ..-. M --   T -
    G --.  N -.   U ..-
    */
    public static void main(String[]args){
        String enc;
        StringBuffer conv=new StringBuffer("");
        StringBuffer dec=new StringBuffer("");
        int lengs[] = new int[smx];
        
        mm.put("A",".-"); mm.put("B","-..."); mm.put("C","-.-."); mm.put("D","-..");
        mm.put("E","."); mm.put("F","..-."); mm.put("G","--."); mm.put("H","....");
        mm.put("I",".."); mm.put("J",".---"); mm.put("K","-.-"); mm.put("L",".-..");
        mm.put("M","--"); mm.put("N","-."); mm.put("O","---"); mm.put("P",".--.");
        mm.put("Q","--.-"); mm.put("R",".-."); mm.put("S","..."); mm.put("T","-");
        mm.put("U","..-"); mm.put("V","...-"); mm.put("W",".--"); mm.put("X","-..-");
        mm.put("Y","-.--"); mm.put("Z","--..");
        mm.put("_","..--"); mm.put(".","---."); mm.put(",",".-.-"); mm.put("?","----");
        
        mmr.put(".-","A"); mmr.put("-...","B"); mmr.put("-.-.","C"); mmr.put("-..","D");
        mmr.put(".","E"); mmr.put("..-.","F"); mmr.put("--.","G"); mmr.put("....","H");
        mmr.put("..","I"); mmr.put(".---","J"); mmr.put("-.-","K"); mmr.put(".-..","L");
        mmr.put("--","M"); mmr.put("-.","N"); mmr.put("---","O"); mmr.put(".--.","P");
        mmr.put("--.-","Q"); mmr.put(".-.","R"); mmr.put("...","S"); mmr.put("-","T");
        mmr.put("..-","U"); mmr.put("...-","V"); mmr.put(".--","W"); mmr.put("-..-","X");
        mmr.put("-.--","Y"); mmr.put("--..","Z");
        mmr.put("..--","_"); mmr.put("---.","."); mmr.put(".-.-",","); mmr.put("----","?");
        
        while(sc.hasNext()){
            enc=sc.next();
            if(enc.equals("0"))break;
            for(int i=0;i<lengs.length;i++)lengs[i]=0;
            conv.delete(0,conv.length());
            dec.delete(0,dec.length());
            for(int i=0;i<enc.length();i++){
                conv.append(mm.get(enc.charAt(i)+""));
                lengs[i]=mm.get(enc.charAt(i)+"").length();
            }
            //System.out.println(conv.toString());
            //System.out.println(Arrays.toString(lengs));
            for(int i=0,idx=0;i<enc.length();i++){
                dec.append(mmr.get(conv.substring(idx,idx+lengs[enc.length()-i-1])));
                idx+=lengs[enc.length()-i-1];
            }
            out.println(dec.toString());
        }
        out.flush();
        
    }
    
}
