/* 
 * File:   P10940_ThrowingCardsAwayII.cpp
 * Author: JuanM
 *
 * Created on June 3, 2014, 7:51 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
#define maxs 500003
using namespace std;
//Simulation won't work ...
//Pattern found: 1 2, 2 4, 2 4 6 8, 2 4 6 8 10 12 14 16, 2 4 ...
int n,a;
int p[maxs];

void preCalc(){
    p[0]=1;p[1]=2;
    int a=0,mx=4;
    for(int i=2;i<maxs;i++){
        a+=2;
        p[i]=a;
        if(a==mx){
            mx*=2;
            a=0;
        }
    }
}

int main() {
    preCalc();
    /*for(int i=0;i<20;i++){
        printf("%d ",p[i]);
    }printf("\n");
    */
    while(scanf("%d",&n)&&n>0){
        printf("%d\n",p[n-1]);
    }
    return 0;
}

