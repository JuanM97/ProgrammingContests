/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
public class P5 {
    
    public static long factorial(long num){
        if(num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    } //Just ignore this ...
    
    public static boolean isDiv(long num, int upM){
        for(int i=1;i<=upM;i++){
            if(num%i!=0)
                return false;
        }
        return true;
    }
    
    public static void main(String[]args){
        
        long result=20;
        int upM=20;
        
        while(true){
            if(isDiv(result, upM)){
                break;
            }else{
                result++;
            }
        }
        
        System.out.println(result);
        
    }
    
}
