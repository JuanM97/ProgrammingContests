package V01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */


//Fermat vs. Pythagoras
public class P106_FermatVsPythagoras {
    
    static boolean isPrime(int num){
        boolean st = true;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                st = false; break;
            }
        }
        return st;
    }
    
    static String findPrimes(int N){
        String cadena="";
        int contador=0;
        for(int i=1; i<=N /*&& contador<9*/; i++){
            if(isPrime(i)){
                cadena+=i+" ";
                contador++;
            }
        }
        return cadena;
    }
    
    public static void main(String[]args){
        
        String line="A   AS  d  AD eE";
        String Reg = "\\s+";
        String n = line.trim().replaceAll(Reg, " ");
        String ns = line.trim().replaceAll(Reg, "");
        //System.out.println(findPrimes(10000));
        System.out.println(line);
        System.out.println(n);
        System.out.println(ns);
        
    }
    
}
