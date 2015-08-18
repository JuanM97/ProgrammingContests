package V01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

//Let k^a=p. Given k and p, find a :)

import java.io.*;

//The power of Cryptography
public class P113_PowerOfCrypto {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static double base(double exp, double power){
        return Math.exp(Math.log(power)/exp);
    }
    
    public static void main(String[]args)throws IOException{
        String line;
        int cont=0;
        double power=1, exp=1;
        
        while((line=in.readLine())!=null){
            if(line==null || line.length()==0){
                break;
            }else{
                cont++;
                if(cont%2==1){
                    exp=new Double(line);
                }else{
                    power=new Double(line);
                    out.println((int)Math.rint(base(exp, power)));
                    cont=0;
                }
            }
        }
        out.flush();
    }
}
