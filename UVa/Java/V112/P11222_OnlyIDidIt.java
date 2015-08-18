/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V112;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class P11222_OnlyIDidIt {
    
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(new InputStreamReader(System.in));
    static int t,n1,n2,n3,smx,caseN=1;
    static LinkedHashSet<Integer> hs1=new LinkedHashSet();
    static LinkedHashSet<Integer> hs2=new LinkedHashSet();
    static LinkedHashSet<Integer> hs3=new LinkedHashSet();
    static LinkedHashSet<Integer> us1=new LinkedHashSet();
    static LinkedHashSet<Integer> us2=new LinkedHashSet();
    static LinkedHashSet<Integer> us3=new LinkedHashSet();
    static Integer a[]=new Integer[1013];
    static String s[]=new String[1013];
    static String s1,s2,s3;
    public static void main(String[]args){
        t=sc.nextInt();
        while(t-->0){
            hs1.clear();hs2.clear();hs3.clear();
            us1.clear();us2.clear();us3.clear();
            n1=sc.nextInt();
            for(int i=0;i<n1;i++) hs1.add(sc.nextInt());
            n2=sc.nextInt();
            for(int i=0;i<n2;i++) hs2.add(sc.nextInt());
            n3=sc.nextInt();
            for(int i=0;i<n3;i++) hs3.add(sc.nextInt());
            us1=(LinkedHashSet<Integer>)hs1.clone();
            us2=(LinkedHashSet<Integer>)hs2.clone();
            us3=(LinkedHashSet<Integer>)hs3.clone();
            
            us1.removeAll(hs2);us1.removeAll(hs3);
            us2.removeAll(hs1);us2.removeAll(hs3);
            us3.removeAll(hs2);us3.removeAll(hs1);
            smx=Math.max(us1.size(),Math.max(us2.size(),us3.size()));
            out.printf("Case #%d:\n",caseN++);
            if(us1.size()==smx){
                out.printf("1 %d",us1.size());
                if(us1.size()>0){
                    s2=us1.toString().replaceAll(","," ");
                    s2=s2.replaceAll("\\[+","");
                    s2=s2.replaceAll("\\]+","");
                    s2=s2.replaceAll("\\s+"," ");
                    s=s2.split("\\s+");
                    Arrays.sort(s);
                    for(int i=0;i<s.length;i++){
                        out.printf(" %s",s[i]);
                    }
                }out.printf("%n");
            }
            if(us2.size()==smx){
                out.printf("2 %d",us2.size());
                if(us2.size()>0){
                    s2=us2.toString().replaceAll(","," ");
                    s2=s2.replaceAll("\\[+","");
                    s2=s2.replaceAll("\\]+","");
                    s2=s2.replaceAll("\\s+"," ");
                    s=s2.split("\\s+");
                    Arrays.sort(s);
                    for(int i=0;i<s.length;i++){
                        out.printf(" %s",s[i]);
                    }
                }out.printf("%n");
            }
            if(us3.size()==smx){
                out.printf("3 %d",us3.size());
                if(us3.size()>0){
                    s2=us3.toString().replaceAll(","," ");
                    s2=s2.replaceAll("\\[+","");
                    s2=s2.replaceAll("\\]+","");
                    s2=s2.replaceAll("\\s+"," ");
                    s=s2.split("\\s+");
                    Arrays.sort(s);
                    for(int i=0;i<s.length;i++){
                        out.printf(" %s",s[i]);
                    }
                }out.printf("%n");
            }
        }
        out.flush();
    }
}
