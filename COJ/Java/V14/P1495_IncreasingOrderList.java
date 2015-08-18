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
public class P1495_IncreasingOrderList {
    
    public static void swap(Integer[] arr, int ind1, int ind2){
        Integer aux = arr[ind2];
        arr[ind2]=arr[ind1];
        arr[ind1]=aux;
    }
    
    public static int randomizedPartition(Integer[] arr, int p, int r){
        int rand = (int)(Math.random()*(Math.abs(p-r))+Math.min(p, r));
        swap(arr, r, rand);
        return partition(arr, p, r);
    }
    
    /*
     Another method to choose the pivot is to use the
     median value of 3 random-picked values from the 
     array :)
     */
    
    public static int partition(Integer[] arr, int p, int r){
        Integer x = arr[r];
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
    
    public static void randomizedQuickSort(Integer[] arr, int p, int r){
        if(p<r){
            int q = randomizedPartition(arr, p, r);
            randomizedQuickSort(arr, p, q-1);
            randomizedQuickSort(arr, q+1, r);
        }
    }
    
    public static void quickSort(Integer[] arr, int p, int r){
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }
    
    public static void randomizedQuickSort(Integer[]arr){
        randomizedQuickSort(arr, 0, arr.length-1);
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        randomizedQuickSort(a);
        for(int i=0; i<n;i++){
            out.println(a[i]);
        }
        out.flush();
    }
}