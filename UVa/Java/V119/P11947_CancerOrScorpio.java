/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V119;

/**
 *
 * @author JuanM
 */


import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class P11947_CancerOrScorpio {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static GregorianCalendar gc=new GregorianCalendar();
    static int t,ds,d,m,y;
    static String date;
    
    public static String zodiac(int d){
        if(d>=121&&d<=219)return "aquarius";
        if(d>=220&&d<=320)return "pisces";
        if(d>=321&&d<=420)return "aries";
        if(d>=421&&d<=521)return "taurus";
        if(d>=522&&d<=621)return "gemini";
        if(d>=622&&d<=722)return "cancer";
        if(d>=723&&d<=821)return "leo";
        if(d>=822&&d<=923)return "virgo";
        if(d>=924&&d<=1023)return "libra";
        if(d>=1024&&d<=1122)return "scorpio";
        if(d>=1123&&d<=1222)return "sagittarius";
        if((d>=1223&&d<=1231)||(d>=101&&d<=120))return "capricorn";
        return "X_X";
    }
    
    public static void main(String[]args){
        t=sc.nextInt();
        for(int i=1;i<=t;i++){
            date=sc.next();
            m=Integer.parseInt(date.substring(0,2));
            d=Integer.parseInt(date.substring(2,4));
            y=Integer.parseInt(date.substring(4,8));
            gc.set(y,m-1,d);
            gc.add(Calendar.DAY_OF_YEAR,280);
            ds=(gc.get(gc.MONTH)+1)*100+gc.get(gc.DAY_OF_MONTH);
            out.printf("%d %02d/%02d/%04d %s%n",i,gc.get(gc.MONTH)+1,gc.get(gc.DAY_OF_MONTH),gc.get(gc.YEAR),zodiac(ds));
        }
        out.flush();
    }
}
