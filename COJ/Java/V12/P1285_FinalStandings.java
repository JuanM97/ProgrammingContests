/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V12;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1285_FinalStandings {
    
    /*************************************************/
    public static void merge(Integer[][]arr, int p, int q, int r){
        Integer n1=q-p+1, n2=r-q;
        Integer[][]L=new Integer[n1+1][2];
        Integer[][]R=new Integer[n2+1][2];
        for(int i=0; i<n1;i++){
            L[i][0]=arr[p+i][0];
            L[i][1]=arr[p+i][1];
        }
        for(int j=0; j<n2;j++){
            R[j][0]=arr[q+j+1][0];
            R[j][1]=arr[q+j+1][1];
        }
        L[n1][0]=Integer.MAX_VALUE;    //...
        L[n1][1]=Integer.MAX_VALUE;    //...
        R[n2][0]=Integer.MAX_VALUE;
        R[n2][1]=Integer.MAX_VALUE;
        int i=0,j=0;
        for(int k=p; k<=r;k++){
            if(L[i][1].compareTo(R[j][1])<0){
                arr[k][0]=L[i][0];
                arr[k][1]=L[i][1];
                i=i+1;
            }else{
                arr[k][0]=R[j][0];
                arr[k][1]=R[j][1];
                j=j+1;
            }
        }
        
    }
    
    public static void mergeSort(Integer[][] arr, int p, int r){
        if(p<r){
            int q=(int)Math.floor((p+r)/2);
            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);
            merge(arr, p, q, r);
        }
    }
    
    public static void mergeSort(Integer[][] arr){
        mergeSort(arr, 0, t-1);
    }
    
    public static void print(int b){
        for(int i=b-1;i>=0;i--){
            out.println(nums[i][0]+" "+nums[i][1]);
        }
    }
    
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static int t,a,b;
    static Integer nums[][]=new Integer[100009][2];
    
    public static void main(String[]args){
        
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        
        mergeSort(nums);
        print(t);
        
        out.flush();
    }
    
}

