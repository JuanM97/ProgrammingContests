/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V104;

/**
 *
 * @author JuanM
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.LinkedList;

//List of Conquests
public class P10420_ListOfConquests {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void insert(String p, LinkedList<String>s, LinkedList<Integer>c){
        boolean is=false;
        if(s.isEmpty()){
            s.add(p);
            c.add(1);
        }else{
            for(int i=0; i<s.size() && !is;i++){
                if(p.equals(s.get(i))){
                    c.set(i, c.get(i).intValue()+1);
                    is=true;
                    break;
                }
            }
            if(!is){
                s.add(p);
                c.add(1);
            }
        }
    }
    
    public static void print(LinkedList<String>s, LinkedList<Integer>c){
        for(int i=0; i<s.size();i++){
            out.println(s.get(i)+" "+c.get(i));
        }
    }
    
    //
    
    public static void swap(LinkedList<String> arr,LinkedList<Integer>c, int ind1, int ind2){
        String aux = arr.get(ind2);
        Integer aux2=c.get(ind2);
        arr.set(ind2, arr.get(ind1));
        c.set(ind2, c.get(ind1));
        arr.set(ind1,aux);
        c.set(ind1,aux2);
    }
    
    public static int randomizedPartition(LinkedList<String>arr, LinkedList<Integer>c, int p, int r){
        int rand = (int)(Math.random()*(Math.abs(p-r))+Math.min(p, r));
        swap(arr,c, r, rand);
        return partition(arr,c, p, r);
    }
    
    public static int partition(LinkedList<String> arr,LinkedList<Integer>c, int p, int r){
        String x = arr.get(r);
        int i = p-1;
        for(int j=p; j<r; j++){
            if(arr.get(j).compareTo(x)<=0){
                i++;
                swap(arr,c, i, j);
            }
        }
        swap(arr,c, i+1, r);
        return i+1;
    }
    
    public static void randomizedQuickSort(LinkedList<String> arr,LinkedList<Integer>c, int p, int r){
        if(p<r){
            int q = randomizedPartition(arr,c, p, r);
            randomizedQuickSort(arr,c, p, q-1);
            randomizedQuickSort(arr,c, q+1, r);
        }
    }
    
    public static void randomizedQuickSort(LinkedList<String>arr, LinkedList<Integer>c){
        randomizedQuickSort(arr,c, 0, arr.size()-1);
    }
    
    //
    
    
    public static void main(String[]args)throws IOException{
        LinkedList<Integer>count=new LinkedList<Integer>();
        LinkedList<String>countries=new LinkedList<String>();
        String espacios = "\\s+";
        String line;
        String line2;
        String country;
        int n=Integer.parseInt(in.readLine());
        for(int i=0; i<n;i++){
            line=in.readLine();
            line2=line.trim().replaceAll(espacios, " ");
            country=line2.split(espacios)[0];
            insert(country, countries, count);
            randomizedQuickSort(countries, count);
        }
        print(countries, count);
        out.flush();
    }
}
