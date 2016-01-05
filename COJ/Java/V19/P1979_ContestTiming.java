/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V19;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class P1979_ContestTiming {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int day, hour, min;
        Calendar ini = new GregorianCalendar();
        Calendar fin = new GregorianCalendar();
        ini.set(2015, Calendar.NOVEMBER, 11, 11, 11);
        while(sc.hasNext()){
            day = sc.nextInt();
            if(day<0)break;
            hour = sc.nextInt();
            min = sc.nextInt();
            fin.set(2015, Calendar.NOVEMBER,day,hour,min);
            long mm = fin.getTime().getTime()-ini.getTime().getTime();
            if(mm<0){
                out.println(-1);
            }else{
                out.println(mm/60000);
            }
        }
        out.close();
        
    }
    
}

