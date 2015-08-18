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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class P482_PermutationArrays {
    static String[]arr;
    static String[]arr2;
    static String[]ans;
    
    public static void print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(ans[i]);
        }
    }
    
    public static void main(String[]args)throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        String s;
        int t;String[]d;
        s=in.readLine().trim();
        d=s.split("\\s+");
        t=Integer.parseInt(d[0]);
        while(t-->0){
            in.readLine();
            s=in.readLine().trim();
            arr=s.split(" ");
            //System.out.println(java.util.Arrays.toString(arr));
            s=in.readLine().trim();
            arr2=s.split(" ");
            //System.out.println(java.util.Arrays.toString(arr2));
            ans=new String[arr.length];
            for(int i=0;i<arr.length;i++){
                ans[Integer.parseInt(arr[i])-1]=arr2[i];
            }
            print();
            if(t>0){
                System.out.println();
            }
            //sc.nextLine();
        }
        //out.flush();
    }
}
