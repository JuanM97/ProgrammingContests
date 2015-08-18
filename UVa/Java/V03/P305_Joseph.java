/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V03;

/**
 *
 * @author JuanM
 */
import java.util.Scanner;
import java.io.PrintWriter;
public class P305_Joseph {
    
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
    
    public static void js(int n, int m){
        
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n;
        while(true){
            n=sc.nextInt();
            if(n==0)break;
            out.println(josephuss(2*n,n));
        }
        out.flush();
    }
}
