/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V25;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class P2576_TRENER {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static int smx = 33;
    static int abc[] = new int[smx];
    
    public static void main(String[] args) {
        int T;
        boolean fd = false;
        String name;
        while(sc.hasNext()){
            T = sc.nextInt();
            if(T<0)break;
            for(int i=0;i<smx;i++)abc[i] = 0;
            for(int i=0;i<T;i++){
                name = sc.next();
                abc[name.charAt(0)-'a']++;
            }
            fd = false;
            for(int i=0;i<smx;i++){
                if(abc[i]>=5){
                    fd = true;
                    out.print((char)('a'+i));
                }
            }
            if(!fd)out.print("PREDAJA");
            out.println();
        }
        out.close();
    }
    
}


