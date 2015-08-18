/* 
 * File:   P1627_CountingZeroes.cpp
 * Author: JuanM
 *
 * Created on May 14, 2013, 1:25 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#define max 11
using namespace std;
long long int m5[max];

void preCalc(){
    m5[0]=5;
    for(int i=1;i<max;i++){
        m5[i]=5*m5[i-1];
    }
}

void print(){
    for(int i=0;i<max;i++){
        printf("%lld ",m5[i]);
    }
}

int main() {
    int t,zs;
    long long int n;
    preCalc();
    //print();
    scanf("%d",&t);
    while(t--){
        zs=0;
        scanf("%lld",&n);
        for(int i=0;m5[i]<=n;i++){
            zs+=int(n/m5[i]);
        }
        printf("%d\n",zs);
    }
    return 0;
}

