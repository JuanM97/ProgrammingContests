/* 
 * File:   P1552_FibonacciCalculation.cpp
 * Author: JuanM
 *
 * Created on April 28, 2013, 2:31 AM
 */

#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <iostream>
#include <vector>
#define smx 1000000005
#define mod 1000000007
using namespace std;

struct Matrix{
    unsigned long long int v[2][2];
    void init(){
        v[0][0]=0ULL;
        v[0][1]=1ULL;
        v[1][0]=1ULL;
        v[1][1]=1ULL;
    }
};
Matrix mult(Matrix a,Matrix b){
    Matrix c;
    c.v[0][0]=a.v[0][0]*b.v[0][0]+a.v[1][0]*b.v[0][1];
    c.v[1][0]=a.v[0][0]*b.v[1][0]+a.v[1][0]*b.v[1][1];
    c.v[0][1]=a.v[0][1]*b.v[0][0]+a.v[1][1]*b.v[0][1];
    c.v[1][1]=a.v[0][1]*b.v[1][0]+a.v[1][1]*b.v[1][1];
    return c;
}
Matrix modd(Matrix a){
    Matrix d;
    d.v[0][0]=a.v[0][0]%mod;
    d.v[0][1]=a.v[0][1]%mod;
    d.v[1][0]=a.v[1][0]%mod;
    d.v[1][1]=a.v[1][1]%mod;
    return d;
}
void printMat(Matrix a){
    printf("V: %d %d\n   %d %d\n",a.v[0][0],a.v[1][0],a.v[0][1],a.v[1][1]);
}
Matrix modExp(Matrix a,int b){
    Matrix z;
    z.init();
    while(b>0){
        if(b&1)
            z=modd(mult(a,z));
        a=modd(mult(a,a));
        b=b>>1;
    }
    return z;
}

vector<int>fib;

void preCalc(){
    fib.push_back(0);
    fib.push_back(1);
    for(int i=2;i<smx;i++){
        fib.push_back((fib[i-1]+fib[i-2])%mod);
    }
}

/*
 * Get sequence of sums and get sum(x)=fib(x+2)-1. Ans=sum(b)-sum(a-1)
*/

int main() {
    //preCalc();
    Matrix one,ma,mb;
    int t,a,b;
    one.init();
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&a,&b);
        ma=modExp(one,a);
        mb=modExp(one,b);
        //printf("%d %d\n",ma.v[1][0],mb.v[1][1]);
        printf("%llu\n",mb.v[1][1]-ma.v[1][0]);
    }
    return 0;
}

