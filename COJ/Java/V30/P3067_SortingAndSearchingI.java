/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V30;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class P3067_SortingAndSearchingI {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static int nums[] = new int [1010];
    static HashSet<Integer>set=new HashSet<>();
    public static void main(String[]args){
        int n,q1,q2,q;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0)break;
            set.clear();
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
                set.add(nums[i]);
            }
            q1=sc.nextInt();
            q2=sc.nextInt();
            for(int i=0;i<q1;i++){
                q=sc.nextInt();
                out.printf("%s\n",set.contains(q)?":)":":(");
            }
            Arrays.sort(nums,0,n);
            for(int i=0;i<q2;i++){
                q=sc.nextInt();
                out.printf("%d\n",nums[q-1]);
            }
        }
        out.flush();
    }
}
