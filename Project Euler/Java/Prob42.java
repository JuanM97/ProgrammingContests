/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Prob42{
    
    static Scanner sc;
    static File f=new File("P42.txt");
    static String[] a;
    static boolean trNum[]=new boolean[3000];
    static int trN[]=new int[70];
    
    static void preCalc(){
        trN[0]=0;
        for(int i=1;i<trN.length;i++){
            trN[i]=trN[i-1]+i;
        }
        for(int i=1;i<trN.length;i++){
            trNum[trN[i]]=true;
        }
    }
    
    static int getValue(String a){
        int c=0;
        for(int i=0;i<a.length();i++){
            c+=(a.charAt(i)-'A'+1);
        }
        return c;
    }
    
    public static void main(String[]args)throws FileNotFoundException{
        sc=new Scanner(f);
        a=sc.next().split(",");
        preCalc();
        //Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        //System.out.println(getValue("SKYE")+" "+trNum[getValue("SKYE")]);
        int cont=0;
        for(int i=0;i<a.length;i++){
            if(trNum[getValue(a[i].substring(1,a[i].length()-1))]) cont++;
        }
        System.out.println(cont);
    }
    
}
