/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V109;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.BufferedOutputStream;
import java.util.Scanner;
import java.util.HashMap;
public class P10921_FindTheTelephone {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), true);
    
    public static void main(String[]args){
        HashMap<String,Integer> phone = new HashMap();
        phone.put("A",2);phone.put("B",2);phone.put("C",2);
        phone.put("D",3);phone.put("E",3);phone.put("F",3);
        phone.put("G",4);phone.put("H",4);phone.put("I",4);
        phone.put("J",5);phone.put("K",5);phone.put("L",5);
        phone.put("M",6);phone.put("N",6);phone.put("O",6);
        phone.put("P",7);phone.put("Q",7);phone.put("R",7);phone.put("S",7);
        phone.put("T",8);phone.put("U",8);phone.put("V",8);
        phone.put("W",9);phone.put("X",9);phone.put("Y",9);phone.put("Z",9);
        String line;
        while(sc.hasNext()){
            line = sc.nextLine().trim();
            for(int i=0;i<line.length();i++){
                if(phone.containsKey(line.charAt(i)+"")){
                    out.print(phone.get(line.charAt(i)+""));
                }else{
                    out.print(line.charAt(i));
                }
            }out.println();
        }
        out.flush();
        
    }
}


