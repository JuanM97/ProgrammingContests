/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V25;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class P2519_PostfixExpressionEvaluation {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static Stack<Integer> st = new Stack();
    static Queue<Integer> qu = new LinkedList();
    static PriorityQueue<Integer> pq = new PriorityQueue();
    
    static int getOp(String a){
        if(a.equals("+"))return 1;
        if(a.equals("-"))return 2;
        if(a.equals("*"))return 3;
        return -1;
    }
    
    public static void main(String[]args){
        int t,n,op,a=0,b=0,r=0;
        String line,tok[];
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            st.clear();
            qu.clear();
            pq.clear();
            line=sc.nextLine().trim();
            tok=line.split("\\s+");
            for(int i=0;i<tok.length;i++){
                op=getOp(tok[i]);
                if(op<0){
                    st.push(Integer.parseInt(tok[i]));
                    qu.offer(Integer.parseInt(tok[i]));
                    pq.offer(Integer.parseInt(tok[i]));
                }else{
                    b=st.pop();
                    a=st.pop();
                    if(op==1)st.push(a+b);
                    if(op==2)st.push(a-b);
                    if(op==3)st.push(a*b);
                    
                    b=qu.poll();
                    a=qu.poll();
                    if(op==1)qu.offer(a+b);
                    if(op==2)qu.offer(a-b);
                    if(op==3)qu.offer(a*b);
                    
                    b=pq.poll();
                    a=pq.poll();
                    if(op==1)pq.offer(a+b);
                    if(op==2)pq.offer(a-b);
                    if(op==3)pq.offer(a*b);
                }
            }
            out.printf("%d %d %d\n",st.pop(),qu.poll(),pq.poll());
        }
        out.flush();
        
    }
    
}
