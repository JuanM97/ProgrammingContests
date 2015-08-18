/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V109;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10970_BigChocolate {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    // Examen OMM 3era etapa 2010. Problema 2, creo (único en que no saqué
    // 7 puntos en ese examen)(':
    public static void main(String[]args){
        int n,m;
        while(sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            //if(n==0&&m==0)break;
            out.println(n*m-1);
        }
        out.flush();
    }
        
}
