/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V121;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class P12148_Electricity {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static GregorianCalendar gc=new GregorianCalendar();
    static GregorianCalendar cd=new GregorianCalendar();
    static int n,d,m,y,kW,pkW,ctr,kWt;
    public static void main(String[]args){
        while(true){
            n=sc.nextInt();
            if(n==0)break;
            ctr=0;kWt=0;
            for(int i=0;i<n;i++){
                d=sc.nextInt();m=sc.nextInt()-1;
                y=sc.nextInt();kW=sc.nextInt();
                if(i==0){
                    cd.set(y,m,d);
                    pkW=kW;
                }else{
                    gc.set(y,m,d);
                    cd.add(gc.DAY_OF_YEAR,1);
                    if(cd.equals(gc)){
                        ctr++;
                        kWt+=(kW-pkW);
                    }
                    cd=(GregorianCalendar)gc.clone();
                    pkW=kW;
                }
            }
            out.printf("%d %d%n",ctr,kWt);
        }
        out.flush();
    }
}
