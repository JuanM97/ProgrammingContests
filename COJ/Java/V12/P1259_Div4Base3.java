package V12;

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
public class P1259_Div4Base3 {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        String s;
        int p,i,rs;
        while(n-->0){
            p=i=0;
            s=sc.next();
            for(int j=0;j+1<s.length();j+=2){
                p+=s.charAt(j)-'0';
                i+=s.charAt(j+1)-'0';
                if(j+2==s.length()-1){
                    p+=s.charAt(j+2)-'0';
                }
            }
            if(s.length()==1){
                if(s.charAt(0)=='0'){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }else{
                rs=Math.abs(p-i);
                if(rs%4==0){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }
        }
        out.flush();
    }
}
