/* 
 * File:   P11718_FantasyOfASummation.cpp
 * Author: JuanM
 *
 * Created on June 4, 2014, 7:30 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

//Formula k*n^(k-1)*S_n
int t,n,k,m;
int a[1003];
long long int nk,sn;

long long int modExp(int a, int b, int c){
    int x=a;int y=b;long long int z=1;
    while(y){
        if(y&1) z=(z*x)%c;
        x=(x*x)%c;
        y=y>>1;
    }
    return z;
}


int main() {
    scanf("%d",&t);
    for(int cs=1;cs<=t;cs++){
        scanf("%d %d %d",&n,&k,&m);
        sn=0;
        for(int i=0;i<n;i++){
            scanf("%d",&a[i]);
            sn+=a[i];
        }
        nk=0;
        printf("Case %d: %lld\n",cs,((((k)*(modExp(n,k-1,m)%m))%m)*(sn%m))%m);
    }
    return 0;
}

