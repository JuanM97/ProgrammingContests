/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V31;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
public class P3152_DigitalDisplay {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashMap<Byte,String[]> hm = new HashMap<>();
    static String[] uno =  {"    +","    |","    |","    +","    |","    |","    +"};
    static String[] dos =  {"+---+","    |","    |","+---+","|    ","|    ","+---+"};
    static String[] tres = {"+---+","    |","    |","+---+","    |","    |","+---+"};
    static String[] cuatro={"+   +","|   |","|   |","+---+","    |","    |","    +"};
    static String[] cinco= {"+---+","|    ","|    ","+---+","    |","    |","+---+"};
    static String[] seis = {"+---+","|    ","|    ","+---+","|   |","|   |","+---+"};
    static String[] siete= {"+---+","    |","    |","    +","    |","    |","    +"};
    static String[] ocho = {"+---+","|   |","|   |","+---+","|   |","|   |","+---+"};
    static String[] nueve= {"+---+","|   |","|   |","+---+","    |","    |","+---+"};
    static String[] cero = {"+---+","|   |","|   |","+   +","|   |","|   |","+---+"};
    static String[] puntos={" "," ","o"," ","o"," "," "};
    
    public static void main(String[]args){
        hm.put((byte)'0',cero);hm.put((byte)'1',uno);hm.put((byte)'2',dos);
        hm.put((byte)'3',tres);hm.put((byte)'4',cuatro);hm.put((byte)'5',cinco);
        hm.put((byte)'6',seis);hm.put((byte)'7',siete);hm.put((byte)'8',ocho);
        hm.put((byte)'9',nueve);hm.put((byte)':',puntos);
        String d;
        d=sc.next();
        while(!d.equals("end")){
            for(int i=0;i<7;i++){
                out.printf("%s  %s  %s  %s  %s\n",hm.get((byte)d.charAt(0))[i],hm.get((byte)d.charAt(1))[i],
                        hm.get((byte)d.charAt(2))[i],hm.get((byte)d.charAt(3))[i],hm.get((byte)d.charAt(4))[i]);
            }
            out.printf("\n\n");
            d=sc.next();
        }
        out.println("end");
        out.flush();
    }
}
