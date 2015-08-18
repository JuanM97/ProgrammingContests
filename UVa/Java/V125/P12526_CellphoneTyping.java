/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V125;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.HashMap;
public class P12526_CellphoneTyping {
    
    class Nodo{
        char c;
        int t;
        HashMap<Byte,Nodo>m;
        public Nodo(char c){
            this.m=new HashMap<Byte,Nodo>();
            this.c=c;
            this.t=0;
        }
    }
    
    public static void main(String[]args){
        //PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t;
        P12526_CellphoneTyping cpt=new P12526_CellphoneTyping();
        while(sc.hasNext()){
            t=sc.nextInt();
            if(t==0)break;
            Stack<String> st=new Stack<String>();
            Nodo root=cpt.new Nodo(' ');
            for(int i=0;i<t;i++){
                String s=sc.next();
                st.push(s);
                Nodo act=root;
                for(int j=0;j<s.length();j++){
                    if(!act.m.containsKey((byte)s.charAt(j))){
                        act.m.put((byte)s.charAt(j),cpt.new Nodo(s.charAt(j)));
                    }
                    act=act.m.get((byte)s.charAt(j));
                    act.t++;
                }
                
            }
            double sum=0;
            while(!st.isEmpty()){
                String s=st.pop();
                int c=1;
                Nodo actual=root;
                int ant=0;
                for(int i=0;i<s.length();i++){
                    actual=actual.m.get((byte)s.charAt(i));
                    if(ant>actual.t){
                        ++c;
                    }
                    ant=actual.t;
                }
                sum+=c;
            }
            System.out.printf("%.2f\n",sum/t);
        }
    }
}
