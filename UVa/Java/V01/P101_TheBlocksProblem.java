/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
public class P101_TheBlocksProblem {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static int numb,in1,in2,ix,ix1,ix2,bb1;
    static String i1,i2;
    static final int sz=27;
    static ArrayList<LinkedList<Integer>> ar=new ArrayList<LinkedList<Integer>>();
    static LinkedList<Integer> aux,aux1,aux2;
    
    public static void moveonto(int a, int b){
        bb1=0;
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(a)){
                ix=ar.get(i).indexOf(a);
                while(ar.get(i).contains(a)){
                    bb1=ar.get(i).pollLast();
                    if(bb1==a)break;
                    ar.get(bb1).add(bb1);
                }
                break;
            }
        }
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(b)){
                ix=ar.get(i).indexOf(b);
                while(ar.get(i).contains(b)){
                    bb1=ar.get(i).pollLast();
                    if(bb1!=b){
                        ar.get(bb1).add(bb1);
                    }else{
                        ar.get(i).add(b);
                        ar.get(i).add(a);
                        break;
                    }
                }
                break;
            }
        }
        
    }
    public static void moveover(int a, int b){
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(a)){
                ix=ar.get(i).indexOf(a);
                while(ar.get(i).contains(a)){
                    bb1=ar.get(i).pollLast();
                    if(bb1==a)break;
                    ar.get(bb1).add(bb1);
                }
                break;
            }
        }
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(b)){
                ar.get(i).add(a);
                break;
            }
        }
    }
    public static void pileonto(int a, int b){
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(a)){
                ix=ar.get(i).indexOf(a);
                aux=new LinkedList(ar.get(i).subList(ix,ar.get(i).size()));
                ar.get(i).subList(ix,ar.get(i).size()).clear();
                break;
            }
        }
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(b)){
                ix=ar.get(i).indexOf(b);
                while(ar.get(i).contains(b)){
                    bb1=ar.get(i).pollLast();
                    if(bb1!=b){
                        ar.get(bb1).add(bb1);
                    }else{
                        ar.get(i).add(b);
                        ar.get(i).addAll(aux);
                        break;
                    }
                }
                break;
            }
        }
    }
    public static void pileover(int a,int b){
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(a)){
                ix=ar.get(i).indexOf(a);
                aux=new LinkedList(ar.get(i).subList(ix,ar.get(i).size()));
                ar.get(i).subList(ix,ar.get(i).size()).clear();
                break;
            }
        }
        for(int i=0;i<numb;i++){
            if(ar.get(i).contains(b)){
                ar.get(i).addAll(aux);
                break;
            }
        }
    }
    
    public static boolean checks(int a, int b){
        int i=0,j=0;
        for(i=0;i<numb;i++){
            if(ar.get(i).contains(a))break;
        }
        for(j=0;j<numb;j++){
            if(ar.get(j).contains(b))break;
        }
        return i==j;
    }
    
    public static void main(String[]args){
        while(sc.hasNext()){
            numb=sc.nextInt();
            if(numb<0)break;
            ar.clear();
            for(int i=0;i<numb;i++){
                aux=new LinkedList();
                aux.add(i);
                ar.add(i,aux);
            }
            i1=sc.next();
            while(!i1.equals("quit")){
                in1=sc.nextInt();
                i2=sc.next();
                in2=sc.nextInt();
                if(i1.equals("move")&&i2.equals("onto")){
                    if(!checks(in1,in2))
                    moveonto(in1,in2);
                }else{
                    if(i1.equals("move")&&i2.equals("over")){
                        if(!checks(in1,in2))
                        moveover(in1,in2);
                    }else{
                        if(i1.equals("pile")&&i2.equals("onto")){
                            if(!checks(in1,in2))
                            pileonto(in1,in2);
                        }else{
                            if(!checks(in1,in2))
                            pileover(in1,in2);
                        }
                    }
                }
                i1=sc.next();
                //out.println(ar.toString());
            }
            
            //out.println(ar.toString());
            
            for(int i=0;i<ar.size();i++){
                out.printf("%d:" ,i);
                for(int j=0;j<ar.get(i).size();j++){
                    if(ar.get(i).get(j)!=null&&ar.get(i).size()>0){out.printf(" %d",ar.get(i).get(j));
                    }
                }out.println();
            }
            
        }
        out.flush();
    }
    
}
