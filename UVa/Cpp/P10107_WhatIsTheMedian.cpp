/* 
 * File:   P10107_WhatIsTheMedian.cpp
 * Author: JuanManuel
 *
 * Created on 12 de febrero de 2014, 15:04
 */


#include <cstdlib>
#include <cmath>
#include <cstring>
#include <cstdio>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<long long int>v;
void print(){
    for(int i=0;i<v.size();i++){
        printf("%lld",v[i]);
    }printf("\n");
}

int main() {
    long long int n,r=0;
    while(scanf("%lld",&n)!=EOF){
        v.push_back(n);
        sort(v.begin(),v.end());
        if(v.size()%2){
            r=v[(v.size()+1)/2-1];
        }else{
            r=(v[v.size()/2-1]+v[(v.size()+1)/2])/2;
        }
        printf("%lld\n",r);
    }
    return 0;
}

