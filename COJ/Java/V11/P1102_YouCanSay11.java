package V11;

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
public class P1102_YouCanSay11 {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String s=sc.next();
        int p,i,rs;
        while(!s.equals("0")){
            p=i=0;
            for(int j=0;j+1<s.length();j+=2){
                p+=s.charAt(j)-'0';
                i+=s.charAt(j+1)-'0';
                if(j+2==s.length()-1){
                    p+=s.charAt(j+2)-'0';
                }
            }
            rs=Math.abs(p-i);
            if(rs%11==0){
                out.println(s+" is a multiple of 11.");
            }else{
                out.println(s+" is not a multiple of 11.");
            }
            s=sc.next();
        }
        out.flush();
    }
}
