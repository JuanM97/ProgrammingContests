/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V113;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P11309_CountingChaos {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static String hms,sh,sm;
    static int t,h,m;
    
    public static void next(){
        m+=1;
        if(m==60)h+=1;
        m%=60;
        h%=24;
    }
    
    public static void format(){
        if(h/10<1)sh="0"+h;
        else sh=h+"";
        if(m/10<1)sm="0"+m;
        else sm=m+"";
    }
    
    public static boolean isP(){
        int g=h*100+m;
        String s=g+"";
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        }
        return true;
    }
    
    public static void main(String[]args){
        
        t=sc.nextInt();
        while(t-->0){
            hms=sc.next();
            h=Integer.parseInt(hms.split(":")[0]);
            m=Integer.parseInt(hms.split(":")[1]);
            next();
            while(!isP()){
                next();
            }
            sh="";sm="";
            format();
            out.println(sh+":"+sm);
        }
        out.flush();
    }
}
