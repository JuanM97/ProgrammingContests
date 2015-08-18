/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V122;

import java.util.Scanner;
public class P12243_FlowersFlourishFromFrance {
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Scanner scL;
        String s,a;
        char c;
        boolean t;
        while(true){
            s=sc.nextLine();
            if(s.equals("*")){
                break;
            }
            scL=new Scanner(s);
            a="";
            c='\0';
            t=true;
            if(scL.hasNext()){
                a=scL.next().toLowerCase();
                c=a.charAt(0);
            }
            while(scL.hasNext()&&t){
                a=scL.next().toLowerCase();
                if(a.charAt(0)!=c){
                    t=false;
                }
            }
            if(t){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
        
    }
}
