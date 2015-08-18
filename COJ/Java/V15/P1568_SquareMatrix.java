/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V15;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1568_SquareMatrix {
    
    public static long rotD(int n,int x,int y){
        long a=0,xn,yn;
        xn=n-y;
        yn=x;
        return n*(xn-1)+yn;
    }
    
    public static long rotI(int n,int x,int y){
        long a=0,xn,yn;
        xn=y;
        yn=n+1-x;
        return n*(xn-1)+yn;
    }
    
    public static long rot180(int n,int x,int y){
        long a=0,xn,yn;
        xn=n+1-x;
        yn=n+1-y;
        return n*(xn-1)+yn;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int n,r,x,y;
        long ans;
        while(sc.hasNext()){
            ans=0;
            n=sc.nextInt();
            if(n<0)break;
            r=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();
            r=r%4;
            //System.out.println(r);
            if(r==0){
                ans=n*(x-1)+y;
            }else{
                if(r==1||r==-3){
                    ans=rotD(n,x,y);
                }else{
                    if(r==3||r==-1){
                        ans=rotI(n,x,y);
                    }else{
                        ans=rot180(n,x,y);
                    }
                }
            }
            out.println(ans);
        }
        out.flush();
    }
}
