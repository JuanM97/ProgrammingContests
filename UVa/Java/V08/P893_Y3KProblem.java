/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V08;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class P893_Y3KProblem {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static GregorianCalendar gc=new GregorianCalendar();
    static int ds,d,m,y;
    public static void main(String[]args){
        while(true){
            ds=sc.nextInt();
            d=sc.nextInt();
            m=sc.nextInt();
            y=sc.nextInt();
            if(ds==0&&d==0&&m==0&&y==0)break;
            gc.set(y,m-1,d);
            gc.add(Calendar.DAY_OF_YEAR,ds);
            out.printf("%d %d %d%n",gc.get(gc.DAY_OF_MONTH),gc.get(gc.MONTH)+1,gc.get(gc.YEAR));
        }
        out.flush();
    }
}
