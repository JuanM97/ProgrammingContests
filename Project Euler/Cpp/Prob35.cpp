/* 
 * File:   Prob35.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 12:55 AM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 1000100
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

long int exp(int a,int b){
    int x=a,y=b,z=1;
    while(y>0){
        if(y&1) z=z*x;
        x=x*x;
        y>>=1;
    }
    return z;
}

bool rott(int a){
    int aa=a,ll=0,r=0;
    long int ee=1;
    while(aa>=1){aa/=10;ll++;}
    aa=a;
    //printf("ll: %d \n",ll);
    ee=exp(10,ll-1);
    for(int i=0;i<ll;i++){
        //printf("%d ",aa);
        r=aa%10;
        aa/=10;
        aa+=(ee*r);
        if(pb[aa])return false;
    }
    return true;
}

int main() {
    sieve();
    int ss=0;
    for(int i=1;i<1000001;i++){
        if(!pb[i]&&rott(i)){
            //printf("%d ",i);
            ss++;
        }
    }
    printf("ss: %d\n",ss);
    return 0;
}

