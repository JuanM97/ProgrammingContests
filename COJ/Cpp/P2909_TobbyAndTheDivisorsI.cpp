
/* 
 * File:   P245_Exponent.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 1:53 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#define smx 3000
using namespace std;

int numDivs[smx];
int maxDivs[smx];

void preCalc(){
    for(int i=1;i<smx;i++){
        for(int j=i;j<smx;j+=i){
            numDivs[j]++;
        }
    }
    int maxD=-1,idxMax=1;
    for(int i=1;i<smx;i++){
        if(maxD<numDivs[i]){
            maxD=numDivs[i];
            idxMax=i;
        }
        maxDivs[i]=idxMax;
    }
}



int main() {
    preCalc();
//    for(int i=0;i<18;i++){
//        printf("%d ",numDivs[i]);
//    }printf("\n");
    for(int i=2400;i<2500;i++){
        printf("%d ",maxDivs[i]);
    }
    int a,n;
    scanf("%d",&a);
    while(a--){
        scanf("%d",&n);
        printf("%d\n",maxDivs[n]);
    }
    return 0;
}

