/* 
 * File:   P1013_PerfectPthPowers.cpp
 * Author: JuanM
 *
 * Created on April 6, 2015, 11:01 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 1000000
using namespace std;

vector<long> p;
long bp[smx];

void sieve(){
    bp[0]=true;
    bp[1]=true;
    p.push_back(2);
    for(int i=2;2*i<smx;i++){
        bp[2*i]=true;
    }
    for(int i=3;i<smx;i++){
        if(!bp[i]){
            p.push_back(i);
            for(int j=i;j<smx;j+=i){
                bp[j]=true;
            }
        }
        
    }
}

int gcd(int a, int b){
    return b==0?a:gcd(b,a%b);
}

int main() {
    long n,t,tn;
    int pp,ppmax;
    bool hasOneDiv;
    sieve();
    while(scanf("%ld",&n)&&n){
        hasOneDiv = false;
        pp=0,ppmax=0;
        tn=n;
        if(n<0)n=-n;
        for(int i=0;p[i]<=n && i<p.size();i++){
            pp=0;
            if(n%p[i]==0){
                while(n%p[i]==0){
                    n/=p[i];
                    pp++;
                }
                ppmax=gcd(pp,ppmax);
            }
        }
        if(ppmax==0){
            ppmax=1;
        }
        if(tn<0){
            while(ppmax%2==0) ppmax/=2;
        }
        printf("%d\n",ppmax);
    }
    return 0;
}

