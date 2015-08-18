/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V120;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class P12019_DoomsDayAlgorithm {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static GregorianCalendar gc=new GregorianCalendar();
    static String weekDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    static int t,m,d;
    public static void main(String[]args){
        t=sc.nextInt();
        while(t-->0){
            m=sc.nextInt();
            d=sc.nextInt();
            gc.set(2011,m-1,d);
            out.printf("%s\n",weekDay[gc.get(gc.DAY_OF_WEEK)-1]);
        }
        out.flush();
    }
}
