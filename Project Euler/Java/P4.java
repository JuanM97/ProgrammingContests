/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
public class P4 {
    
    public static boolean isPalindrome(Long num){
        String c = num.toString();
        for(int i=0; i<c.length();i++){
            if(c.charAt(i)!=c.charAt(c.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[]args){
        
        long result, max=0;
        
        for(long i=100;i<999;i++){
            for(long j=100; j<999;j++){
                if(i%11==0 || j%11==0){
                    result=i*j;
                    if(isPalindrome(result)){
                        if(result>max){
                            max=result;
                        }
                    }
                }
            }
        }
        System.out.println(max);
        
    }
    
}
