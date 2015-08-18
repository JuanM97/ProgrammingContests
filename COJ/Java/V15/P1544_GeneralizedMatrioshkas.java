/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V15;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;
public class P1544_GeneralizedMatrioshkas {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
        Stack<Integer>mat=new Stack();
        Stack<Integer>dif=new Stack();
        int nums[]=new int[1000003];
        int idx,jx,m,d;
        boolean nt=false;
        String line,ls[];
        while(sc.hasNext()){
            line=sc.nextLine().trim();
            if(line.equals("000"))break;
            ls=line.split("\\s+");
            idx=0;
            nt=false;
            for(String s:ls){
                nums[idx++]=Integer.parseInt(s);
            }
            mat.clear();
            dif.clear();
            jx=0;
            while(jx<idx){
                m=nums[jx++];
                //if(!nt){
                    if(m<0){
                        m*=-1;
                        mat.push(m);
                        if(dif.isEmpty()){
                            dif.push(m);
                        }else{
                            d=dif.pop();
                            d-=m;
                            if(d<=0){
                                nt=true;
                                break;
                            }
                            dif.push(d);
                            dif.push(m);
                        }
                    }else{
                        if(mat.isEmpty()||mat.peek()!=m){
                            nt=true;
                            break;
                        }
                        mat.pop();
                        dif.pop();
                    }
                //}
            }
            
            if(!mat.isEmpty()) nt=true;
            
            out.printf("%s\n",nt?":-( Try again.":":-) Matrioshka!");
            
        }
        out.flush();
    }
    
}
