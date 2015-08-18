/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V21;

/**
 *
 * @author JuanM
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P2152_SumOfTheDigits {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        String s;
        int ans;
        while(t-->0){
            ans=0;
            s=sc.next();
            for(int i=0;i<s.length();i++){
                if(i==0&&s.charAt(i)=='-'){
                    continue;
                }
                ans+=(s.charAt(i)-'0');
            }
            out.println(ans);
        }
        out.flush();
    }
}
