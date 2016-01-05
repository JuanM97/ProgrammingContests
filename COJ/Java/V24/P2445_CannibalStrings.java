/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V24;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
// WA!!!
public class P2445_CannibalStrings {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 150;
    static int[] cct = new int[smx];
    static boolean[] cb = new boolean[smx];
    
    public static void main(String[] args) {
        char[] c;
        int ct, ctMax = -1;
        while(sc.hasNext()){
            for(int i=0;i<smx;i++){
                cct[i] = 0;
                cb[i] = false;
            }
            c = sc.next().toCharArray();
            if(c[0]=='0')break;
            //out.println(Arrays.toString(c));
            ctMax = 0;
            for(int i=0;i<c.length;i++){
                ct = 0;
                for(int j=i+1; j<c.length;j++){
                    if(c[i]<=c[j])ct++;
                    else break;
                }
                cct[c[i]]+=ct;
                cb[c[i]] = true;
                ctMax = Math.max(ctMax,cct[(int)c[i]]);
            }
            //for(int i=0;i<smx;i++)out.print(cct[i]+" ");
            //out.println();
            //out.println(ctMax);
            for(int i=0;i<smx;i++){
                if( ((i>='a'&&i<='z') || (i>='A'&&i<='Z')) && cb[i]){
                    if(cct[i]==ctMax){
                        out.println((char)i);
                        break;
                    }
                }
            }
        }
        out.close();
    }
    
}

