/* 
 * File:   P2958_AlmostCompleteBinaryTree.cpp
 * Author: JuanM
 *
 * Created on September 22, 2014, 10:31 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define MOD 1000000007
#define smx 20
using namespace std;

int powersOfTwo[smx];
int completeBTree[smx];

void fillPowersOfTwo(){
    int n=1;
    for(int i=0;i<smx;i++){
        powersOfTwo[i]=n;
        n<<=1;
    }
}

void fillCompleteBTree(){
    for(int i=0;i<smx;i++){
        completeBTree[i]=powersOfTwo[i+1]-1;
    }
}

void printt(){
    for(int i=0;i<smx;i++){
        printf("%d ",powersOfTwo[i]);
    }printf("\n");
    for(int i=0;i<smx;i++){
        printf("%d ",completeBTree[i]);
    }printf("\n");
}

int getMaxPowerOfTwoIdx(int n){
    int idx=-1;
    do{
        idx++;
    }while(n>completeBTree[idx]);
    return idx;
}

int egcd(int a,int b,int *x,int *y){
    int u=1,v=0,q=0,r=0,m=0,n=0;
    *x=0,*y=1;
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

int invMod(int a,int mod){
    int g,x,y;
    g=egcd(a,mod,&x,&y);
    if(g!=1)
        return 0;
    else
        return x%mod>0?x%mod:x%mod+mod;
}

long long int comb(int n,int r){
    long long int prod=1;
    for(int i=n-r+1;i<=n;i++){
        prod=(prod*i)%MOD;
        //printf("%d %d\n",i,prod);
    }//printf("Invs: \n");
    for(int i=2;i<=r;i++){
        prod=(prod*invMod(i,MOD))%MOD;
        //printf("%d %d\n",invMod(i,MOD),prod);
    }
    return prod;
}

int main() {
    int t,n,idx,maxPowerOf2,dif;
    fillPowersOfTwo();
    fillCompleteBTree();
    //printt();
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        idx=getMaxPowerOfTwoIdx(n);
        dif=n-completeBTree[idx-1];
        maxPowerOf2=powersOfTwo[idx];
        printf("%lld\n",comb(maxPowerOf2,dif)-1);
        //printf("%d\n",invMod(n,MOD));
    }
    return 0;
}

