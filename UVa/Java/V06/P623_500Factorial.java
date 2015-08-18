package V06;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

//500!
public class P623_500Factorial {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static BigInteger factorial(long n){
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        BigInteger m = new BigInteger((n-1)+"");
        BigInteger result = new BigInteger(n+"");
        if(result.equals(one) || result.equals(zero)){
            return one;
        }else{
            return result.multiply(factorial(n-1));
        }
    }
    
    public static void main(String[]args)throws IOException{
        
        String line;
        
        while((line=in.readLine())!=null){
            if(line.length()==0 || line==null){
                break;
            }else{
                String espacios = "\\s+";
                String line2 = line.trim().replaceAll(espacios, " ");
                String[] line3 = line2.split(espacios);
                long num = Long.parseLong(line3[0]);
                out.println(num+"!");
                out.println(factorial(num));
            }
        }
        out.flush();
        
    }
    
}
