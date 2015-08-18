/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V10;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1006_CipheringPrograms {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static StringBuilder lineR;
    static StringBuilder line;
    
    public static void decode(int l,int u){
        int mid=(int)((l+u)/2);
        if(mid<l||mid>u||mid<0)return;
        lineR.append((char)((int)line.charAt(mid)));
        decode(l,mid-1);
        decode(mid+1,u);
    }
    
    public static void main(String[]args){
        line=new StringBuilder();
        lineR=new StringBuilder();
        char a;
        while(sc.hasNextLine()){
            line.delete(0,lineR.capacity());
            lineR.delete(0,lineR.capacity());
            line.append(sc.nextLine());
            for(int i=0;i<line.length();i++){
                a = line.charAt(i);
                if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
                    a=(char)((int)line.charAt(i)-1);
                if((a=='@'&&a=='[')||(a==(char)(96)&&a=='{')){
                    if(a<'A')a='Z';
                    else if(a>'Z')a='A';
                    else if(a<'a')a='z';
                    else if (a>'z')a='a';
                }                
                line.setCharAt(i,a);
            }
            if(line.length()==0)break;
            decode(0,line.length()-1);
            out.println(line.toString());
            out.println(lineR.toString());
        }
        out.flush();
    }
}
