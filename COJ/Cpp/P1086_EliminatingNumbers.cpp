/* 
 * File:   P1086_EliminatingNumbers.cpp
 * Author: JuanM
 *
 * Created on May 4, 2013, 1:25 AM
 */


#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <vector>
#define max 4567900
using namespace std;
vector<long int> p;
bool pB[max];
long int psf[max]={0};
void sieve(){
    p.push_back(2);
    pB[0]=pB[1]=true;
    for(int i=2;i*2<max;i++){
        pB[2*i]=true;
    }
    for(int i=3;i<max;i++){
        if(pB[i]==false){
            p.push_back(i);
            for(int j=3;i*j<max;j++){
                pB[i*j]=true;
            }
        }
    }
}

void fill(){
    int k=0;
    for(long int i=1;i<max;i++){
        if(k<p.size()&&i>=p.at(k)){
            psf[i]=psf[i-1]+1;
            k++;
        }else{
            psf[i]=psf[i-1];
        }
    }
}

void print(){
    for(int i=0;i<max;i++){
        printf("%ld ",psf[i]);
    }printf("\n");
}

void printP(){
    for(int i=0;i<p.size();i++){
        printf("%ld ",p[i]);
    }printf("\n");
}

int main() {
    sieve();
    fill();
    long int t;
    while(scanf("%ld",&t)!=EOF){
        if(t<0)break;
        printf("%ld\n",psf[t]);
    }
    return 0;
}
