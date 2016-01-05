/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V33;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P3334_DrBTreeI{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter (System.out);
    
    public static void main(String[] args) {
        
        int N;
        String s;
        int k;
        String sp;
        N= sc.nextInt();
        s =sc.next();
        k = sc.nextInt();
        sp= sc.next();
        boolean atList=false;
        int contpat=0;
        int cont=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==sp.charAt(contpat)){
                contpat++;
                contpat=contpat%k;
                if(contpat==0){
                    atList=true;                     
                }
            }else{
                cont++;
            }

        }
        cont+=contpat;
        out.println(atList?cont:-1);
               
        out.close();
        
    }
    
}


