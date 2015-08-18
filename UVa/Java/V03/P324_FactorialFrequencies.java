package V03;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.math.BigInteger;
public class P324_FactorialFrequencies {
    
    
    public static BigInteger factorial(int n){
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        BigInteger m = new BigInteger((n-1)+"");
        BigInteger result = new BigInteger(n+"");
        if(result.equals(one) || result.equals(zero)){
            return one;
        }else{
            return result.multiply(factorial(n-1));
        }
    }
    
    public static int[] contar(BigInteger bi){
        int[]ar=new int[10];
        String s = bi.toString();
        for(int i=0; i<s.length();i++){
            ar[(int)(s.charAt(i))-48]++;
        }
        return ar;
    }
    
    public static void print(int[]ar){
        /*System.out.println( "\t(0)\t"+ar[0]+"\t(1)\t"+ar[1]+"\t(2)\t"+ar[2]+"\t(3)\t"+ar[3]+"\t(4)\t"+ar[4]+"\n"+
                            "\t(5)\t"+ar[5]+"\t(6)\t"+ar[6]+"\t(7)\t"+ar[7]+"\t(8)\t"+ar[8]+"\t(9)\t"+ar[9]);*/
        System.out.println( " (0) "+ar[0]+" (1) "+ar[1]+" (2) "+ar[2]+" (3) "+ar[3]+" (4) "+ar[4]+"\n"+
                            " (5) "+ar[5]+" (6) "+ar[6]+" (7) "+ar[7]+" (8) "+ar[8]+" (9) "+ar[9]);
    }
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0){
            System.out.println(num+"! --");
            print(contar(factorial(num)));
            num=sc.nextInt();
        }
        
        
    }
}

