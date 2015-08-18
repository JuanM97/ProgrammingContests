package V13;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1384_BaseN2 {
    
    public static String toN2(int n){
        String ans="";
        int r=0,r2=0;
        if(n==0){
            return "0";
        }
        while(n!=0){
            r=n%-2>=0?n%-2:(n%-2+2);
            //r=n%-2;
            //System.out.print("\n"+n+" " +r+" ");
            if(r==1){
                ans='1'+ans;
            }else{
                ans='0'+ans;
            }
            if(n==2){
                ans="11"+ans;
                break;
            }
            //System.out.print(n+" "+ans+" ");
            if(n<0){
                n=(int)Math.ceil((Math.abs(n)+1)/2);
            }else{
                n/=-2;
            }
        }
        return ans;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        int num,cases=1;;
        String a;
        while(n-->0){
            a="";
            num=sc.nextInt();
            //System.out.println(-3%-2);
            a=toN2(num);
            out.printf("Case #%d: %s\n",cases++,a);
        }
        out.flush();
    }
}
