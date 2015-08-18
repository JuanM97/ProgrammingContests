package V03;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

//Equation Elation
public class P397_EquationElation {
    
    static long factorial(int num){
        if(num==0){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    
    public static void main (String [] args){
        
        System.out.println(factorial(20));
        
        
    }
    
}
