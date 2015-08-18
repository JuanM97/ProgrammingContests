/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V118;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigDecimal;
public class P11821_HighPrecisionNumber {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        BigDecimal b,s;
        String ans;
        while(t-->0){
            s=BigDecimal.ZERO;
            while(true){
                b=sc.nextBigDecimal();
                //System.out.println("L_ " +b);
                if(b.compareTo(BigDecimal.ZERO)==0)break;
                s=s.add(b);
            }
            ans=s.toString();
            int cont=0;
            for(int i=ans.length()-1;i>=0;i--){
                if(ans.charAt(i)=='0'){
                    cont++;
                }else{
                    break;
                }
            }
            ans=ans.substring(0,ans.length()-cont);
            if(ans.charAt(ans.length()-1)=='.'){
                ans=ans.substring(0,ans.length()-1);
            }
            out.println(ans);
        }
        out.flush();
    }
}
