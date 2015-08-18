package source;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Got 173 but in reality, 1 Jan 1901 was a tuesday, not a monday -> R=171 -.-

public class Prob19 {
    static Calendar c;
    static Date d;
    public static void main(String[]args){
        c=new GregorianCalendar(1901,0,1);
        d=new Date(1901,0,1);
        //System.out.println(d.getDate()+" "+d.getMonth()+" "+d.getYear());
        System.out.println(c.get(c.DATE)+" "+c.get(c.MONTH)+" "+c.get(c.YEAR)+" "+c.get(c.DAY_OF_WEEK));
        int cont=0;
        System.out.println("init:");
        /*while(d.getYear()!=2001){
            //System.out.println(d.getDate()+" "+d.getMonth()+" "+d.getYear());
            if(d.getDay()==0&&d.getDate()==1)cont++;
            d.setDate(d.getDate()+1);
        }*/
        
        while(c.get(c.YEAR)!=2001){
            //System.out.println(c.get(c.DATE)+" "+c.get(c.MONTH)+" "+c.get(c.YEAR));
            //day of week==1 because 1 Jan 1901 = tuesday, not monday as stated in the problem description... -.-
            if(c.get(c.DAY_OF_WEEK)==1&&c.get(c.DATE)==1)cont++;
            c.add(c.DAY_OF_MONTH,1);
        }
        System.out.println(cont);
    }
    
}
