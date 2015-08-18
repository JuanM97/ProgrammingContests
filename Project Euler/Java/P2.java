/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
public class P2 {
    
    public static int fibonacci(int i){
        if(i<=2){
            return 1;
        }else{
            return fibonacci(i-1)+fibonacci(i-2);
        }
    }
    
    public static void main(String[]args){
        long resultado=0;
        for(int i=1;fibonacci(i)<4000000;i++){
            if(i%3==0){
                resultado+=fibonacci(i);
            }
        }
        
        System.out.println(resultado);
        
    }
    
}
