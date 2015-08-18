/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V18;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.io.PrintWriter;
import java.util.Arrays;
public class P1835_FindingKthRepetitions {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    static final int lmax=1003;
    static int nums[]=new int[lmax];
    static LinkedHashMap<Integer,Integer> hm=new LinkedHashMap();
    
    public static void main(String[]args){
        int n,k,q,a,b,v;
        boolean c3;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==-1)break;
            k=sc.nextInt();
            q=sc.nextInt();            
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            for(int i=0;i<q;i++){
                hm.clear();
                a=sc.nextInt();
                b=sc.nextInt();
                for(int j=a-1;j<b;j++){
                    if(hm.containsKey(nums[j])){
                        hm.put(nums[j],hm.get(nums[j])+1);
                    }else{
                        hm.put(nums[j],1);
                    }
                }
                //System.out.println(hm.toString());
                c3=false;v=0;
                for(int key:hm.keySet()){
                    if(hm.get(key)>=k){
                        v=key;
                        c3=true;
                        break;
                    }
                }
                if(c3){
                    out.println("YES "+v);
                }else{
                    out.println("NO");
                }
            }
        }
        out.flush();
    }
}
