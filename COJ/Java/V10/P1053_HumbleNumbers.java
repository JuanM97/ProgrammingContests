package V10;

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
import java.util.LinkedList;
public class P1053_HumbleNumbers {
    
    public static void swap(LinkedList<Long> arr, int ind1, int ind2){
        Long aux = arr.get(ind2);
        arr.set(ind2, arr.get(ind1));
        arr.set(ind1,aux);
    }
    
    //The original Partitioning method: Hoare Partition :D
    public static int hoarePartition(LinkedList<Long> arr, int p, int r){
        Long x = arr.get(p);
        int i=p-1;
        int j=r+1;
        while(true){
            do{
                j--;
            }while(arr.get(j).compareTo(x)>0);
            do{
                i++;
            }while(arr.get(i).compareTo(x)<0);
            if(i<j){
                swap(arr, i, j);
            }else{
                return j;
            }
        }
                
    }
    
    
    public static int randomizedPartition(LinkedList<Long> arr, int p, int r){
        int rand = (int)(Math.random()*(Math.abs(p-r))+Math.min(p, r));
        swap(arr, r, rand);
        return partition(arr, p, r);
    }
    
    public static int partition(LinkedList<Long> arr, int p, int r){
        Long x = arr.get(r);
        int i = p-1;
        for(int j=p; j<r; j++){
            if(arr.get(j).compareTo(x)<=0){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }
    
    public static void randomizedQuickSort(LinkedList<Long> arr, int p, int r){
        if(p<r){
            int q = randomizedPartition(arr, p, r);
            randomizedQuickSort(arr, p, q-1);
            randomizedQuickSort(arr, q+1, r);
        }
    }
    
    public static void quickSort(LinkedList<Long> arr, int p, int r){
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }
    
    public static void randomizedQuickSort(LinkedList<Long>arr){
        randomizedQuickSort(arr, 0, arr.size()-1);
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        long n,k;
        Long[]a;
        LinkedList<Long>l;
        int i,s;
        long num;
        while(sc.hasNextLong()){
            n=sc.nextLong();
            l=new LinkedList<Long>();
            //if(n==0)break;
            k=sc.nextLong();
            num=n-2;
            a=new Long[(int)n];
            i=0;
            while(n-->0){
                a[i++]=sc.nextLong();
            }
            for(int m=0;m<a.length;m++){
                l.add(a[m]);
                for(int j=0;j<a.length;j++){
                    if(m!=j/*&&!l.contains(a[m]*a[j])*/){
                        l.add(a[m]*a[j]);
                    }
                }
            }
            //System.out.println(l.toString());
            while(num-->0){
                s=l.size();
                for(int m=0;m<s;m++){
                    for(int j=0;j<a.length;j++){
                        if(m!=j && !l.contains(l.get(m)*a[j])){
                            l.add(l.get(m)*a[j]);
                        }
                    }
                }
            }
            randomizedQuickSort(l);
            //System.out.println(l.toString());
            out.println(l.get((int)k+1));
        }
        out.flush();
    }
}
