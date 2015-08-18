/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V104;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;
public class P10407_SimpleDivision {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static int getMin(LinkedList<Integer>l){
        int min=Math.abs(l.get(0));
        for(int i=1;i<l.size();i++){
            if(Math.abs(l.get(i))<min){
                min=l.get(i);
            }
        }
        return min;
    }
    
    public static int getNum(LinkedList<Integer>l){
        int ans=1;
        boolean done=false;
        int min=getMin(l);
        int r,rt;
        for(int i=min;i>1;i--){
            r=l.get(0)%i>=0?l.get(0)%i:l.get(0)%i+i;
            if(!done){
                for(int j=1;j<l.size();j++){
                    rt=l.get(j)%i>=0?l.get(j)%i:l.get(j)%i+i;
                    if(r!=rt){
                        break;
                    }else{
                        if(j==l.size()-1){
                            ans=i;
                            done=true;
                            break;
                        }
                    }  
                }
            }else{
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0){
            LinkedList<Integer> l=new LinkedList<Integer>();
            l.add(num);
            num=sc.nextInt();
            while(num!=0){
                l.add(num);
                num=sc.nextInt();
            }
            num=sc.nextInt();
            out.println(getNum(l));
        }
        out.flush();
    }
}
