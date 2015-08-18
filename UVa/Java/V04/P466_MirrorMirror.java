/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class P466_MirrorMirror {
    static char[][]a;
    static char[][]m;
    static char[][]r;
    static int i,j;
    
    public static void rotate(){
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a.length;y++){
                a[x][y]=r[x][y];
            }
        }
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a.length;y++){
                r[x][y]=a[a.length-y-1][x];
            }
        }
    }
    
    public static void reflect(){
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a.length;y++){
                a[x][y]=r[x][y];
            }
        }
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a.length;y++){
                r[x][y]=a[a.length-x-1][y];
            }
        }
    }
    
    public static void in(String s){
        for(int k=0;k<a.length;k++){
            a[i][k]=s.charAt(k);
        }
        i++;
    }
    
    public static void inM(String s){
        for(int k=0;k<m.length;k++){
            m[j][k]=s.charAt(k);
        }
        j++;
    }
    
    public static void print(char[][]a){
        for(int jx=0;jx<a.length;jx++){
            for(int kx=0;kx<a.length;kx++){
                System.out.print(a[jx][kx]+" ");
            }
            System.out.println();
        }
    }
    
    public static boolean equals(){
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a.length;y++){
                if(r[x][y]!=m[x][y]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int n,cases=1;
        String s,sM;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0)break;
            i=j=0;
            a=new char[n][n];
            m=new char[n][n];
            r=new char[n][n];
            
            for(int ix=0;ix<n;ix++){
                s=sc.next();
                sM=sc.next();
                in(s);
                inM(sM);
            }
            for(int x=0;x<a.length;x++){
                for(int y=0;y<a.length;y++){
                    r[x][y]=a[x][y];
                }
            }
            //print(r);
            if(equals()){
                out.printf("Pattern %d was preserved.%n",cases++);
            }else{
                rotate();
                if(equals()){
                    out.printf("Pattern %d was rotated 90 degrees.%n",cases++);
                }else{
                    rotate();
                    if(equals()){
                        out.printf("Pattern %d was rotated 180 degrees.%n",cases++);
                    }else{
                        rotate();
                        if(equals()){
                            out.printf("Pattern %d was rotated 270 degrees.%n",cases++);
                        }else{
                            reflect();
                            if(equals()){
                                out.printf("Pattern %d was reflected vertically and rotated 90 degrees.%n",cases++);
                            }else{
                                rotate();
                                if(equals()){
                                    out.printf("Pattern %d was reflected vertically and rotated 180 degrees.%n",cases++);
                                }else{
                                    rotate();
                                    if(equals()){
                                        out.printf("Pattern %d was reflected vertically and rotated 270 degrees.%n",cases++);
                                    }else{
                                        rotate();
                                        if(equals()){
                                            out.printf("Pattern %d was reflected vertically.%n",cases++);
                                        }else{
                                            out.printf("Pattern %d was improperly transformed.%n",cases++);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        out.flush();
    }
}
