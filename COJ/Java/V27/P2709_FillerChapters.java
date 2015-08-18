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
import java.util.Scanner;
import java.util.HashSet;
public class P2709_FillerChapters {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashSet<Integer> fillerCh = new HashSet();
    public static void main(String[]args){
        int n,p;
        
        while(sc.hasNext()){
            n=sc.nextInt();
            //if(n==0)break;
            p=sc.nextInt();
            fillerCh.clear();
            for(int i=0;i<p;i++){
                fillerCh.add(sc.nextInt());
            }
            out.println(n-fillerCh.size());
        }
        out.flush();
        
    }
}

