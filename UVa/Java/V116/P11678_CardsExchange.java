/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V116;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class P11678_CardsExchange {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int a,b,ca,cb;
        int[]p,q;
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0)break;
            p=new int[100010];
            q=new int[100010];
            for(int i=0;i<a;i++){
                p[sc.nextInt()]++;
            }
            for(int j=0;j<b;j++){
                q[sc.nextInt()]++;
            }
            ca=cb=0;
            for(int i=1;i<=100000;i++){
                if(p[i]>0&&q[i]==0)ca++;
                if(q[i]>0&&p[i]==0)cb++;
            }
            out.println(Math.min(ca,cb));
        }
        out.flush();
    }
}
