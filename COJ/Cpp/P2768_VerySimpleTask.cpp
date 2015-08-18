/* 
 * File:   P2768_VerySimpleTask.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 4:51 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define mod 1000000007
#define maxN 1000003
using namespace std;

long long int sPow2[maxN];
long long int pow2[maxN];

void printt(int a){
    for(int i=0;i<a;i++){
        printf("%d ",sPow2[i]);
    }printf("\n");
}

void calc(){
    pow2[0]=1;
    sPow2[0]=1;
    for(int i=1;i<maxN;i++){
        pow2[i]=(2*pow2[i-1])%mod;
    }
    for(int j=1;j<maxN;j++){
        sPow2[j]=(sPow2[j-1]+pow2[j])%mod;
    }
}
int n;
int main() {
    calc();
    while(scanf("%d",&n)&&n){
        printf("%lld\n",sPow2[n]);
    }
    return 0;
}

