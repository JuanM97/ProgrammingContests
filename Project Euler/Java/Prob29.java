/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author JuanM
 */

import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;
import java.math.BigInteger;
public class Prob29 {
    
    public static BigInteger exp(int a,int b){
        BigInteger x=BigInteger.valueOf(a),y=BigInteger.valueOf(b);
        BigInteger z=new BigInteger("1");
        while(y.compareTo(BigInteger.ZERO)>0){
            if(y.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)){z=z.multiply(x);}
            x=x.multiply(x);
            y=y.divide(BigInteger.valueOf(2));
        }
        return z;
    }
    //Can't believe this problem can be done with Doubles (up to 1E308) O:!!!
    public static void main(String[]args){
        Set<BigInteger> s=new HashSet<BigInteger>();
        BigInteger n;
        s.clear();
        int max=100;
        for(int i=2;i<=max;i++){
            for(int j=2;j<=max;j++){
                n=exp(i,j);
                //System.out.println(n.toString());
                s.add(n);
            }
        }
        //System.out.println(s.toString());
        System.out.println(s.size());
    }
    
}
