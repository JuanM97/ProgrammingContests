/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V24;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
public class P2452_GreatPrices {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        HashMap<String,Double> prods=new HashMap();
        long t,n;
        double vp,price;
        String id;
        t=sc.nextLong();
        while(t-->0){
            n=sc.nextLong();
            prods.clear();
            System.out.println(prods.toString());
            while(n-->0){
                id=sc.next();
                vp=sc.nextDouble();
                if(!prods.containsKey(id)){
                    prods.put(id,vp);
                }else{
                    if(prods.get(id)>vp){
                        prods.remove(id);
                        prods.put(id,vp);
                    }
                }
                //System.out.println(prods.toString());
            }
            price=0;
            for(String k:prods.keySet()){
                price=price+prods.get(k);
            }
            out.printf("%.2f\n",price);
        }
        out.flush();
    }
    
}
