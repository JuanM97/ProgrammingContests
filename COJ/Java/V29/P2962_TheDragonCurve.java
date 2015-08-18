/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V29;

/**
 *
 * @author JuanM
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class P2962_TheDragonCurve {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int n;
            while((n = Integer.parseInt(sc.nextLine()))!=-1){
                    //log.write(dragon(n)+"\n");
                    System.out.println(dragon(n));
            }

            out.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String dragon(int n){
        if(n>2){
                String aux = dragon(n-1);
                return aux+"L"+reverse(aux);
        }else if(n==2)
                return "LLR";	
        else if(n==1)
                return "L";
        else if(n==0)
                return "";
        return "";
    }

    public static String reverse(String aux){
        String ans = ""; 
        for(int i = aux.length();i>0;i--){
                if(aux.charAt(i-1)=='L')
                    ans+='R';
                else
                    ans+='L';
        }
        return ans;
    }
 
}
