package V15;

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
public class P1567_FindingViruses {
    static String a="";
    public static String[][] lcsS(String a, String b){
        int m=a.length();
        int n=b.length();
        int[][]c=new int[m+1][n+1];
        String[][]d=new String[m+1][n+1];
        for(int i=0; i<=m;i++){
            c[i][0]=0;
            d[i][0]=" ";
        }
        for(int j=0; j<=n;j++){
            c[0][j]=0;
            d[0][j]=" ";
        }
        for(int i=1; i<=m;i++){
            for(int j=1; j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    c[i][j]=c[i-1][j-1]+1;
                    d[i][j]="\\"; 
                }else{
                    if(c[i-1][j]>=c[i][j-1]){
                        c[i][j]=c[i-1][j];
                        d[i][j]="|";
                    }else{
                        c[i][j]=c[i][j-1];
                        d[i][j]="-";
                    }
                }
            }
        }
        return d;   //return c and d :)
    }
    
    public static String printLcs(String[][]b, String x, int i, int j){
        if(i==0 || j==0){
            return a+"";
        }
        if(b[i][j].equals("\\")){
            printLcs(b, x, i-1, j-1);
            a+=x.charAt(i-1);
        }else{
            if(b[i][j].equals("|")){
                printLcs(b, x, i-1,j);
            }else{
                printLcs(b,x,i,j-1);
            }
        }
        return a;
    }
    
    public static String printLcs(String[][]b, String x,String y){
        return printLcs(b, x, x.length(), y.length());
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String a,b,q,r;
        a=sc.next();
        b=sc.next();
        System.out.println(printLcs(lcsS(a,b),a,b).length());
    }
}
