/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V11;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P1185_TheProductOfDigits {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static int smx = 13;
    static long[] map = new long[smx];
    
    public static void main(String[] args) {
        long num;
        boolean empty = false;
        long sz = 0;
        while(sc.hasNext()){
            num = sc.nextLong();
            if(num<0)break;
            if(num==0){
                out.println(10);
                continue;
            }
            if(num<10){
                out.println(num);
                continue;
            }
            if(num<0)break;
            for(int i=0;i<smx;i++)map[i] = 0;
            for(int i=9;i>1;i--){
                while(num%i==0){
                    map[i]++;
                    num/=i;
                }
            }
            empty = true;
            for(int i=0;i<=9;i++){
                if(map[i]!=0){
                    empty = false;
                    break;
                }
            }
            if(empty || num!=1){
                out.print(-1);
            }else{
                for(int i=2;i<=9;i++){
                    sz = map[i];
                    for(int j=0;j<sz;j++){
                        out.print(i);
                    }
                }
            }
            out.println();
        }
        out.close();
    }
    
}

