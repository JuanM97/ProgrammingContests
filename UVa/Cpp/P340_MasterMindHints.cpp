/* 
 * File:   P340_MasterMindHints.cpp
 * Author: JuanM
 *
 * Created on July 12, 2013, 10:31 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int a[13],b[13],code[1013],guess[1013];
int n,strong,total,gameN=1;

inline bool isZero(int n){
    for(int i=0;i<n;i++){
        if(guess[i]!=0)return false;
    }
    return true;
}

int main() {
    while(scanf("%d",&n)){
        if(n==0)break;
        memset(code,0,sizeof code);
        memset(guess,0,sizeof guess);
        memset(a,0,sizeof a);
        for(int i=0;i<n;i++){
            scanf("%d",&code[i]);
            a[code[i]]++;
        }
        printf("Game %d:\n",gameN++);
        while(1){
            memset(b,0,sizeof b);
            for(int i=0;i<n;i++){
                scanf("%d",&guess[i]);
                b[guess[i]]++;
            }
            if(isZero(n))break;
            strong=0;total=0;
            for(int i=0;i<n;i++) strong+=(code[i]==guess[i]?1:0);
            for(int i=0;i<11;i++) total+=(min(a[i],b[i]));
            printf("    (%d,%d)\n",strong,total-strong);
        }
    }
    return 0;
}

