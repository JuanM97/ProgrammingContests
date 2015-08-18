package V22;

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
public class P2205_CountingOnes {
    static final int max=1005;
    static int[] ns=new int[max];
    
    public static void fa(){
        ns[0]=0;
        ns[1]=1;
        ns[2]=2;
        for(int i=3;i<max;i++){
            ns[i]=ns[i-1]+getN(Integer.toBinaryString(i));
        }
    }
    
    public static int getN(String s){
        int c=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        int a,b;
        fa();
        //System.out.println(java.util.Arrays.toString(ns));
        while(t-->0){
            a=sc.nextInt();
            b=sc.nextInt();
            out.println(ns[b]-ns[a]+getN(Integer.toBinaryString(a)));
        }
        out.flush();
    }
}
