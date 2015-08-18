/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V25;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
public class P2520_Anime {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out =new PrintWriter(System.out);
    static int t,n,p,j,f,aux;
    static LinkedList<Integer> recd=new LinkedList<Integer>();
    static LinkedList<Integer> fllr=new LinkedList<Integer>();
    static LinkedList<Integer> epsl=new LinkedList<Integer>();
    static LinkedList<Integer> epsl2=new LinkedList<Integer>();
    static LinkedList<Integer> mdel=new LinkedList<Integer>();
    
    
    public static void main(String[]args){
        t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            p=sc.nextInt();
            j=sc.nextInt();
            f=sc.nextInt();
            epsl.clear();
            recd.clear();
            fllr.clear();
            epsl2.clear();
            mdel.clear();
            for(int i=p+1;i<=n;i++){
                epsl.add(i);
            }
            for(int i=0;i<j;i++){
                aux=sc.nextInt();
                recd.add(aux);
            }
            for(int i=0;i<f;i++){
                aux=sc.nextInt();
                fllr.add(aux);
            }
            
            boolean f1=false,f2=false;
            for(int i=0;i<epsl.size();i++){
                f1=false;
                for(int k=0;k<recd.size();k++){
                    if(epsl.get(i)==recd.get(k)){
                        f1=true;
                    }
                }
                f2=false;
                for(int k=0;k<fllr.size();k++){
                    if(epsl.get(i)==fllr.get(k)){
                        f2=true;
                    }
                }
                if(!f1&&!f2&&!epsl2.contains(epsl.get(i))){
                    epsl2.add(epsl.get(i));
                }
            }
            
            out.printf("%d",epsl2.size());
            Collections.sort(epsl2);
            for(int i=0;i<epsl2.size();i++){
                out.printf(" %d",epsl2.get(i));
            }out.println();
            
            f1=false;f2=false;
            for(int i=0;i<recd.size();i++){
                f1=false;
                
                if(recd.get(i)<=p){
                    if(!mdel.contains(recd.get(i)))
                    mdel.add(recd.get(i));
                    f1=true;
                }
                
                for(int k=0;k<fllr.size();k++){
                    if(recd.get(i)==fllr.get(k)){
                        if(!mdel.contains(recd.get(i)))
                        mdel.add(recd.get(i));
                    }
                }
            }
            
            out.printf("%d",mdel.size());
            Collections.sort(mdel);
            for(int i=0;i<mdel.size();i++){
                out.printf(" %d",mdel.get(i));
            }out.println();
            
        }
        out.flush();
    }
}
