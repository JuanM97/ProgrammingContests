/* 
 * File:   P1366_LuckyNumbersI.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 6:52 PM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <vector>
#define maxS 14
using namespace std;

long int pot5[maxS];
vector<long int>lN;

void preCalcPot5(){
    pot5[0]=1;
    for(int i=1;i<maxS;i++){
        pot5[i]=5*pot5[i-1];
    }
}

void preCalcLuckyNumbers(){
    int sz=0;
    lN.push_back(5);
    for(int i=2;i<maxS;i++){
        sz=lN.size();
        lN.push_back(pot5[i]);
        for(int j=0;j<sz;j++){
            lN.push_back(pot5[i]+lN[j]);
        }
    }
}

void printN(int b){
    for(int i=0;i<b;i++){
        printf("%d ",lN[i]);
    }printf("\n");
}

int main(){
    preCalcPot5();
    preCalcLuckyNumbers();
    //printf("Size: %d\n",lN.size());
    int t,n;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        printf("%d\n",lN[n-1]);
    }
    return 0;
}

