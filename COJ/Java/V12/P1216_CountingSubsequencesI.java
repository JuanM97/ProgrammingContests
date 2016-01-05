/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V12;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
public class P1216_CountingSubsequencesI {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int smx = 1000100;
    static long nums[] = new long[smx];
    static HashMap<Long, Integer> sum = new HashMap();
    public static void main(String[] args) {
        int T, N, cnt = 0;
        T = sc.nextInt();
        while(T-->0){
            N = sc.nextInt();
            nums[0] = 0;
            sum.clear();
            for(int i=1;i<=N;i++){
                nums[i] = nums[i-1]+sc.nextInt();
            }
            sum.put(0L,1);
            cnt = 0;
            for(int i=1;i<=N;i++){
                //out.println(sum);
                if(sum.containsKey(nums[i]-47))cnt+=sum.get(nums[i]-47);
                if(sum.containsKey(nums[i])){
                    sum.put(nums[i],sum.get(nums[i])+1);
                }else{
                    sum.put(nums[i],1);
                }
            }
            out.println(cnt);
        }
        out.close();
    }
    
}


