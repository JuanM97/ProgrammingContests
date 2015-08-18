package V18;

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
public class P1825_CreatingPasswordsI {
    
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        Scanner scL;
        boolean isF;
        int n=sc.nextInt();
        sc.nextLine();
        String line,ans,ID, IDr, IDl;
        while(n-->0){
            ans="";
            isF=true;
            line=sc.nextLine();
            scL=new Scanner(line);
            ID=scL.next();
            IDr=ID.substring(0, 3);
            IDl=ID.substring(3, 6);
            ans+=IDr;
            while(scL.hasNext()){
                if(isF){
                    ans+=scL.next();
                    isF=false;
                }else{
                    ans+="*"+scL.next();
                }
            }
            ans+=IDl;
            out.println(ans);
        }
        out.flush();
    }
}
