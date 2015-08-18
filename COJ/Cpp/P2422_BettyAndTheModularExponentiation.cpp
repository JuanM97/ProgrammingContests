/* 
 * File:   P2422_BettyAndTheModularExponentiation.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 1:39 PM
 */

#include <cstdlib>
#include <cstdio>
#define mod 1000000000
using namespace std;

long int modExp(long long int a,int b){
    long int z=1;
    while(b>0){
        if(b&1){
            z=(z*a)%mod;
        }
        a=(a*a)%mod;
        b=b>>1;
    }
    return z;
}

int main() {
    int t,b;
    long long int a;
    scanf("%d",&t);
    while(t--){
        scanf("%lld %d",&a,&b);
        printf("%ld\n",modExp(a,b));
    }
    return 0;
}

