/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V14;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P1411_AGenoma {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    static int t,n,count;
    static String s,q;
    
    public static void main(String[]args){
        t=sc.nextInt();
        for(int i=1;i<=t;i++){
            s=sc.next();
            n=sc.nextInt();
            out.printf("Case %d\n",i);
            while(n-->0){
                q=sc.next();
                count=0;
                for(int ix=0;ix<s.length()-q.length()+1;ix++){
                    if(s.regionMatches(ix,q,0,q.length())){
                        count++;
                    }
                }
                if(count==0){
                    out.println("Darwin was right about this creature");
                }else{
                    out.println(count);
                }
            }
        }
        out.flush();
    }
}
