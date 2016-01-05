/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V24;

/**
 *
 * @author JuanM
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
public class P2436_Criptogony {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static char[] chars = new char[30];
    static char[] tr = new char[30];
    static int[] m = new int[30];
    static LinkedList<Pair> fq = new LinkedList();
    
    static class Pair implements Comparable{
        char l;
        int f;
        Pair(char c, int i){
            this.l = c;
            this.f = i;
        }
        @Override
        public int compareTo(Object o){
            Pair p = (Pair)o;
            return p.f-this.f;
        }
        @Override
        public String toString(){
            return String.format("[%c,%d]",l,f);
        }
        
    }
    
    public static void main(String[] args) {
        int T, N, M;
        char tmp;
        char[] msg;
        T = sc.nextInt();
        while(T-->0){
            for(int i=0;i<30;i++){
                chars[i] = 0;
                tr[i] = 0;
                m[i] = 0;
            }
            fq.clear();
            N = sc.nextInt();
            M = sc.nextInt();
            for(int i=0;i<N;i++){
                tmp = sc.next().charAt(0);
                chars[i] = tmp;
            }
            msg =sc.next().toCharArray();
            for(int i=0;i<msg.length;i++){
                m[msg[i]-'A']++;
            }
            for(int i=0;i<30;i++){
                if(m[i]>0)fq.add(new Pair((char)('A'+i),m[i]));
            }
            Collections.sort(fq);
            /*for(Pair p : fq){
                out.println(p);
            }out.println("***");*/
            for(int i=0;i<fq.size();i++){
                tr[fq.get(i).l-'A'] = chars[i];
            }
            for(int i=0;i<msg.length;i++){
                out.print(tr[msg[i]-'A']);
            }out.println();
            
        }
        out.close();
        
    }
    
}


