/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V108;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.LinkedList;
public class P10892_LCMCardinality {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static LinkedList<Integer>ar(int num){
        LinkedList<Integer>div=new LinkedList<Integer>();
        int k=0;
        for(int i=1; i<=num;i++){
            if(num%i==0){
                div.add(i);
            }
        }
        return div;
    }
    
    public static int euclidgcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return euclidgcd(b,a%b);
        }
    }
    
    public static int lcmCard(LinkedList<Integer> a, int num){
        int cont=a.size();
        int ml=cont;
        int min, max;
        for(int i=0;i<ml;i++){
            for(int j=i+1; j<ml;j++){
                if(a.get(j)<a.get(i)){
                    min=a.get(j);
                    max=a.get(i);
                }else{
                    min=a.get(i);
                    max=a.get(j);
                }
                if(max%min!=0 && max*min/euclidgcd(min,max)==num){
                    cont++;
                }
            }
        }
        
        return cont;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        while(num!=0){
            out.println(num+" "+lcmCard(ar(num),num));
            num=sc.nextInt();
        }
        out.flush();
    }
}
