package V113;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;
//Number Theory for Newbies
public class P11371NumberTheory4Newbies {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void swap(String[] arr, int i, int j){
        if(i<arr.length && j<arr.length && i>=0 && j>=0 && j!=i){
            String aux = arr[i];
            arr[i] = arr[j];
            arr[j] = aux;
        }
    }
    
    public static void quick(String[] arr, int ini, int fin){
        if(ini<fin){
            String pivote = arr[fin];
            int i=ini;
            int j=fin-1;
            while(i<=j){
                if(arr[i].compareTo(pivote)>0 && pivote.compareTo(arr[j])>0){
                    swap(arr,i,j);
                    i++;
                    j--;
                }
                else{
                    if(arr[i].compareTo(pivote)<=0){
                        i++;
                    }
                    else{
                        if(arr[j].compareTo(pivote)>=0){
                            j--;
                        }
                    }
                }
            }
            arr[fin] = arr[i];
            arr[i] = pivote;
            quick(arr,ini,i-1);
            quick(arr,i+1,fin);
        }
    }
    
    public static String[] reverse(String[]ar){
        String[]r= new String[ar.length];
        for(int i=0; i<ar.length;i++){
            r[i]=ar[ar.length-i-1];
        }
        return r;
    }
    
    public static int getNum(String[]ar){
        String num="";
        for(int i=0;i<ar.length;i++){
            num+=ar[i];
        }
        return Integer.parseInt(num);
    }
    
    public static String[]toArray(String s){
        String[]r=new String[s.length()];
        for(int i=0; i<s.length();i++){
            r[i]=s.charAt(i)+"";
        }
        return r;
    }
    
    public static int getMin(String[] ar){
        int min=Integer.parseInt(ar[ar.length-1]);
        for(int i=1; i<ar.length; i++){
            if(!ar[i].equals("0") && Integer.parseInt(ar[i])<min){
                min=i;
            }
        }
        return min;
    }
    
    public static void verify(String[] ar){
        int cont=0;
        if(getNum(ar)!=0){
        while(ar[cont].equals("0")){
            cont++;
        }
        swap(ar, 0, cont);
        }
    }
    
    public static void main(String[]args)throws IOException{
        String line;
        while((line=in.readLine())!=null){
            if(line.length()==0 || line==null){
                break;
            }else{
                String espacios = "\\s+";
                String line2 = line.trim().replaceAll(espacios, " ");
                String[] numOrd = toArray(line2);
                quick(numOrd, 0, numOrd.length-1);
                String []numInv=reverse(numOrd);
                verify(numOrd);
                int n1=getNum(numOrd);
                int n2 = getNum(numInv);
                if(n1!=0){
                    out.println(n2 + " - " +n1 +" = " +(n2-n1)+" = " + "9 * "+((n2-n1)/9));
                }else{
                    out.println("0 - 0 = 0 = 9 * 0");
                }
            }
        }
        out.flush();
    }
    
}
