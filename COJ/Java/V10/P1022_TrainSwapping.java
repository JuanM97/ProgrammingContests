/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V10;


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
public class P1022_TrainSwapping {
    
    public static int bubbleSort(int[] arr) {
        boolean swapped = true;
        int c=0;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {                                       
                  if (arr[i] > arr[i + 1]) {                          
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        swapped = true;
                        c++;
                  }
            }                
        }
        return c;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int t=sc.nextInt();
        int n,c;
        int[]a;
        while(t-->0){
            n=sc.nextInt();
            a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            c=bubbleSort(a);
            out.println("Optimal train swapping takes "+c+" swaps.");
        }
        out.flush();
    }
}

