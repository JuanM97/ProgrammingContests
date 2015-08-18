/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V12;

/**
 *
 * @author JuanM
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Stack;
public class P1223_FindingSecretSanta {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static int t;
    
    static public class Pair{
        String g;
        String r;
        public Pair(String g, String r){
            this.g=g;
            this.r=r;
        }
        @Override
        public String toString(){
            return "<"+this.g+", "+this.r+">";
        }
    }
    
    public static void main(String[]args){
        Stack<Pair> p=new Stack();
        LinkedList<String> l=new LinkedList();
        int cycles,c=1;
        while((t=sc.nextInt())!=0){
            p.clear();l.clear();cycles=0;
            for(int i=0;i<t;i++){
                p.add(new Pair(sc.next(),sc.next()));
            }
            while(!p.isEmpty()){
                if(l.isEmpty()){
                    l.add(p.get(0).g);l.add(p.get(0).r);p.remove(0);
                }
                for(int i=0;!p.isEmpty()&&i<p.size();i++){
                    if(p.get(i).g.equals(l.get(l.size()-1))){
                        if(!l.contains(p.get(i).r)){
                            l.add(p.get(i).r);
                            p.remove(i);
                        }else{
                            cycles++;p.remove(i);
                            l.clear();break;
                        }
                    }
                }
            }
            out.printf("%d %d\n",c++,cycles);
        }
        out.flush();
    }
}
