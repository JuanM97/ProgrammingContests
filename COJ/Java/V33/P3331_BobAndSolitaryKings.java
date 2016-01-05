/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */


import java.util.Scanner;
import java.io.PrintWriter;
public class P3331_BobAndSolitaryKings{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter (System.out);
    
    public static void main(String[] args) {
        
        int n,m;
        
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0&&m==0)break;
            long a=n*m,re=0;
            if(n==1&&m>1) re+=2*(m-2)+2;
            if(n>1&&m==1) re+=2*(n-2)+2;
            if(n>1&&m>1){
                re+=10*(n-2)+6;
                re+=10*(m-2)+6;
                re+=8*(n-2)*(m-2);
            }
            long r=a*(a-1)-re;
            out.println(r<0?0:r);
        }       
        out.close();
        
    }
    
}


