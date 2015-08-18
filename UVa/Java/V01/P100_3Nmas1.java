package V01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

/*3n+1 problem! If n is even, divide by 2, else, multiply by 3 and add 1. Repeat till get to 1. Count the max
 * number of iterations till a number get to 1 and given a range of 2 numbers, provide the biggest of that counts
 */

import java.io.*;

public class P100_3Nmas1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
            
    public static void main(String[]args)throws IOException{
        Contador cn = new Contador();
        String line;
        while((line=in.readLine())!=null){
            if(line.length()==0 || line==null){
                break;
            }else{
                String espacios = "\\s+";
                String line2 = line.trim().replaceAll(espacios, " ");
                String[] line3 = line2.split(espacios);
                if(line3.length==2){
                    long a= Long.parseLong(line3[0]);
                    long b= Long.parseLong(line3[1]);
                    out.println(line2 + " " +cn.countBetween(a, b));
                }
            }
        }
        out.flush();
    }
    
    public static class Contador{
        public static long[]matriz=new long[65536];
        
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
            for(long i=min; i<=max;i++){
                long cont=countOne(i);
                if(i<matriz.length){
                    matriz[(int)i]=cont;
                }
                if(result<cont){
                    result=cont;
                }
            }
            return result;
        }
        
    }
    
}
