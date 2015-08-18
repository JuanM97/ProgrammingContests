/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V03;

/**
 *
 * @author JuanM
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P374A_BigMod {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static long modularExponentiation(long base, long exp, long mod){
        String ps=Long.toBinaryString(exp);
        long c=0;
        long d=1;
        for(int i=0; i<ps.length();i++){
            c=2*c;
            d=(d*d)%mod;
            if(ps.charAt(i)=='1'){
                c++;
                d=(d*base)%mod;
            }
        }
        return d;
    }
    
    
    public static void main(String[]args)throws IOException{
        
        Scanner sc = new Scanner(System.in);
        long base, exp, mod;
        String line;
        while((line=in.readLine())!=null){
            if(line.length()==0 || line==null){
                break;
            }else{
                String espacios = "\\s+";
                String line2 = line.trim().replaceAll(espacios, "");
                base=Long.parseLong(line2);
                exp=Long.parseLong(in.readLine().trim().replaceAll(espacios, ""));
                mod=Long.parseLong(in.readLine().trim().replaceAll(espacios, ""));
                System.out.println(modularExponentiation(base, exp, mod));
                in.readLine();
            }
        }
        
    }
}
