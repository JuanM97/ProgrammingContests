/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V113;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.HashMap;
public class P11340_Newspaper {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        HashMap<Character,Integer> h=new HashMap();
        int t=sc.nextInt();
        int c,d;
        double ans;
        String s;
        while(t-->0){
            ans=0;
            c=sc.nextInt();
            h.clear();
            for(int i=0;i<c;i++){
                h.put(sc.next().charAt(0),sc.nextInt());
            }
            
            d=sc.nextInt();
            sc.nextLine();
            
            while(d-->0){
                s=sc.nextLine();
                for(int i=0;i<s.length();i++){
                    if(h.containsKey(s.charAt(i))){
                        ans+=h.get(s.charAt(i));
                    }
                }
            }
            out.printf("%.2f$\n",ans/100);
        }
        out.flush();
    }
}

