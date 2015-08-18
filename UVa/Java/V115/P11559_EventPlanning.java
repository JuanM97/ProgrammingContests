/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V115;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class P11559_EventPlanning {
    static PrintWriter out=new PrintWriter(System.out);
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[]args)throws IOException{
        String line=in.readLine(), lineT;
        String esp="\\s+";
        String[]inputs=new String[4];
        String[] weeksH;
        int n, b, h, ht, w, wt, pH, pMin, nW;
        boolean av=false;
        while(line!=null && line.length()>0){
            lineT=line.trim().replaceAll(esp, " ");
            inputs=lineT.split(esp);
            n=Integer.parseInt(inputs[0]);
            b=Integer.parseInt(inputs[1]);
            h=Integer.parseInt(inputs[2]);
            w=Integer.parseInt(inputs[3]);
            ht=h;
            weeksH=new String[w];
            pMin=Integer.MAX_VALUE;
            av=false;
            while(ht-->0){
                line=in.readLine();
                lineT=line.trim();
                pH=Integer.parseInt(lineT);
                
                line=in.readLine();
                lineT=line.trim().replaceAll(esp, " ");
                weeksH=lineT.split(esp);
                for(int i=0; i<weeksH.length;i++){
                    if(Integer.parseInt(weeksH[i])>=n){
                        av=true;
                        break;
                    }
                }
                if(av){
                    if(n*pH<pMin && n*pH<=b){
                        pMin=n*pH;
                    }
                }
            }
            if(av && pMin<Integer.MAX_VALUE){
                out.println(pMin);
            }else{
                out.println("stay home");
            }
            line=in.readLine();
        }
        
        out.flush();
    }
}
