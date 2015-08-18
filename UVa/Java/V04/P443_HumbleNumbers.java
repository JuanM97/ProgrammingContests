/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V04;

/**
 *
 * @author JuanM
 */

import java.util.Queue;
import java.util.LinkedList;
import java.io.PrintWriter;
import java.util.Scanner;
public class P443_HumbleNumbers {
    
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static LinkedList<Long> hn=new LinkedList<Long>();
    static Queue<Long> q2=new LinkedList<Long>();
    static Queue<Long> q3=new LinkedList<Long>();
    static Queue<Long> q5=new LinkedList<Long>();
    static Queue<Long> q7=new LinkedList<Long>();
    
    static void getMin(){
        if(!q2.isEmpty()&&q2.peek()<q3.peek()&&q2.peek()<q5.peek()&&q2.peek()<q7.peek()){
            q2.add(2*q2.peek());
            hn.add(q2.poll());
        }else{
            if(!q3.isEmpty()&&q3.peek()<q2.peek()&&q3.peek()<q5.peek()&&q3.peek()<q7.peek()){
                q2.add(2*q3.peek());
                q3.add(3*q3.peek());
                hn.add(q3.poll());
            }else{
                if(!q5.isEmpty()&&q5.peek()<q2.peek()&&q5.peek()<q3.peek()&&q5.peek()<q7.peek()){
                    q2.add(2*q5.peek());
                    q3.add(3*q5.peek());
                    q5.add(5*q5.peek());
                    hn.add(q5.poll());
                }else{
                    if(!q7.isEmpty()){
                        q2.add(2*q7.peek());
                        q3.add(3*q7.peek());
                        q5.add(5*q7.peek());
                        q7.add(7*q7.peek());
                        hn.add(q7.poll());
                    }
                }
            }
        }
    }
    
    public static void main(String[]args){
        
        int n;
        String th;
        q2.add(2L);
        q3.add(3L);
        q5.add(5L);
        q7.add(7L);
        hn.add(0L);
        hn.add(1L);
        do{
            getMin();
        }while(hn.size()<6000);
        /*
        for(int i=0;i<30;i++){
            System.out.print(hn.get(i)+" ");
        }System.out.println();
        */
        n=sc.nextInt();
        do{
            if(n%10==1&&(n%100)/10!=1){
                th="st";
            }else if(n%10==2&&(n%100)/10!=1){
                th="nd";
            }else if(n%10==3&&(n%100)/10!=1){
                th="rd";
            }else th="th";
            out.printf("The %d%s humble number is %d.\n",n,th,hn.get(n));
            n=sc.nextInt();
        }while(n!=0);
        out.flush();
    }
    
}
