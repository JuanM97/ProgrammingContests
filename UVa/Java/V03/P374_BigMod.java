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

//Big Mod
public class P374_BigMod {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static long repeatedSquaring(long num, long pow, long mod){
        if(pow==0){
            return 1;
        }else{
            if(pow==1){
                return num%mod;
            }else{
                if(pow%2==1){
                    return (num%mod*repeatedSquaring(num%mod*num%mod, (pow-1)/2, mod)%mod)%mod;
                }else{
                    return (repeatedSquaring(num%mod*num%mod, pow/2, mod))%mod;
                }
            }
        }
    }
        
    public static void main(String[]Args)throws IOException{
        
        String line;
        long b=0;
        int cont=0;
        long p=0;
        long m=0;
        while((line=in.readLine())!=null){
            if(line.length()==0 || line==null){
                break;
            }else{
                String espacios = "\\s+";
                String line2 = line.trim().replaceAll(espacios, "");
                b=Long.parseLong(line2);
                p=Long.parseLong(in.readLine().trim().replaceAll(espacios, ""));
                m=Long.parseLong(in.readLine().trim().replaceAll(espacios, ""));
                out.println(repeatedSquaring(b, p, m));
                in.readLine();
            }
        }
        out.flush();
        
    }
    
}
