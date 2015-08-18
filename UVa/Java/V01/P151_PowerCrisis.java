/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V01;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

//Power Crisis
public class P151_PowerCrisis {
    static PrintWriter out = new PrintWriter(System.out);
    
    public static int josephuss(int n, int m){
        if(n==1)
            return 0;
        if(m==1)
            return n-1;
        if(m>n)
            return (josephuss(n-1, m)+m)%n;
        int count=n/m;
        int ans=josephuss(n-count, m);
        ans-=n%m;
        if(ans<0)
            ans+=n;
        else
            ans+=ans/(m-1);
        return ans;
    }
    
    public static int josephus2(int n, int m){
        return josephuss(n,m)+1;
    }
    
    public static int number(int n){
        int ans=0;
        for(int i=1;;i++){
            if(josephus2(n-1,i)+1==13){
                ans=i;
                break;
            }
        }
        return ans;
    }
    
    
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            out.println(number(n));
            n=sc.nextInt();
        }
        out.flush();
        
    }
    
}
