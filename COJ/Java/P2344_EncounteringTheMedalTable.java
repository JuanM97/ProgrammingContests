/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V23;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
public class P2344_EncounteringTheMedalTable {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static class Country implements Comparable{
        String name;
        int gold,silver,bronze;
        
        Country(String n, int g, int s, int b){
            this.name = n;
            this.gold = g;
            this.silver = s;
            this.bronze = b;
        }
        @Override
        public int compareTo(Object o){
            Country c = (Country)o;
            int gg = c.gold - gold;
            int ss = c.silver - silver;
            int bb = c.bronze - bronze;
            if(gg!=0){
                return gg;
            }else{
                if(ss!=0){
                    return ss;
                }else{
                    if(bb!=0){
                        return bb;
                    }else{
                        return (name).compareTo(c.name);
                    }
                }
            }
        }
        @Override
        public String toString(){
            return name;
        }
        
    }
    
    static ArrayList<Country> countries = new ArrayList();
    
    public static void main(String[] args) {
        String c;
        int g,s,b;
        while(sc.hasNext()){
            c = sc.next();
            if(c.equals("#")){
                Collections.sort(countries);
                for(Country cc : countries)
                    out.println(cc);
                countries.clear();
                break;
            }
            if(c.equals("@")){
                Collections.sort(countries);
                for(Country cc : countries)
                    out.println(cc);
                out.println("@");
                countries.clear();
            }else{
                g = sc.nextInt();
                s = sc.nextInt();
                b = sc.nextInt();
                countries.add(new Country(c,g,s,b));
            }
            
        }
        out.close();
        
    }
    
}


