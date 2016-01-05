/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V15;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
public class P1507_SortingCards {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static class Card implements Comparable{
        int v;
        int s;
        String cd;
        Card(String ss){
            this.cd = ss;
            if(ss.charAt(0)>='2' && ss.charAt(0)<='9'){
                this.v = ss.charAt(0)-'0';
            }else{
                char tmp = ss.charAt(0);
                switch(tmp){
                    case 'A':
                        this.v = 0;
                        break;
                    case 'T':
                        this.v = 10;
                        break;
                    case 'J':
                        this.v = 11;
                        break;
                    case 'Q':
                        this.v = 12;
                        break;
                    case 'K':
                        this.v = 13;
                        break;
                }
            }
            switch(ss.charAt(1)){
                case 'S':
                    this.s = 0;
                    break;
                case 'H':
                    this.s = 1;
                    break;
                case 'C':
                    this.s = 2;
                    break;
                case 'D':
                    this.s = 3;
                    break;
            }
        }
        @Override
        public int compareTo(Object cc){
            Card c = (Card)cc;
            if(this.v<c.v)return -1;
            else if(this.v>c.v){
                return 1;
            }else{
                return this.s-c.s;
            }
        }
        
        public String toString(){
            return this.cd;
        }
        
    }
    
    
    public static void main(String[] args) {
        int T, N;
        T = sc.nextInt();
        LinkedList<Card> cards = new LinkedList();
        while(T-->0){
            N = sc.nextInt();
            cards.clear();
            for(int i=0;i<N;i++){
                cards.add(new Card(sc.next()));
            }
            Collections.sort(cards);
            boolean f = true;
            for(Card s : cards){
                if(f){
                    out.print(s);
                    f = false;
                }else{
                    out.print(" "+s);
                }
            }out.println();
        }
        out.close();       
    }
    
}


