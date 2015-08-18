/* 
 * File:   P1561_HiddenCandy.cpp
 * Author: JuanM
 *
 * Created on August 18, 2013, 2:25 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <vector>
#include <algorithm>
#define smx 1000000
using namespace std;

bool pb[smx];
vector<long long int>vp;

void preCalc(){
    pb[0]=1;
    pb[1]=1;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=1;
    }
    vp.push_back(2);
    for(int i=3;i<smx;i++){
        if(!pb[i]){
            vp.push_back(i);
            for(int j=3;i*j<smx;j++){
                pb[i*j]=1;
            }
        }
    }
}

vector<long long int>v;
int q,ca,cb;
long long int a,b;
int main() {
    for(long long int i=2;i<=1000000;i++){
        v.push_back(i*i);
    }
    scanf("%d",&q);
    while(q--){
        ca=0;cb=0;
        scanf("%lld %lld",&a,&b);
        for(int i=0;(a-1>=v[i]||b>=v[i])&&i<1000000;i++){
            if(a-1>=v[i])ca++;
            if(b>=v[i])cb++;
        }
        printf("%d %d: %d\n",cb,ca,cb-ca);
    }
    return 0;
}

