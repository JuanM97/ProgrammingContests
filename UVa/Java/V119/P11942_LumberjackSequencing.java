/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V119;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P11942_LumberjackSequencing {
    static int[]lj;
    static int[]clj;
    
    public static boolean compare(){
        for(int i=0;i<10;i++){
            if(clj[i]!=lj[i]){
                return false;
            }
        }
        return true;
    }
    
    public static boolean compare2(){
        for(int i=0;i<10;i++){
            if(clj[9-i]!=lj[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        out.println("Lumberjacks:");
        while(t-->0){
            lj=new int[10];
            clj=new int[10];
            for(int i=0;i<10;i++){
                clj[i]=sc.nextInt();
                lj[i]=clj[i];
            }
            java.util.Arrays.sort(lj);
            if(compare()||compare2()){
                out.println("Ordered");
            }else{
                out.println("Unordered");
            }
        }
        out.flush();
    }
}
