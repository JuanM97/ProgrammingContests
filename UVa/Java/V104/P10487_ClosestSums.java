package V104;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.util.Scanner;

//Closest Sums
public class P10487_ClosestSums {
    
    public static int closestSum(int[]arr, int v){
        int val=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(Math.abs(v-arr[i]-arr[j])<val){
                    val=Math.abs(v-arr[i]-arr[j]);
                    ans=arr[i]+arr[j];
                }
            }
        }
        return ans;
    }
    /*    
    public static boolean exactSum(int[]arr, int v){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int[]ar=new int[Math.max(v,max)+1];
        for(int i=0; i<ar.length;i++)
            ar[i]=0;
        for(int i=0; i<arr.length;i++){
            ar[arr[i]]=ar[arr[i]]++;
        }
        for(int i=0; i<arr.length;i++){
            if(v-arr[i]>=0 && ar[v-arr[i]]==1 && v-arr[i]!=arr[i])
                return true;
        }
        return false;
    }
    */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cases=1;
        while(true){
            int n=sc.nextInt();
            if(n==0)
                break;
            int[]arr=new int[n];
            for(int i=0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            int numCases=sc.nextInt();
            System.out.println("Case "+cases++ +":");
            for(int i=0; i<numCases;i++){
                int cAct=sc.nextInt();
                System.out.println("Closest sum to "+cAct+" is "+closestSum(arr,cAct)+".");
                
            }
        }
        
    }
    
}