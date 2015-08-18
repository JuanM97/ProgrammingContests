/* 
 * File:   Prob27.cpp
 * Author: JuanM
 *
 * Created on June 10, 2014, 7:14 PM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 1010
using namespace std;

vector<int> p;
bool pb[smx];

void sieve(){
    p.push_back(2);
    pb[0]=true;
    pb[1]=true;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=true;
    }
    for(int i=3;i<smx;i++){
        if(!pb[i]){
            p.push_back(i);
            for(int j=2;i*j<smx;j++){
                pb[i*j]=true;
            }
        }
    }
}

vector<int>b;
void genB(){
    for(int i=0;p[i]<=smx;i++){
        b.push_back(p[i]);
    }
}

bool isPrime(int a){
    bool isp=true;
    for(int i=0;p[i]*p[i]<=a;i++){
        if(a%p[i]==0){
            isp=false;
            break;
        }
    }
    return isp;
}

int a=0,bb=0,ll=-1,mxl=-1,num=0;

int main() {
    sieve();
    genB();
    //printf("init: %d\n",b.size());
    for(int i=-1000;i<=1000;i++){
        //printf("%d ",i);
        for(int j=0;j<b.size();j++){
            ll=0;
            for(int n=0;n<1000;n++){
                num=n*n+i*n+p[j];
                if(!isPrime(abs(num))) break;
                ll++;
            }
            if(ll>mxl){mxl=ll;a=i;bb=p[j];};
            ll=0;
            for(int n=0;n<1000;n++){
                num=n*n+i*n-p[j];
                if(!isPrime(abs(num))) break;
                ll++;
            }
            if(ll>mxl){mxl=ll;a=i;bb=p[j];};
        }
    }
    printf("num primes:%d, a=%d, b=%d, a*b=%d\n",mxl,a,bb,a*bb);
    return 0;
}

