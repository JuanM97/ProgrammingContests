/* 
 * File:   P1525_Symmetry.cpp
 * Author: JuanManuel
 *
 * Created on 29 de mayo de 2015, 19:22
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;
// ):
int main() {
    long long int n,m,mult,ans;
    while(scanf("%lld %lld",&n,&m)!=EOF){
        mult=1;
        ans=0;
        while(n%2==1 || m%2==1){
            if(m==1 && n==1)break;
            ans+=mult;
            if(n>1 && m>1)mult*=4;
            else mult*=2;
            if(n>1)n>>=1;
            if(m>1)m>>=1;
            //printf("%lld %lld mn:%lld %lld\n",ans,mult,m,n);
        }
        printf("%lld\n",ans);
    }
    return 0;
}

