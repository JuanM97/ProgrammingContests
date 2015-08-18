/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V19;

/**
 *
 * @author JuanM
 */

//TLE :(
import java.util.Scanner;
import java.io.PrintWriter;
public class P1902_ProblemsIDs {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    static int t;
    static String date,g,cty,ctry,rand,d,m,y;
    static String dt[];
    
    public static void pad(){
        while(y.length()<4){
            y="0"+y;
        }
        while(m.length()<2){
            m="0"+m;
        }
        while(d.length()<2){
            d="0"+d;
        }
        while(cty.length()<4){
            cty="0"+cty;
        }
        while(ctry.length()<3){
            ctry="0"+ctry;
        }
        while(rand.length()<4){
            rand="0"+rand;
        }
    }
    
    
    
    public static void main(String[]args){
        
        t=sc.nextInt();
        while(t-->0){
            g=sc.next();
            date=sc.next();
            dt=date.split("/");
            d=dt[0];m=dt[1];y=dt[2];
            cty=sc.next();
            ctry=sc.next();
            rand=sc.next();
            pad();
            out.printf("%s-%s-%s-%s-%s-%s-%s\n",g,y,m,d,cty,ctry,rand);
        }
        out.flush();
    }
}

