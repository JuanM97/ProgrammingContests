/* 
 * File:   P1308_Sequence.cpp
 * Author: JuanManuel
 *
 * Created on 23 de abril de 2015, 18:52
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 19
using namespace std;

long x[smx],y[smx];

long gcd(long a,long b) {
    long tmp;
    while(b){a%=b; tmp=a; a=b; b=tmp;}
    return a;
}

int main() {
    x[0]=0;y[0]=0;
    x[1]=0;y[1]=0;
    for(int i=2;i<smx;i++){
        x[i]=(i-2)*x[i-1]-y[i-1]+4;
        y[i]=(i-1)*y[i-1]-x[i-1]+3;
    }
    /*
    for(int i=1;i<smx;i++){
        printf("%ld %ld\n",x[i],y[i]);
    }
    */
    long n=0,n1=0,d1=0,n2=0,d2=0,g=0;
    while(scanf("%d",&n)!=EOF){
        if(n==0)break;
        printf("(x%d,y%d) = (",n,n);
        if(x[n]<0)printf("-");
        n1=(long)abs(x[n]);
        g=gcd(n1,n);
        if(g==n){
            printf("%ld,",n1/n);
        }else{
            printf("%ld/%ld,",n1/g,n/g);
        }
        if(y[n]<0)printf("-");
        n1=(long)abs(y[n]);
        g=gcd(y[n],n);
        if(g==n){
            printf("%ld)\n",n1/n);
        }else{
            printf("%ld/%ld)\n",n1/g,n/g);
        }
        //printf("(x%d,y%d) = (0,0)",n,n);
    }
    
    return 0;
}

/*
1
2
0

(x1,y1) = (0,0)
(x2,y2) = (2,3/2)
*/