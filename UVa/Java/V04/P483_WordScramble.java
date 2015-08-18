/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P483_WordScramble {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Scanner scL;
        PrintWriter out=new PrintWriter(System.out);
        String l;
        StringBuffer s,ans;
        boolean f;
        while(sc.hasNext()){
            l=sc.nextLine();
            //if(l.equals("LOL"))break;
            scL=new Scanner(l);
            s=new StringBuffer("");
            ans=new StringBuffer("");
            f=true;
            while(scL.hasNext()){
                s.append(scL.next());
                if(f){
                    ans.append(s.reverse());
                    f=false;
                }else{
                    ans.append(" "+s.reverse());
                }
                s.delete(0,s.capacity());
            }
            out.println(ans);
        }
        out.flush();
    }
}
