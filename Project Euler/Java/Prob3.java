package source;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.math.*;
public class Prob3 {
    
    public static long divisors(long num){
        for(int i=2; i<Math.sqrt(num);i++){
            if(num%i==0){
                if(esPrimo(i))
                    return i;
            }
        }
        return 0; //Es primo
    }
    
    public static boolean esPrimo(long num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[]args){
        long max=0;
        long num = 600851475143L;
        
        //System.out.println(num);
        
        while(num>=1){
            long div;
            if(divisors(num)!=0){
                div=divisors(num);
            }else{
                max=num;
                break;
            }
            num/=div;
               if(max<div){
                   max=div;
               }
            //System.out.println(div);
        }
        
        System.out.println(max);
        
    }
    
}
