/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class P120_StackOfFlapjacks {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int pancakes[], bgst;
    
    static boolean isOrdered(){
        for(int i=1;i<pancakes.length;i++){
            if(pancakes[i]<pancakes[i-1])
                return false;
        }
        return true;
    }
    
    static int getBiggestIdx(int a){
        int idx = 0;
        bgst = -1;
        for(int i=0;i<pancakes.length-a;i++){
            if(pancakes[i]>bgst){
                bgst = pancakes[i];
                idx = i;
            }
        }
        return idx;
    }
    
    static void flip(int x){
        int a,b;
        for(int i=0;i<(int)Math.ceil((double)(x)/2);i++){
            a = pancakes[x-i];
            //out.print("a: "+a+" A:");
            pancakes[(x)-i] = pancakes[i];
            //out.println(pancakes[x-i]);
            pancakes[i] = a;
        }
    }
    
    public static void main(String[]args){
        String line[];
        int biggestIdx = 0, idxSh = 0;
        while(sc.hasNext()){
            line = sc.nextLine().trim().split("\\s+");
            if(line[0].equals("p")) break;
            if(line.length == 0){
                out.println(0);
                continue;
            }
            pancakes = new int[line.length];
            {
                int i = 0;
                for(String s : line){
                    pancakes[i] = Integer.parseInt(s);
                    out.print(pancakes[i++]);
                    if(i!=line.length)out.print(" ");
                }out.println();
            }
            //out.println(Arrays.toString(pancakes));
            idxSh = 0;
            boolean isF = true;
            while(true){
                if(isOrdered()){
                    out.println(0+" ");
                    break;
                }
                //out.println(Arrays.toString(pancakes));
                biggestIdx = getBiggestIdx(idxSh);
                //out.println("idx: "+biggestIdx+" "+(pancakes.length-(idxSh+1)));
                if(biggestIdx == pancakes.length-(idxSh+1)){
                    idxSh++;
                    continue;
                }
                if(biggestIdx == 0){
                    out.print((idxSh+1)+" ");
                    if(pancakes.length-idxSh<0)break;
                    flip(pancakes.length-idxSh-1);
                }else{
                    out.print((pancakes.length-biggestIdx)+" ");
                    flip(biggestIdx);
                    //out.println(Arrays.toString(pancakes));
                    out.print((idxSh+1)+" ");
                    flip(pancakes.length-idxSh-1);
                }
                idxSh++;
            }
            
        }
        out.flush();
    }
}


