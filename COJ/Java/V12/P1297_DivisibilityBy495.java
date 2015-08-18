package V12;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class P1297_DivisibilityBy495 {
    
    public static boolean is11(String a){
        boolean s=false;
        int p,i,rs;
        p=i=0;
        for(int j=0;j+1<a.length();j+=2){
            p+=a.charAt(j)-'0';
            i+=a.charAt(j+1)-'0';
            if(j+2==a.length()-1){
                p+=a.charAt(j+2)-'0';
            }
        }
        rs=Math.abs(p-i);
        if(rs%11==0){
            s=true;
        }
        return s;
    }
    
    public static boolean is9(String a){
        boolean s=false;
        int b=0;
        for(int i=0;i<a.length();i++){
            b+=(a.charAt(i)-'0');
        }
        String v=b+"";
        b=0;
        for(int i=0;i<a.length();i++){
            b+=(a.charAt(i)-'0');
        }
        if(b%9==0){
            s=true;
        }
        return s;
    }
    
    public static boolean is5(String a){
        boolean s=false;
        if(a.charAt(a.length()-1)=='0'||a.charAt(a.length()-1)=='5'){
            s=true;
        }
        return s;
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        int n=sc.nextInt(),m;
        String s;
        boolean s9,s11,s5;
        while(n-->0){
            s=sc.next();
            if(s.length()<5){
                m=Integer.parseInt(s);
                if(m>0 && m<495){
                    out.println("NO");
                }else{
                    if(m==0||m==495||(is11(s)&&is9(s)&&is5(s))){
                        out.println("YES");
                    }else{
                        out.println("NO");
                    }
                }
            }else{
                //System.out.println(is11(s)+" "+is5(s)+" "+is9(s));
                if((is11(s)&&is9(s)&&is5(s))){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }
        }
        out.flush();
    }
}
