/* 
 * File:   P2427_HowManyPrimes.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 12:59 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#define smx 1000013
using namespace std;


bool pb[smx];
int ps[smx];

void preCalc(){
    pb[0]=1;
    pb[1]=1;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=1;
    }
    for(int i=3;i<smx;i++){
        if(!pb[i]){
            for(int j=3;i*j<smx;j++){
                pb[i*j]=1;
            }
        }
    }
}

void sumP(){
    ps[0]=0;
    for(int i=1;i<smx;i++){
        if(pb[i]){
            ps[i]=ps[i-1];
        }else{
            ps[i]=ps[i-1]+1;
        }
    }
}

int main() {
    preCalc();
    sumP();
    int a,b;
    while(scanf("%d %d",&a,&b)){
        if(a==0&&b==0)break;
        printf("%d\n",ps[b]-ps[a-1]);
    }
    return 0;
}

