/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V10;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.LinkedList;
public class P1016_Freckles {
    
    static class Punto{
        
        public Punto(double x, double y){
            this.x=x;
            this.y=y;
        }
        
        public String toString(){
            return x+" "+y;
        }
        
        double x;
        double y;
    }
    
    public static double dist(Punto a, Punto b){
        double l=Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        return l;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        LinkedList<Punto> list;
        Punto p,p2;
        int n, index;
        while(sc.hasNextInt()){
            n=sc.nextInt();
            if(n<0)break;
            list=new LinkedList<Punto>();
            while(n-->0){
                list.add(new Punto(sc.nextDouble(),sc.nextDouble()));
            }
            //System.out.println(list.toString());
            p=list.remove();
            double min,sum=0;
            index=0;
            while(!list.isEmpty()){
                min=dist(p, list.get(0));
                index=0;
                for(int i=1; i<list.size();i++){
                    if(dist(p,list.get(i))<min){
                        index=i;
                        min=dist(p,list.get(i));
                    }
                }
                sum+=min;
                p=list.remove(index);
            }
            out.printf("%.2f\n",sum);
        }
        out.flush();
    }
    
}
