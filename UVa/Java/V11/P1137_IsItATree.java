/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V11;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
public class P1137_IsItATree {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int a,b,caseNumber = 1, cZ, cO;
        boolean solveNow = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a<0 && b<0)break;
            if(a==0 && b==0){
                solveNow = true;
            }else{
                //if(a==b){
                    /*if(!map.containsKey(b)){
                        map.put(b,0);
                    }*/
                //}else{
                    if(!map.containsKey(a)) map.put(a,0);
                    if(!map.containsKey(b)){
                        map.put(b,1);
                    }else{
                        map.put(b,map.get(b)+1);
                    }
                //}
            }
            if(solveNow){
                cZ = 0; cO = 0;
                for(Integer n : map.keySet()){
                    //System.out.print(n+" "+map.get(n)+"--- ");
                    if(map.get(n).equals(0))cZ++;
                    if(map.get(n).compareTo(1)>0)cO++;
                }//System.out.println();
                if(map.isEmpty())cZ=1;
                if(cZ==1 && cO==0) out.printf("Case %d is a tree.%n",caseNumber++);
                else out.printf("Case %d is not a tree.%n",caseNumber++);
                solveNow = false;
                map.clear();
            }
            
        }
        out.close();
    }
    
}

