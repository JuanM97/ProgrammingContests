package source;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Prob22{
    
    static Scanner sc;
    static File f=new File("names.txt");
    static String[] a;
    
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
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        long ans=0;
        for(int i=0;i<a.length;i++){
            ans+=(getValue(a[i].substring(1,a[i].length()-1))*(i+1));
        }
        System.out.println(ans);
    }
    
}
