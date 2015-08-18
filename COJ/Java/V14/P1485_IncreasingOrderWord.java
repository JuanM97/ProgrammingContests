package V14;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1485_IncreasingOrderWord {
    
    public static void swap(char[] arr, int ind1, int ind2){
        char aux = arr[ind2];
        arr[ind2]=arr[ind1];
        arr[ind1]=aux;
    }
    
    public static int randomizedPartition(char[] arr, int p, int r){
        int rand = (int)(Math.random()*(Math.abs(p-r))+Math.min(p, r));
        swap(arr, r, rand);
        return partition(arr, p, r);
    }
    
    /*
     Another method to choose the pivot is to use the
     median value of 3 random-picked values from the 
     array :)
     */
    
    public static int partition(char[] arr, int p, int r){
        char x = arr[r];
        int i = p-1;
        for(int j=p; j<r; j++){
            if(arr[j]<=x){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }
    
    public static void randomizedQuickSort(char[] arr, int p, int r){
        if(p<r){
            int q = randomizedPartition(arr, p, r);
            randomizedQuickSort(arr, p, q-1);
            randomizedQuickSort(arr, q+1, r);
        }
    }
    
    public static void quickSort(char[] arr, int p, int r){
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }
    
    public static void randomizedQuickSort(char[]arr){
        randomizedQuickSort(arr, 0, arr.length-1);
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String g;
        String c=sc.next();
        char[]a=c.toCharArray();
        randomizedQuickSort(a);
        System.out.println(a);
    }
}
