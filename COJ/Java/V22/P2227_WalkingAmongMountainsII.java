/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V22;

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P2227_WalkingAmongMountainsII {
    static int[][]m;
    static int[][]t;
    
    public static void fill(int a, int b){
        for(int i=1;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                int min=0,max=0;
                //max=t[i][j-1]>=t[i-1][j]?t[i][j-1]:t[i-1][j];
                if(j==0){
                    if(m[i-1][j]>=m[i][j]){
                        min=0;
                        max=t[i-1][j];
                    }else{
                        if(i==1){
                            min=0;
                        }else{
                            min=m[i][j]-m[i-1][j];
                        }
                    }
                }else{
                    if(i==1){
                        if(m[i][j-1]>=m[i][j]){
                            max=t[i][j-1];
                            min=0;
                        }else{
                            min=(m[i][j]-m[i][j-1]);
                        }
                    }else{
                        if(m[i][j-1]>=m[i][j]){
                            max=t[i][j-1];
                            min=0;
                        }else{
                            min=(m[i][j]-m[i][j-1]);
                            if(m[i-1][j]>=m[i][j]){
                                max=t[i-1][j];
                                min=0;
                            }else{
                                if(min<(m[i][j]-m[i-1][j])){
                                    min=m[i][j]-m[i-1][j];
                                }
                            }
                        }
                    }
                }
                t[i][j]=min+max;
                System.out.print(min +" "+max+" ");
            }
            System.out.println();
        }
    }
    
    public static void print(int[][]a){
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int a,b;
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0)break;
            m=new int[n+1][n];
            t=new int[n+1][n];
            for(int i=1;i<m.length;i++){
                for(int j=0;j<m[0].length;j++){
                    m[i][j]=sc.nextInt();
                }
            }
            a=sc.nextInt();
            b=sc.nextInt();
            fill(a,b);
            print(m);
            System.out.println();
            print(t);
        }
        out.flush();
    }
}
