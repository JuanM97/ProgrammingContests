/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V30;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;
public class P3017_ReversePolishNotation {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static Stack<Integer>st=new Stack<Integer>();
    public static void main(String[]args){
        String s,line[];
        int a,b;
        while(sc.hasNext()){
            s=sc.nextLine().trim();
            if(s.equals("0"))break;
            line=s.split("\\s+");
            st.clear();
            st.add(Integer.parseInt(line[0]));
            for(int i=1;i<line.length;i++){
                if(line[i].equals("+")){
                    a=st.pop();
                    b=st.pop();
                    st.push(a+b);
                }
                else if(line[i].equals("-")){
                    a=st.pop();
                    b=st.pop();
                    st.push(b-a);
                }
                else if(line[i].equals("*")){
                    a=st.pop();
                    b=st.pop();
                    st.push(a*b);
                }
                else{
                    st.push(Integer.parseInt(line[i]));
                }
            }
            out.println(st.pop());
        }
        out.flush();
    }
}
