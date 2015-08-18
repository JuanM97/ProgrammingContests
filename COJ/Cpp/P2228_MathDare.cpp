/* 
 * File:   P2228_MathDare.cpp
 * Author: JuanM
 *
 * Created on May 16, 2013, 2:19 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <vector>
#define max 31630000
using namespace std;

bool pb[max+3];
vector<long long int>p;

void sieve(){
    p.push_back(2);
    pb[0]=pb[1]=true;
    
    for(int j=2;2*j<max;j++){
        pb[2*j]=true;
    }
    for(long long int i=3; i<max;i+=2){
        if(pb[i]==false){
            p.push_back(i);
            for(long long int j=2;i*j<max;j++){
                pb[i*j]=true;
            }
        }
    }
}

int main() {
    sieve();
    int t;
    long long int n,ans;
    scanf("%d",&t);
    while(t--){
        scanf("%lld",&n);
        ans=1;
        for(int i=0;n!=1&&p[i]!=0&&p[i]*p[i]<=n;i++){
            if(n%p[i]==0){
                while(n%p[i]==0){
                    n/=p[i];
                }
                ans*=p[i];
            }
        }
        if(n!=1){
            ans*=n;
        }
        printf("%lld\n",ans);
    }
    return 0;
}

