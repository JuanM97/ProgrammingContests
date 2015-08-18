package V04;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

//PI
public class P412_Pi {
    
    static int MCD(int a, int b){
        if(a%b==0){
            return b;
        }else{
            return MCD(b,a%b);
        }
    }
    
    static int factorial(int num){
        if(num==1 || num==0){
            return 1;
        }else{
        return (factorial(num-1)*num);
        }
    }
    
    static int total(int num){
        return (factorial(num))/(factorial(num-2)*2);
    }
    
    static double result(int total, int cont){
        return Math.sqrt(6*total/cont);
    }
    
    
    public static void main(String[]args){
        
        int cont=0;
        int[]arr = {2,3,4,5,6};
        
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(MCD(arr[i], arr[j])==1){
                    cont++;
                }
            }
        }
        
        int total = total(arr.length);
        
        System.out.println(total + " " + cont +" " +result(total, cont/2));
        
        
    }
    
}
