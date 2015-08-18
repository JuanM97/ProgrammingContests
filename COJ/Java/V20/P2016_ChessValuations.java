/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V20;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2016_ChessValuations {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static int getP(char c){
        int p=0;
        switch(c){
            case 'P':
                p=1;
                break;
            case 'B':
            case 'N':
                p=3;
                break;
            case 'T':
                p=5;
                break;
            case 'Q':
                p=11;
                break;
            default:
                break;
        }
        return p;
    }
    
    public static int getR(char l,char n){
        int r=0;
        switch(n){
            case '8':
            case '1':
                r=1;
                break;
            case '7':
            case '2':
                if(l=='a'||l=='h'){
                    r=1;
                }else{
                    r=2;
                }
                break;
            case '6':
            case '3':
                if(l=='b'||l=='g'){
                    r=2;
                }else{
                    if(l=='a'||l=='h'){
                        r=1;
                    }else{
                        r=3;
                    }
                }
                break;
            case '5':
            case '4':
                r=(l=='a'||l=='h')?1:(l=='b'||l=='g')?2:(l=='c'||l=='f')?3:4;
                break;
        }
        return r;
    }
    
    public static void main(String[]args){
        int b=0,w=0;
        String l;
        while(sc.hasNextLine()){
            l=sc.nextLine().replaceAll("\\s+","");
            if(l.equals("00"))break;
            if(l.charAt(2)=='B'){
                b+=(getP(l.charAt(3))*getR(l.charAt(0),l.charAt(1)));
            }else{
                w+=(getP(l.charAt(3))*getR(l.charAt(0),l.charAt(1)));
            }
        }
        out.printf("%d %d\n",w,b);
        out.printf("%s",(b>w?"Advantage for black pieces\n":(w>b?"Advantage for white pieces\n":"No decisive advantages\n")));
        out.flush();
    }
}
