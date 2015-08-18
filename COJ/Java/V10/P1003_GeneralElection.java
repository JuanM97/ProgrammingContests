package V10;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P1003_GeneralElection {
    static int[]cands;
    
    public static int max(){
        int m=0;
        for(int i=1;i<cands.length;i++){
            if(cands[i]>cands[m]){
                m=i;
            }
        }
        return m;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        int c,r;
        while(n-->0){
            c=sc.nextInt();
            r=sc.nextInt();
            cands=new int[c];
            while(r-->0){
                for(int i=0; i<c;i++){
                    cands[i]+=sc.nextInt();
                }
            }
            out.println(max()+1);
        }
        out.flush();
    }
}
