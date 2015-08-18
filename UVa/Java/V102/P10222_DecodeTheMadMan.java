/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V102;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10222_DecodeTheMadMan {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void getM(String s){
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case ' ':    out.printf(" "); break;
                case 'a':
                case 'A':     out.printf("["); break;
                case 's':
                case 'S':     out.printf("]"); break;
                case 'z':
                case 'Z':     out.printf("'"); break;
                case 'x':
                case 'X':     out.printf("\\"); break;
                case 'e':
                case 'E':     out.printf("q"); break;
                case 'r':
                case 'R':     out.printf("w"); break;
                case 't':
                case 'T':     out.printf("e"); break;
                case 'y':
                case 'Y':     out.printf("r"); break;
                case 'u':
                case 'U':     out.printf("t"); break;
                case 'i':
                case 'I':     out.printf("y"); break;
                case 'o':
                case 'O':     out.printf("u"); break;
                case 'p':
                case 'P':     out.printf("i"); break;
                case '[':     out.printf("o"); break;
                case ']':     out.printf("p"); break;
                case 'd':
                case 'D':     out.printf("a"); break;
                case 'f':
                case 'F':     out.printf("s"); break;
                case 'g':
                case 'G':     out.printf("d"); break;
                case 'h':
                case 'H':     out.printf("f"); break;
                case 'j':
                case 'J':     out.printf("g"); break;
                case 'k':
                case 'K':     out.printf("h"); break;
                case 'l':
                case 'L':     out.printf("j"); break;
                case ';':     out.printf("k"); break;
                case '\\':    out.printf(";"); break;
                case 'c':
                case 'C':     out.printf("z"); break;
                case 'v':
                case 'V':     out.printf("x"); break;
                case 'b':
                case 'B':     out.printf("c"); break;
                case 'n':
                case 'N':     out.printf("v"); break;
                case 'm':
                case 'M':     out.printf("b"); break;
                case ',':     out.printf("n"); break;
                case '.':     out.printf("m"); break;
                case '/':     out.printf(","); break;
                case 'q':
                case 'Q':
                case 'w':
                case 'W':
                case '{':
                case '}':
                case ':':
                case '"':
                case '|':
                case '<':
                case '>':
                case '?':       break;
                default :
                                out.printf("l");
                                break;
            }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=1;
        String s;
        while(sc.hasNextLine()){
            s=sc.nextLine();
            //if(s.equals("LLLL"))break;
            getM(s);
            out.println();
        }
        out.flush();
    }
}
