/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V100;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P10055_HashmatTheBraveWarrior {
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        long a,b,ans;
        Scanner in=new Scanner(System.in);
        while(in.hasNextLong()){
            a=in.nextLong();
            b=in.nextLong();
            //if(a==0&&b==0)break;
            if(a>b){
                out.println(a-b);
            }else{
                out.println(b-a);
            }
        }
        out.flush();
    }
}
