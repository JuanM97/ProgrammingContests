package V15;

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
public class P1573_JustAnotherEasyProblem {
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt();
        String a;
        char l;
        while(n-->0){
            a=sc.next();
            l=a.charAt(a.length()-1);
            if(l=='1'||l=='3'||l=='5'||l=='7'||l=='9'||l=='B'||l=='D'||l=='F'){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        out.flush();
    }
}
