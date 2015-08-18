/* 
 * File:   Prob36.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 1:15 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 1000000
using namespace std;

char dec[10],bin[33];

bool isPal(char s[]){
    for(int i=0;i<strlen(s)/2;i++){
        if(s[i]!=s[strlen(s)-i-1])return false;
    }
    return true;
}

void toBin(int a){
    memset(bin,0,sizeof(bin));
    int idx=0;
    while(a>0){
        bin[idx++]=(char)(a%2+'0');
        a>>=1;
    }
    reverse(bin,&bin[strlen(bin)]);
}

int main() {
    int ss=0;
    for(int i=1;i<=smx;i++){
        sprintf(dec,"%d",i);
        toBin(i);
        if(isPal(dec)&&isPal(bin)){
            printf("dec: %s, bin: %s\n",dec,bin);
            ss+=i;
        }
    }
    printf("sum: %d\n",ss);
    return 0;
}

