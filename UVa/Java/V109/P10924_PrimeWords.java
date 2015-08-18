/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V109;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.io.BufferedOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
public class P10924_PrimeWords {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), true);
    static int smx = 4097;
    static ArrayList<Integer> primes = new ArrayList(); 
    static boolean pB[] = new boolean[smx];
    
    static void primes(){
        pB[0] = true;
        pB[1] = false;
        for(int i=4;i<smx;i+=2){
            pB[i] = true;
        }
        primes.add(2);
        for(int i=3;i<smx;i+=2){
            if(!pB[i]){
                primes.add(i);
                for(int j=2*i;j<smx;j+=i){
                    pB[j]=true;
                }
            }
        }
        
    }
    
    public static void main(String[]args){
        String line;
        int cnt = 0;
        primes();
        //for(int i=0;i<30;i++)out.print(primes.get(i)+" ");
        //out.println();
        while(sc.hasNext()){
            line = sc.nextLine();
            cnt = 0;
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)>='a' && line.charAt(i)<='z'){
                    cnt += (line.charAt(i)-'a'+1);
                }else{
                    cnt += (line.charAt(i)-'A'+27);
                }
            }
            out.printf("%s\n",pB[cnt]?"It is not a prime word.":"It is a prime word.");
        }
        out.flush();
    }
}


