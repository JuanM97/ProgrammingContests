/* 
 * File:   P3223_SumOfFactors.cpp
 * Author: JuanM
 *
 * Created on May 7, 2015, 11:48 PM
 */

#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <iostream>
#include <vector>
#define smx 1000010
using namespace std;

vector<long int>v;
bool bP[smx];

void sieve(){
    bP[0]=true;
    bP[1]=true;
    v.push_back(2);
    for(int i=2;2*i<smx;i++){
        bP[2*i]=true;
    }
    for(int i=3;i<smx;i++){
        if(bP[i]==false){
            v.push_back(i);
            for(int j=3;i*j<smx;j++){
                bP[i*j]=true;
            }
        }
    }
}

int main() {
    int t,n,alpha,m;
    long int sum,ct;
    sieve();
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        if(!bP[n]){
            printf("%d\n",n+1);
        }else{
            ct=0;sum=1;
            for(int i=0;v[i]<=n;i++){
                alpha=0;
                while(n%v[i]==0){
                    alpha++;
                    n/=v[i];
                }
                ct=(long int)(pow((double)v[i],(double)(alpha+1))-1)/(v[i]-1);
                //printf("%d ",ct);
                sum*=ct;
            }
            printf("%ld\n",sum);
        }        
    }
    return 0;
}

