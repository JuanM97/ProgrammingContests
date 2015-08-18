/* 
 * File:   P1120_NumberSequenceI.cpp
 * Author: JuanM
 *
 * Created on April 26, 2015, 12:17 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 32000
using namespace std;
long long int digs[smx];
long long int digsS[smx];

long long int getIdx(long long int n){
    int idx=0;
    while(n>digsS[idx]){
        idx++;
    }
    return idx;
}

int getNum(int k,int n){
    int l=digs[k],m=0,dig=0,ct=0;
    for(int i=k,ct=l+1;ct>n;i--){
        m=i;
        while(ct>n&&m){
            ct--;
            dig=m%10;
            m/=10;
        }
    }
    return dig;
}

int main() {
    int t,ct,m;
    long long int n,k,sk;
    digs[0]=0;
    for(int i=1;i<smx;i++){
        ct=0;m=i;
        while(m){
            ct++;
            m/=10;
        }
        digs[i]=digs[i-1]+ct;
    }
//    for(int i=1;i<30;i++){
//        printf("%d ",digs[i]);
//    }printf("\n");
    digsS[0]=0;
    for(int i=1;i<smx;i++){
        digsS[i]=digs[i]+digsS[i-1];
    }
//    for(int i=smx-30;i<smx;i++){
//        printf("%d ",digsS[i]);
//    }
    scanf("%d",&t);
    while(t--){
        scanf("%lld",&n);
        k=getIdx(n)-1;
        sk=n-digsS[k];
        printf("%d\n",getNum(k+1,sk));
    }
    return 0;
}

