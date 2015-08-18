/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V29;

/**
 *
 * @author JuanM
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
public class P2955_TheMightyPowerSquares {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static final int smx=23;
    
    static int marker[]=new int[smx];
    static int powersOfTwo[]=new int[smx];
    static int howMany[]=new int[smx];

    static void fillHowMany(){
        howMany[0]=1;
        for(int i=1;i<smx-1;i++){
            howMany[i]=marker[i+1]-marker[i];
        }
    }

    static void fillPowersOfTwo(){
        int n=1;
        powersOfTwo[0]=0;
        for(int i=1;i<smx;i++){
            powersOfTwo[i]=n;
            n<<=1;
        }
    }

    static void fillMarkers(){
        int n=1;
        marker[0]=0;
        for(int i=1;i<smx;i++){
            marker[i]=n;
            n<<=2;
        }
    }

    static void printt(){
        out.printf("powers of two:\n");
        for(int i=0;i<smx;i++){
            out.printf("%d ",powersOfTwo[i]);
        }out.printf("\nmarkers:\n");
        for(int i=0;i<smx;i++){
            out.printf("%d ",marker[i]);
        }out.printf("\nhow many:\n");
        for(int i=0;i<smx;i++){
            out.printf("%d ",howMany[i]);
        }out.printf("\n");
    }

    static int getMaxPowerOfTwoIdx(int n){
        int idx=-1;
        do{
            idx++;
        }while(n>=marker[idx]);
        return idx-1;
    }
    
    public static void main(String[]args){
        int t,a,b,idxA,idxB,dif;
        BigInteger sum;
        fillPowersOfTwo();
        fillMarkers();
        fillHowMany();
        //printt();
        t=sc.nextInt();
        while(t-->0){
            a=sc.nextInt();
            b=sc.nextInt();
            dif=b-a+1;
            sum=BigInteger.ZERO;
            idxA=getMaxPowerOfTwoIdx(a);
            idxB=getMaxPowerOfTwoIdx(b);
            //printf("idx: %d %d\n",idxA,idxB);
            if(dif>=marker[idxA+1]-a){
                sum=sum.add(BigInteger.valueOf(marker[idxA+1]-a).multiply(BigInteger.valueOf(powersOfTwo[idxA])));
                dif-=marker[idxA+1]-a;
            }else{
                sum=sum.add(BigInteger.valueOf(dif).multiply(BigInteger.valueOf(powersOfTwo[idxA])));
                dif=0;
            }
            if(dif>0)
            for(int i=idxA+1;dif>0;i++){
                if(dif>=howMany[i]){
                    sum=sum.add(BigInteger.valueOf(howMany[i]).multiply(BigInteger.valueOf(powersOfTwo[idxA])));
                    dif-=howMany[i];
                    //printf("%lld %lld\n",sum,dif);
                }else{
                    sum=sum.add(BigInteger.valueOf(dif).multiply(BigInteger.valueOf(powersOfTwo[idxA])));
                    dif-=howMany[i];
                    //printf("%lld %lld\n",sum,dif);
                }
            }
            out.printf("%s\n",sum.toString());
        }
        out.flush();
        
    }
    
}
