package V100;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.Map;
//What's Cryptanalysis?
public class P10008_WhatsCryptanalysis {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
        
    public static void main(String[]args){
        int[]ar=new int[30];
        HashMap<String,Integer> ct = new LinkedHashMap();
        String line;
        int num=sc.nextInt();sc.nextLine();
        for(int i=0; i<num;i++){
            line=sc.nextLine().toUpperCase().trim().replaceAll("\\s+","");
            for(int j=0;j<line.length();j++){
                if(line.charAt(j)>='A' && line.charAt(j)<='Z'){
                    ar[line.charAt(j)-'A']++;
                }
            }
        }
        char sx='A';
        int mx=-1;
        for(int i=0;i<27;i++){
            for(int j=0;j<27;j++){
                if(ar[j]>mx){
                    sx = (char)('A'+j);
                    mx = ar[j];
                }
            }
            if(mx>0) out.println(((sx)+"")+" "+mx);
            else break;
            ar[sx-'A']=-1;
            mx=-1;
        }
        out.flush();
        
    }
    
}


