/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V107;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P10703_FreeSpots {
    static boolean[][] e;
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int w,h,n;
        int x1,y1,x2,y2,xm,xM,ym,yM;
        int c=0;
        while(true){
            w=sc.nextInt();
            h=sc.nextInt();
            n=sc.nextInt();
            if(w==0&&h==0&&n==0)break;
            c=0;
            e=new boolean[w+1][h+1];
            for(int i=0;i<n;i++){
                x1=sc.nextInt();
                y1=sc.nextInt();
                x2=sc.nextInt();
                y2=sc.nextInt();
                xm=Math.min(x1,x2);
                ym=Math.min(y1,y2);
                xM=Math.max(x1,x2);
                yM=Math.max(y1,y2);
                for(int j=xm;j<=xM;j++){
                    for(int k=ym;k<=yM;k++){
                        if(e[j][k]==false){
                            e[j][k]=true;c++;
                        }
                    }
                }
            }
            if((w*h-c)==0){
                out.println("There is no empty spots.");
            }else{
                if((w*h-c)==1){
                    out.println("There is one empty spot.");
                }else{
                    out.println("There are "+(w*h-c)+" empty spots.");
                }
            }
            
        }
        out.flush();
    }
}
