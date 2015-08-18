/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V120;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P12015_GooglesFeelingLucky {
    static String[][]s;
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),j=1,max;
        while(j<=t){
            max=Integer.MIN_VALUE;
            s=new String[10][2];
            for(int i=0;i<10;i++){
                s[i][0]=sc.next();
                s[i][1]=sc.next();
                if(max<Integer.parseInt(s[i][1])){
                    max=Integer.parseInt(s[i][1]);
                }
            }
            out.println("Case #"+j++ +":");
            for(int i=0;i<10;i++){
                if(Integer.parseInt(s[i][1])==max){
                    out.println(s[i][0]);
                }
            }
            
        }
        out.flush();
    }
}
