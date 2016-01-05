/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V21;

/**
 *
 * @author JuanM
 */
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P2183_ParityWords {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String s;
        int even,odd,t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            s=sc.nextLine().trim();
            even=odd=0;
            for(int i=0;i<s.length();i++){
                if(((int)s.charAt(i))%2==1){
                    odd++;
                }else{
                    even++;
                }
            }
            if(even>odd){
                out.println("Even");
            }else{
                out.println("Odd");
            }
        }
        out.flush();
    }
}


