/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V05;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
public class P541_ErrorCorrection {
    static int[][]a;
    static int[]sfs;
    static int[]scs;
    
    public static int check(){
        if(sfs[sfs.length-1]==0&&scs[scs.length-1]==0){
            return 1;
        }else{
            if((sfs[sfs.length-1]==1&&scs[scs.length-1]==1)){
                return 3;
            }else{
                return 2;
            }
        }
    }
    
    public static String getI(){
        String s;
        int x=0,y=0;
        for(int i=0;i<sfs.length-1;i++){
            if(sfs[i]==1){
                x=i;
            }
            if(scs[i]==1){
                y=i;
            }
            if(x==1&&y==1){
                break;
            }
        }
        s="Change bit (" +(x+1)+","+(y+1)+")";
        return s;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t,s,stf,stc;
        while(true){
            t=sc.nextInt();
            if(t==0)break;
            a=new int[t][t];
            sfs=new int[t+1];
            scs=new int[t+1];
            for(int i=0;i<t;i++){
                s=0;
                for(int j=0;j<t;j++){
                    a[i][j]=sc.nextInt();
                    s+=a[i][j];
                }
                sfs[i]=s%2;
            }
            for(int i=0;i<t;i++){
                s=0;
                for(int j=0;j<t;j++){
                    s+=a[j][i];
                }
                scs[i]=s%2;
            }
            stf=stc=0;
            for(int i=0;i<t;i++){
                stf+=sfs[i];
                stc+=scs[i];
            }
            sfs[t]=stf;
            scs[t]=stc;
            //System.out.println(java.util.Arrays.toString(sfs));
            //System.out.println(java.util.Arrays.toString(scs)+"\n");
            switch(check()){
                case 1:
                    out.println("OK");
                    break;
                case 2:
                    out.println("Corrupt");
                    break;
                case 3:
                    out.println(getI());
                    break;
            }
        }
        out.flush();
    }
}
