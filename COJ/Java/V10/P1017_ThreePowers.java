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

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.LinkedList;
public class P1017_ThreePowers {
    
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static LinkedList<BigInteger>l=new LinkedList<BigInteger>();
    static final int smx=103;
    static BigInteger powersOf3[]=new BigInteger[smx];
    static BigInteger powersOf2[]=new BigInteger[smx];

    static void preCalc(){
        powersOf3[0]=BigInteger.ZERO;
        powersOf3[1]=BigInteger.ONE;
        for(int i=2;i<smx;i++){
            powersOf3[i]=powersOf3[i-1].multiply(BigInteger.valueOf(3));
        }
        powersOf2[0]=BigInteger.ZERO;
        powersOf2[1]=BigInteger.ONE;
        for(int i=2;i<smx;i++){
            powersOf2[i]=powersOf2[i-1].multiply(BigInteger.valueOf(2));
        }
    }

    static void printt(){
        for(int i=0;i<smx;i++){
            System.out.printf("%s ",powersOf2[i].toString());
        }System.out.printf("\n");
        for(int i=0;i<smx;i++){
            System.out.printf("%s ",powersOf3[i].toString());
        }System.out.printf("\n");
    }
    
    static int getPowerOf2(BigInteger n){
        int idx=1;
        while(n.compareTo(powersOf2[idx])>=0){idx++;};
        return idx;
    }
    
    static void printList(){
        out.printf("{ %s",l.get(0).toString());
        for(int i=1;i<l.size();i++){
            out.printf(", %s",l.get(i).toString());
        }
        out.println(" }");
    }
    
    public static void main(String[]args){
        preCalc();
        //printt();
        BigInteger n;
        int b;
        n=sc.nextBigInteger();
        while(n.compareTo(BigInteger.ZERO)>0){
            l.clear();
            n=n.subtract(BigInteger.ONE);
            while(n.compareTo(BigInteger.ZERO)>0){
                b=getPowerOf2(n)-1;
                //out.printf("%s ",powersOf3[b].toString());
                l.addFirst(powersOf3[b]);
                n=n.subtract(powersOf2[b]);
            }
            if(l.size()>0)printList();
            else out.println("{ }");
            n=sc.nextBigInteger();
        }
        out.flush();
    }
    
}
