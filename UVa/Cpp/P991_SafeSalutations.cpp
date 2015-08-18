/* 
 * File:   P991_SafeSalutations.cpp
 * Author: JuanM
 *
 * Created on March 17, 2013, 9:37 PM
 */

#include <cstdlib>
#include <cmath>
#include <algorithm>
#include <cstdio>
#include <iostream>
using namespace std;
//#define max 13

long long int cn[12];

void fc(){
    cn[0]=1;cn[1]=1;cn[2]=2;cn[3]=5;cn[4]=14;
    for(int i=4;i<11;i++){
        cn[i+1]=2*(2*i+1)*cn[i]/(i+2);
    }
}

void print(){
    for(int i=0;i<12;i++){
        printf("%lld ",cn[i]);
    }
}

int main() {
    fc();
    int t;
    bool f=false;
    while(scanf("%d",&t)!=EOF){
        if(f){
            printf("\n");
        }
        printf("%lld\n",cn[t]);
        f=true;
    }
    return 0;
}

