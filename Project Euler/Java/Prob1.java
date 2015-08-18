package source;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
public class Prob1 {
    
    public static void main(String[]Args){
        int result=0;
        
        for(int i=0; i<1000;i++){
            if(i%3==0||i%5==0){
                result+=i;
            }
        }
        
        System.out.println(result);
    }
    
}
