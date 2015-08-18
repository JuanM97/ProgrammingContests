/* 
 * File:   Prob34.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 12:45 AM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
//Upper limit: 9!=362880. MAX -> #digs(9!*#digs)=#digs :. #digs=7 -> Upper limit= 7*9!
#define smx 2540200
using namespace std;

int fact[10];

void preCF(){
    fact[0]=1;
    fact[1]=1;
    for(int i=2;i<10;i++){
        fact[i]=i*fact[i-1];
    }
}

bool sameSum(int a){
    int s=0,r=0,aa=a;
    while(a>=1){
        r=a%10;
        a/=10;
        s+=fact[r];
    }
    return s==aa;
}


int main() {
    preCF();
    long ss=0;
    for(int i=3;i<smx;i++){
        if(sameSum(i))ss+=i;
    }
    printf("%ld\n",ss);
    return 0;
}

