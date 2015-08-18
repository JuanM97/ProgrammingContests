/* 
 * File:   P1871_BallsColors.cpp
 * Author: JuanManuel
 *
 * Created on 18 de marzo de 2015, 14:04
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 1010
using namespace std;

int main() {
    int t,mn,ct;
    char balls[smx];
    scanf("%d",&t);
    while(t--){
        scanf("%s",balls);
        ct=0;
        mn=10000;
        for(int i=0;i<=strlen(balls);i++){
            ct=0;
            for(int j=0;j<i;j++){
                if(balls[j]=='G') ct++;
            }
            for(int j=i;j<strlen(balls);j++){
                if(balls[j]=='R') ct++;
            }
            if(ct<mn)mn=ct;
        }
        
        printf("%d\n",mn);
    }
    return 0;
}

/*
int main() {
    int t,nr,ng,rr,gg,cr,cg;
    char balls[smx];
    scanf("%d",&t);
    while(t--){
        scanf("%s",balls);
        nr=0;ng=0;
        for(int i=0;i<strlen(balls);i++){
            if(balls[i]=='R')nr++;
            else ng++;
        }
        rr=0;gg=0;cr=0;cg=0;
        for(int i=0;cr<nr&&i<strlen(balls);i++){
            if(balls[i]=='G')rr++;
            else cr++;
        }
        for(int i=strlen(balls)-1;cg<ng&&i>=0;i--){
            if(balls[i]=='R')gg++;
            else cg++;
        }
        printf("%d\n",min(rr,gg));
    }
    return 0;
}
*/
