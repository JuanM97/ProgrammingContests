/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V26;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class P2624_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t, n, m, tot, ct;
        int cd[] = new int[103];
        t= sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            m = sc.nextInt();
            for(int i=0;i<m;i++){
                cd[i] = sc.nextInt();
            }
            Arrays.sort(cd,0,m);
            tot = 0; ct=0;
            for(int i=0;i<m;i++){
                if(tot+cd[i]<=n){
                    tot += cd[i];
                    ct++;
                }else break;
            }
            out.println(ct);
        }
        out.close();
    }
}

