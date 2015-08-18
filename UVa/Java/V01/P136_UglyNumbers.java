package V01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

//A number n is ugly if its factors are just 2, 3 and/or 5. Determine the 1500th ugly number :)

//Ugly Numbers
public class P136_UglyNumbers {
    
    public static long uglyNumber(int n){
        long ugly=0,act=0,prev=0, next=0;
        long[]matrix = new long[n];
        matrix[0]=1;
        while(ugly<n-1){
            while(matrix[(int)prev]*2<=matrix[(int)ugly])
                prev++;
            while(matrix[(int)act]*3<=matrix[(int)ugly])
                act++;
            while(matrix[(int)next]*5<=matrix[(int)ugly])
                next++;
            if(matrix[(int)prev]*2<matrix[(int)act]*3 && matrix[(int)prev]*2<matrix[(int)next]*5){
                ugly++;
                matrix[(int)ugly]=2*matrix[(int)prev];
                prev++;
            }else{
                if(matrix[(int)act]*3<matrix[(int)next]*5){
                    ugly++;
                    matrix[(int)ugly]=3*matrix[(int)act];
                    act++;
                }else{
                    ugly++;
                    matrix[(int)ugly]=5*matrix[(int)next];
                    next++;
                }
            }
        }
        return matrix[(int)ugly];
    }
    
    public static void main(String[]args){
        
        int n=1500;
        
        System.out.println("The 1500'th ugly number is " +uglyNumber(n)+".");
        
    }
}
