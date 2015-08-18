/* 
 * File:   P2260_DyckWords.cpp
 * Author: JuanM
 *
 * Created on January 21, 2015, 2:33 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 1010
#define mod 1000000007
using namespace std;

int t,idx;
long long int dw[smx];

long long int egcd(long long int a,long long int b,long long int *x,long long int *y){
    long long int u=1LL,v=0LL,q=0LL,r=0LL,m=0LL,n=0LL;
    *x=0LL,*y=1LL;
    while(a!=0){
        q=(int)floor(b/a);
        r=b%a;
        m=*x-u*q;
        n=*y-v*q;
        b=a; a=r; *x=u; *y=v; 
        u=m; v=n;
    }
    return b;
}

long long int invMod(long long int a,long long int m){
    long long int g,x,y;
    g=egcd(a,m,&x,&y);
    if(g!=1)
        return 0LL;
    else
        return (x%m)>0?(x%m):(x%m+m);
}

//Catalan numbers. C_0=1, C_(n+1)=2*(2n+1)*C_n/(n+2)
void calcCatalanNumbers(){
    dw[0]=1LL;
    long long int tt=0;
    for(long long int i=0;i<smx-1;i++){
        tt=((((2*((2*i+1)*(dw[i]%mod))%mod)%mod)*(invMod(i+2,mod)%mod))%mod);
        dw[i+1]=(tt<0)?(tt+mod):(tt);
    }
}

int main() {
    calcCatalanNumbers();
    scanf("%d",&t);
    /*for(int i=0;i<100;i++){
        printf("%lld ",dw[i]);
    }*/
    
    while(t--){
        scanf("%d",&idx);
        printf("%lld\n",dw[idx]);
    }
    
    return 0;
}

