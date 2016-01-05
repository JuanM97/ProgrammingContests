/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V34;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class P3430_MultipleTimesApplyingReverse {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static Stack<Integer> st = new Stack();
    static char[] line;
    
    static void reverse(int a,int b){
        int m = (a+b)/2;
        char tmp = 0;
        for(int i=a;i<=m;i++){
            tmp = line[i];
            line[i] = line[b+a-i];
            line[b+a-i] = tmp;
        }
    }
    
    public static void main(String[] args) {
        int a;
        String s;
        while(sc.hasNext()){
            line = sc.nextLine().toCharArray();
            if(line[0]=='.')break;
            st.clear();
            for(int i=0;i<line.length;i++){
                if(line[i]=='(')st.add(i);
                if(line[i]==')'){
                    a = st.pop();
                    reverse(a,i);
                }
            }
            //out.println(Arrays.toString(line));
            s = new String(line);
            s = s.replaceAll("\\(","");
            s = s.replaceAll("\\)","");
            out.println(s);
        }
        out.close();
    }
    
}


