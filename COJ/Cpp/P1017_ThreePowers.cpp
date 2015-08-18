/* 
 * File:   P1017_ThreePowers.cpp
 * Author: JuanManuel
 *
 * Created on 3 de octubre de 2014, 13:41
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define smx 43
using namespace std;

long long int powersOf3[smx];
long long int powersOf2[smx];

void preCalc(){
    powersOf3[0]=0;
    powersOf3[1]=1;
    for(int i=2;i<smx;i++){
        powersOf3[i]=3*powersOf3[i-1];
    }
    powersOf2[0]=0;
    powersOf2[1]=1;
    for(int i=2;i<smx;i++){
        powersOf2[i]=powersOf2[i-1]<<1;
    }
}

void printt(){
    for(int i=0;i<smx;i++){
        printf("%lld ",powersOf2[i]);
    }printf("\n");
    for(int i=0;i<smx;i++){
        printf("%lld ",powersOf3[i]);
    }printf("\n");
}

int main() {
    preCalc();
    printt();
    int n,b;
    while(scanf("%d",&n)&&n){
        n--;
        while(n!=0){
            b=(int)(log(n)/log(2));
            printf("%lld ",powersOf3[b+1]);
            n-=powersOf2[b+1];
        }
        
    }
    return 0;
}

