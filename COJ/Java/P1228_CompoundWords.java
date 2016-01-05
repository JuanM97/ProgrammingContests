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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class P1228_CompoundWords {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static HashSet<String> set = new HashSet();
    static HashSet<String> st = new HashSet();
    static ArrayList<String> ls = new ArrayList();
    
    public static void main(String[] args) {
        String s,sa,sb;
        set.clear();
        while(sc.hasNext()){
            s = sc.next();
            if(s.equals("-1"))break;
            set.add(s);
        }
        st.clear();
        ls.clear();
        for(String w : set){
            for(int i = 1;i<w.length();i++){
                sa = w.substring(0,i);
                sb = w.substring(i,w.length());
                if(set.contains(sa) && set.contains(sb)) st.add(w);
            }
        }
        ls.addAll(st);
        Collections.sort(ls);
        for(String ss : ls) out.println(ss);
        out.close();
    }
    
}


