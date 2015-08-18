/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V118;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P11858_FroshWeek {
    static int[]a;
    
    //***********
    public void merge(int p, int q, int r){
        int n1=q-p+1, n2=r-q;
        int[]L=new int[n1+1];
        int[]R=new int[n2+1];
        for(int i=0; i<n1;i++)
            L[i]=a[p+i];
        for(int j=0; j<n2;j++)
            R[j]=a[q+j+1];
        L[n1]=Integer.MAX_VALUE;    //...
        R[n2]=Integer.MAX_VALUE;
        int i=0,j=0;
        for(int k=p; k<=r;k++){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i=i+1;
            }else{
                a[k]=R[j];
                j=j+1;
            }
        }
        
    }
    
    public void mergeSort(int p, int r){
        if(p<r){
            int q=(int)Math.floor((p+r)/2);
            mergeSort(p, q);
            mergeSort(q+1, r);
            merge(p, q, r);
        }
    }
    
    public void mergeSort(){
        mergeSort(0, a.length-1);
    }    
    //*******************
    
    public static void swap(int i, int j){
        int aux=a[i];
        a[i]=a[j];
        a[j]=aux;
    }
    
    public static long bubbleSort(){
        long c=0;
        boolean swapped=true;
        while(swapped){
            swapped=false;
            for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    swap(i,i+1);
                    c++;
                    swapped=true;
                }
            }
        }
        return c;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        while(sc.hasNext()){
            int t=sc.nextInt();
            if(t==0)break;
            a=new int[t];
            for(int i=0;i<t;i++){
                a[i]=sc.nextInt();
            }
            out.println(bubbleSort());
        }
        out.flush();
    }
}
