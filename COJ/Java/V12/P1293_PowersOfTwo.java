package V12;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.math.BigInteger;
public class P1293_PowersOfTwo {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger ans= BigInteger.valueOf(2);
        System.out.println(ans.pow(n));
    }
}
