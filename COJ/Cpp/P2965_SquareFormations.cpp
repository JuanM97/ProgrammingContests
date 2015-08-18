/* 
 * File:   P2965_SquareFormations.cpp
 * Author: JuanManuel
 *
 * Created on 16 de julio de 2014, 15:56
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 1001100
using namespace std;

bool sqs[smx+10];

void preCalc(){
    for(int i=1;i*i<=smx;i++){
        sqs[i*i]=true;
    }    
}

int t,k,d,csn=1;

int main() {
    preCalc();
    scanf("%d",&t);
    bool f=false;
    while(t--){
        scanf("%d",&k);
        f=false;
        for(d=2;d<=smx;d+=2){
            if(sqs[d+k]&&sqs[d/2+k])break;
        }
        printf("Case %d: %d\n",csn++,d);
    }
    
    return 0;
}

