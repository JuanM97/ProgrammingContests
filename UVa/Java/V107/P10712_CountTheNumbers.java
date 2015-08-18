/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V107;

/**
 *
 * @author JuanM
 */

// :( TLE
import java.util.Scanner;
import java.io.PrintWriter;
public class P10712_CountTheNumbers {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        String n;
        String s;
        boolean fF;
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.next();
            if(a==-1&&b==-1&&n.equals("-1"))break;
            c=0;
            fF=false;
            for(int i=a;i<=b;i++){
                s=i+"";
                if(s.contains(n)){
                    c++;
                    fF=true;
                }
                if(fF){
                    i+=9;
                }
            }
            out.println(c);
        }
        out.flush();
        
    }
}
