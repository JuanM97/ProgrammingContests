/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V101;

/**
 *
 * @author JuanM
 */
// :(
import java.io.PrintWriter;
import java.util.Scanner;
public class P10101_BanglaNumbers {
    static String[]sfx={"kuti","lakh","hajar","shata"};
    static int[]p;
    
    public static void main(String[]arg){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        String s,st;
        int tt=1;
        while(sc.hasNext()){
            s=sc.next();
            if(s.equals("L"))break;
            p=new int[10];
            int k=0;
            for(int i=s.length();i>0;i--){
                if(i>=2){
                    p[k++]=Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1)+"");
                    i-=2;
                }
                if(i>=1){
                    p[k++]=Integer.parseInt(s.charAt(i-1)+"");
                    i--;
                }
                if(i>=2){
                    p[k++]=Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1)+"");
                    i-=2;
                }
                if(i>=2){
                    p[k++]=Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1)+"");
                    i-=2;
                }
                i++;
            }
            st="";
            boolean f=true;
            //System.out.println(java.util.Arrays.toString(sfx));
            //System.out.println(java.util.Arrays.toString(p));
            for(int i=0;i<k;i++){
                if(f){
                    if(p[i]!=0)
                        st=p[i]+" "+st;
                    f=false;
                }else{
                    if(p[i]!=0){
                        st=p[i]+" "+sfx[3-(i-1)%4]+" "+st;
                    }
                }
            }
            if(st.charAt(st.length()-1)==' ')st=st.substring(0,st.length()-1);
            out.printf("%4d. %s\n",tt++,st.toString());
        }
        out.flush();
    }
}
