/* 
 * File:   Prob30.cpp
 * Author: JuanM
 *
 * Created on June 10, 2014, 9:00 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 354300
using namespace std;

//To find the upper bound: numDigs(n*9^5)==n -> n=6 -> n*9^5=354294

int dgs[10];

int exp(int a,int b){
    int x=a,y=b,z=1;
    while(y>0){
        if(y&1) z=z*x;
        x=x*x;
        y>>=1;
    }
    return z;
}

void preCalc(){
    for(int i=0;i<10;i++){
        dgs[i]=exp(i,5);
    }
}

int sumDigs5(int a){
    int s=0,r=0;
    while(a>=1){
        r=a%10;
        a/=10;
        s+=dgs[r];
    }
    return s;
}

int main() {
    preCalc();
    int c=0;
    for(int i=10;i<smx;i++){
        if(sumDigs5(i)==i)c+=i;
    }
    printf("%d\n",c);
    return 0;
}

