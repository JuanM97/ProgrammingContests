/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V16;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class P1625_DayOfTheWeek {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static Calendar cal=new GregorianCalendar();
    
    static String[] m={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    static String[] d={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    
    public static int getMont(String a){
        for(int i=0;i<m.length;i++){
            if(a.equals(m[i])){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[]args){
        int t,year,day,ds;
        String month;
        
        t=sc.nextInt();
        while(t-->0){
            year=sc.nextInt();
            month=sc.next();
            day=sc.nextInt();
            cal.set(year,getMont(month),day);
            ds=cal.getTime().getDay();
            out.println(d[ds]);
        }
        out.flush();
    }
    
}
