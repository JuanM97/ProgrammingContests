/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V123;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.InputStreamReader;
public class P12364_InBraille {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    
    public static void pa(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int g=0;g<a.length;g++){
                System.out.print(a[i][g]+" ");
            }
            System.out.println();
        }
    }
    
    static String[] b={".*","*.","*.","**","**","*.","**","**","*.",".*"};
    static String[] b2={"**","..","*.","..",".*",".*","*.","**","**","*."};
    
    public static void main(String[]args){
        int[] ll=new int[110];
        int[][] reps=new int[11][11];
        int t,i,num;
        char l;
        boolean isF;
        String d;
        while(true){
            t=sc.nextInt();
            if(t==0)break;
            i=0;
            l=sc.next().charAt(0);
            isF=true;
            if(l=='S'){
                d=sc.next();
                for(int ld=0;ld<d.length();ld++){
                    num=(int)(d.charAt(ld)-'0');
                    ll[i++]=num;
                    if(isF){
                        out.print(b[num]);
                        isF=false;
                    }else{
                        out.print(" "+b[num]);
                    }
                }
                out.println();
                //System.out.println(java.util.Arrays.toString(ll)+" i: "+i);
                isF=true;
                for(int j=0;j<i;j++){
                    if(isF){
                        out.print(b2[ll[j]]);
                        isF=false;
                    }else{
                        out.print(" "+b2[ll[j]]);
                    }
                }
                out.println();
                isF=true;
                for(int j=0;j<i;j++){
                    if(isF){
                        out.print(b2[1]);
                        isF=false;
                    }else{
                        out.print(" "+b2[1]);
                    }
                }
                out.println();
            }else{
                for(int y=0;y<reps.length;y++){
                    for(int f=0;f<reps.length;f++){
                        reps[y][f]=0;
                    }
                }
                int id=0;
                for(int j=0;j<t;j++){
                    d=sc.next();
                    for(int f=0;f<10;f++){
                        if(d.equals(b[f])){
                            reps[id][f]=1;
                        }
                    }
                    id++;
                }
                //pa(reps);
                id=0;
                for(int j=0;j<t;j++){
                    d=sc.next();
                    for(int f=0;f<10;f++){
                        if(d.equals(b2[f])){
                            if(reps[id][f]==1){
                                out.print(f);
                                reps[id][f]=0;
                                break;
                            }
                        }
                    }id++;
                }
                for(int j=0;j<t;j++){
                    sc.next();
                }
                out.println();
            }
            
        }
        out.flush();
        
    }
}
