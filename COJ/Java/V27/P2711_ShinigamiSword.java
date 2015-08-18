/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V27;

/**
 *
 * @author JuanManuel
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
public class P2711_ShinigamiSword {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static int smx = 3000;
    public static void main(String[]args){
        int n;
        int nums[][];
        while(sc.hasNext()){
            n=sc.nextInt();
            //if(n==0)break;
            nums = new int[n][2];
            for(int i=0;i<n;i++){
                nums[i][0]=sc.nextInt();
                nums[i][1]=i+1;
            }
            Arrays.sort(nums,new Comparator<int[]>(){
                @Override
                public int compare(int a[],int b[]){
                    return Integer.compare(b[0],a[0]);
                }
            });
            for(int i=0;i<n;i++){
                out.println(nums[i][1]);
            }
        }
        out.flush();
        
    }
}
