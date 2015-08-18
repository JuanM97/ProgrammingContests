package V10;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1064_AlarmClock {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int horas,minutos,ans;
        int h1=sc.nextInt(),m1=sc.nextInt(),h2=sc.nextInt(),m2=sc.nextInt();
        
        while(h1!=0 || m1!=0 || h2!=0 || m2!=0){
            horas=minutos=ans=0;
            minutos=m2-m1;
            if(minutos<0){
                h1++;
                minutos+=60;
            }
            horas=h2-h1;
            if(horas<0){
                horas+=24;
            }
            ans=minutos+horas*60;
            out.println(ans);
            h1=sc.nextInt();
            m1=sc.nextInt();
            h2=sc.nextInt();
            m2=sc.nextInt();
        }
        out.flush();
    }
}
