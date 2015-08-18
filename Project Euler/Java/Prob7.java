package source;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
public class Prob7 {
    
    public static boolean isPrime(long num){
        int numD=0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[]args){
        int count=2;
        long num=3;
        int numPrime=10001;
        while(count<numPrime){
            num+=2;
            if(isPrime(num)){
                count++;
            }
        }
        
        System.out.println(num);
        
    }
}
