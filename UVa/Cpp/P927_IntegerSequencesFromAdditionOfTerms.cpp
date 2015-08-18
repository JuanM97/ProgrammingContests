/* 
 * File:   P927_IntegerSequencesFromAdditionOfTerms.cpp
 * Author: JuanManuel
 *
 * Created on 26 de mayo de 2015, 19:51
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 50
using namespace std;
long long int coefs[smx];
int main() {
    long long int t,n,d,k,r,ans,auxr;
    scanf("%lld",&t);
    while(t--){
        scanf("%lld",&n);
        for(int i=0;i<=n;i++) scanf("%lld",&coefs[i]);
        scanf("%lld %lld",&d,&k);
        r=ceil((-d+sqrt(d*d+8*k*d))/(2*d));
        //printf("b: %lld   ",r);
        ans=coefs[0];
        auxr=r;
        for(int i=1;i<=n;i++){
            ans+=(coefs[i]*auxr);
            auxr*=r;
        }
        printf("%lld\n",ans);
    }
    return 0;
}

