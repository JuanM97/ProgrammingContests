/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
public class P6 {
    
    public static void main(String[]args){
        int sumOfSquares=0, squareOfSum=0;
        int num=100;
        int result=0;
        
        for(int i=1;i<=num;i++){
            sumOfSquares+=Math.pow(i, 2);
            squareOfSum+=i;
        }
        
        squareOfSum*=squareOfSum;
        
        result=Math.abs(squareOfSum-sumOfSquares);
        
        System.out.println(result);
        
    }
    
}
