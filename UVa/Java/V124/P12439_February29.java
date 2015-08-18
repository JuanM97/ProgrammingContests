/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V124;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.HashMap;
import java.util.GregorianCalendar;
public class P12439_February29 {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static GregorianCalendar gc1=new GregorianCalendar();
    static HashMap<String,Integer> hm=new HashMap();
    static int t,y1,y2,d1,d2,ctr,caseN=1;
    static String m1,m2,dd;
    public static void fill(){
        hm.put("January",0); hm.put("February",1);
        hm.put("March",2); hm.put("April",3);
        hm.put("May",4); hm.put("June",5);
        hm.put("July",6); hm.put("August",7);
        hm.put("September",8); hm.put("October",9);
        hm.put("November",10); hm.put("December",11);
    }
    
    
    public static void main(String[]args){
        fill();
        t=sc.nextInt();
        while(t-->0){
            ctr=0;
            m1=sc.next();dd=sc.next();d1=Integer.parseInt(dd.substring(0,dd.length()-1));
            y1=sc.nextInt();
            gc1.set(y1,hm.get(m1),d1);            
            m2=sc.next();dd=sc.next();d2=Integer.parseInt(dd.substring(0,dd.length()-1));
            y2=sc.nextInt();
            
            if(hm.get(m1)>1){
                ++y1;
            }
            if(hm.get(m2)<1||(hm.get(m2)==1&&d2<29)){
                --y2;
            }
            
            ctr=y2/4-(y1-1)/4;
            ctr-=(y2/100-(y1-1)/100);
            ctr+=(y2/400-(y1-1)/400);
            
            out.printf("Case %d: %d%n",caseN++,ctr);
        }
        out.flush();
    }
}
