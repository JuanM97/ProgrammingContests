/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
public class P484_TheDepartmentOfRedundancyDepartment {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        String s;
        LinkedHashMap<String,Long> set = new LinkedHashMap();
        while(sc.hasNext()){
            s = sc.next();
            //if(s.equals("pikachu"))break;
            if(set.containsKey(s)){
                set.put(s,set.get(s)+1);
            }else{
                set.put(s,1L);
            }
        }
        for(String k : set.keySet()){
            out.println(k+" "+set.get(k));
        }
        out.close();
    }
    
}

