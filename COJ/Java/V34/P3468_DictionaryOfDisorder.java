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
import java.util.HashMap;
import java.util.Scanner;
public class P3468_DictionaryOfDisorder {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static HashMap<String,Integer> map = new HashMap();
    
    public static void main(String[] args) {
        char[] ar;
        String s;
        int N;
        while(sc.hasNext()){
            N = sc.nextInt();
            map.clear();
            if(N<0)break;
            while(N-->0){
                ar = sc.next().toCharArray();
                Arrays.sort(ar);
                s = new String(ar);
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else{
                    map.put(s,0);
                }
                out.println(map.get(s));
            }
        }
        out.close();
    }
    
}


