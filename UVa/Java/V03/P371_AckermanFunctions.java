package V03;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.*;
public class P371_AckermanFunctions {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static long max(long a, long b){
        return a>=b?a:b;
    }
    
    public static long min(long a, long b){
        return a<b?a:b;
    }
            
    public static void main(String[]args)throws IOException{
        Contador cn = new Contador();
        String line;
        while(!(line=in.readLine().trim()).equals("0 0")){
            if(line.length()==0 || line==null){
                break;
            }else{
                String espacios = "\\s+";
                String line2 = line.trim().replaceAll(espacios, " ");
                String[] line3 = line2.split(espacios);
                if(line3.length==2){
                    long a= Long.parseLong(line3[0]);
                    long b= Long.parseLong(line3[1]);
                    if(a!=0 && b!=0){
                    long nM = cn.countBetween(a, b);
                        out.println("Between " +min(a,b) +" and " +max(a,b) +", " +cn.numMax +" generates the "
                                + " longest sequence of " +nM +" values.");
                    }else{
                        break;
                    }
                }
            }
        }
        out.flush();
    }
    
    public static class Contador{
        public static long[]matriz=new long[97000];
        static long numMax=-1;
        
        public static long countOne(long num){
            long count=1;
            while(num>1){
                if(num%2==0){
                    num/=2;
                }else{
                    num=(3*num+1);
                }
                if(num<matriz.length&&matriz[(int)num]!=0){
                    return count+matriz[(int)num];
                }
                count++;
            }
            return count;
        }
        
        public static long countBetween(long a, long b){
            long max,min;
            long result=-1;
            if(a>=b){
                max=a;
                min=b;
            }else{
                if(a<b){
                    max=b;
                    min=a;
                }else{
                    return 0;
                }
            }
            numMax=min;
            for(long i=min; i<=max;i++){
                long cont=countOne(i);
                if(i<matriz.length){
                    matriz[(int)i]=cont;
                }
                if(result<cont){
                    result=cont;
                    numMax=i;
                }
            }
            return result-1;
        }
        
    }
    
}

