/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V23;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P2311_Semafori {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int N, D, d, r, g, dTot, dPrev;
        while(sc.hasNext()){
            N = sc.nextInt();
            if(N<0)break;
            D = sc.nextInt();
            dTot = 0;
            dPrev = 0;
            for(int i=0;i<N;i++){
                d = sc.nextInt();
                r = sc.nextInt();
                g = sc.nextInt();
                dTot += (d - dPrev);
                if(dTot%(r+g)<r) dTot += r-(dTot%(r+g));
                dPrev = d;
            }
            dTot += (D-dPrev);
            out.println(dTot);
        }
        out.close();
    }
    
}


