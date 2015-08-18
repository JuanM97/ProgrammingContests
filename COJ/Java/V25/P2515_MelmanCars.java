/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V25;

/**
 *
 * @author JuanManuel
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
public class P2515_MelmanCars {
    
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
    
    public static int[][] lcsN(String a, String b){
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
        return c;   //return c and d :)
    }
    
    public static void printArrayS(String[][]a){
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                if(a[i][j]!=null)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
                
    }
    
    public static void printArrayN(int[][]a){
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void printLcs(String[][]b, String x, int i, int j){
        if(i==0 || j==0)
            return;
        if(b[i][j].equals("\\")){
            printLcs(b, x, i-1, j-1);
            System.out.print(x.charAt(i-1));
        }else{
            if(b[i][j].equals("|")){
                printLcs(b, x, i-1,j);
            }else{
                printLcs(b,x,i,j-1);
            }
        }
    }
    
    public static void printLcs(String[][]b, String x,String y){
        printLcs(b, x, x.length(), y.length());
    }
    
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        
        int mat[][]=new int[105][105];
        
        int n,mind=0,minc=0;
        String a,b,s;
        String cit[]=new String[105];
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0)break;
            for(int i=0;i<n;i++){
                cit[i]=sc.next();
            }
            minc=0;mind=100000;
            for(int i=0;i<n;i++){
                a=cit[i];
                minc=-1;
                for(int j=0;j<n;j++){
                    if(i==j)continue;
                    b=cit[j];
                    mat[i][j]=lcsN(a,b)[lcsN(a,b).length-1][lcsN(a,b)[0].length-1]+1;
                    mat[j][i]=lcsN(a,b)[lcsN(a,b).length-1][lcsN(a,b)[0].length-1]+1;
                    if(mat[i][j]>minc)minc=mat[i][j];
                }
                if(minc<mind)mind=minc;
            }
            out.println(mind);
        }
        out.flush();
        /*
        String a="STRANGECITY";
        String b="M3LM4N";
        //printArrayS(lcsS(a,b));
        //printArrayN(lcsN(a,b));
        
        System.out.println(a+"\n"+b);
        System.out.println("lcs lenght = "+lcsN(a,b)[lcsN(a,b).length-1][lcsN(a,b)[0].length-1]);
        
        printLcs(lcsS(a,b),a,b);
        System.out.println();
        */
        
    }
       
}

