/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V02;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class P256_QuirksomeSquares {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static ArrayList<Integer> sq = new ArrayList();
    static ArrayList<Integer> sq2 = new ArrayList();
    static ArrayList<Integer> sq4 = new ArrayList();
    static ArrayList<Integer> sq6 = new ArrayList();
    static ArrayList<Integer> sq8 = new ArrayList();
    
    static void preCalc(){
        for(int i=0;i*i<100000000;i++){
            sq.add(i*i);
        }
        for(int i=0;i<sq.size();i++){
            if(sq.get(i).toString().length()<=2){
                if(Math.pow(sq.get(i)/10+sq.get(i)%10,2)==sq.get(i))sq2.add(sq.get(i));
            }
            if(sq.get(i).toString().length()<=4){
                if(Math.pow(sq.get(i)/100+sq.get(i)%100,2)==sq.get(i))sq4.add(sq.get(i));
            }
            if(sq.get(i).toString().length()<=6){
                if(Math.pow(sq.get(i)/1000+sq.get(i)%1000,2)==sq.get(i))sq6.add(sq.get(i));
            }
            if(sq.get(i).toString().length()<=8){
                if(Math.pow(sq.get(i)/10000+sq.get(i)%10000,2)==sq.get(i))sq8.add(sq.get(i));
            }
        }
                
    }
    
    public static void main(String[]args){
        preCalc();
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n<0)break;
            switch(n){
                case 2:
                    for(int i=0;i<sq2.size();i++) out.printf("%02d%n",sq2.get(i));
                    break;
                case 4:
                    for(int i=0;i<sq4.size();i++) out.printf("%04d%n",sq4.get(i));
                    break;
                case 6:
                    for(int i=0;i<sq6.size();i++) out.printf("%06d%n",sq6.get(i));
                    break;
                case 8:
                    for(int i=0;i<sq8.size();i++) out.printf("%08d%n",sq8.get(i));
                    break;
            }
        }
        out.flush();
    }
    
}


