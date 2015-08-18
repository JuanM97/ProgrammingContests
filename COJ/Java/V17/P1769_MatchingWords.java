/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V17;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
public class P1769_MatchingWords {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        String a,b;
        LinkedList<Byte>la=new LinkedList();
        LinkedList<Byte>lb=new LinkedList();
        boolean ct=true;
        Byte ch;
        while(sc.hasNext()){
            a=sc.next();
            if(a.equals("000"))break;
            b=sc.next();
            la.clear();
            lb.clear();
            ct=true;
            for(int i=0;i<a.length();i++)la.add((byte)a.charAt(i));
            for(int i=0;i<b.length();i++)lb.add((byte)b.charAt(i));
            if(la.size()<lb.size()){
                while(!la.isEmpty()){
                    ch=la.getFirst();
                    la.removeFirst();
                    if(lb.contains(ch)){
                        lb.remove(ch);
                    }else{
                        ct=false;
                        break;
                    }
                }
            }else{
                while(!lb.isEmpty()){
                    ch=lb.getFirst();
                    lb.removeFirst();
                    if(la.contains(ch)){
                        la.remove(ch);
                    }else{
                        ct=false;
                        break;
                    }
                }
            }
            out.printf("%s\n",ct?"YES":"NO");
        }
        out.flush();
    }
}
