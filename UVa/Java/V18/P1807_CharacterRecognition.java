/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V18;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class P1807_CharacterRecognition {
    // TLE - didnt finished processing ...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n, len, obs;
        n = sc.nextInt();
        sc.nextLine();
        String line  = "";
        len = 0; obs = 0;
        double nn = 0;
        while(n>0){
            if(sc.hasNext()){
                line = sc.nextLine();
            }else{
                nn = 100-(double)obs*100/len;
                NumberFormat nf = new DecimalFormat("0.#");
                System.out.printf("Efficiency ratio is %s%%.%n",nf.format(nn));
                n--;
            }
            if(line.length()==0){
                nn = 100-(double)obs*100/len;
                NumberFormat nf = new DecimalFormat("0.#");
                System.out.printf("Efficiency ratio is %s%%.%n",nf.format(nn));
                len = 0;
                obs = 0;
                n--;
                continue;
            }
            len+=line.length();
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)=='#')obs++;
            }
        }
        out.close();
        
    }
    
}


