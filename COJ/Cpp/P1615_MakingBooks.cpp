/* 
 * File:   P1615_MakingBooks.cpp
 * Author: JuanManuel
 *
 * Created on 20 de mayo de 2015, 20:06
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smn 10000
#define smx 11
using namespace std;
int sdig[smn][smx];
int main() {
    int a,b,ma,mb,dd,auxi;
    for(int i=1;i<smn;i++){
        auxi=i;
        for(int j=0;j<smx;j++){
            sdig[i][j]=sdig[i-1][j];
        }
        while(auxi>0){
            dd=auxi%10;
            sdig[i][dd]++;
            auxi/=10;
        }
    }
    int caseNo=1;
    while(scanf("%d",&a)&&a){
        scanf("%d",&b);
        ma=min(a,b);
        mb=max(a,b);
        printf("Case %d:",caseNo++);
        for(int j=0;j<10;j++){
            printf(" %d:%d",j,sdig[mb][j]-sdig[ma-1][j]);
        }printf("\n");
    }
    return 0;
}

