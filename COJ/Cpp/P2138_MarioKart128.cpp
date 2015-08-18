/* 
 * File:   P2260_DyckWords.cpp
 * Author: JuanManuel
 *
 * Created on 6 de septiembre de 2014, 12:05
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#include <vector>
#define smx 1000003
using namespace std;

int n,p,s,e;
int pnt[smx];

struct pl_t{
    int lane;
    int num;
    int pts;
}plyr;

struct pl_t pf[smx];

bool myCond(pl_t a,pl_t b){
    return a.pts>b.pts;
}

int main() {
    
    while(scanf("%d %d",&n,&p)!=EOF){
        memset(pnt,0,smx);
        memset(pf,0,smx);
        for(int i=0;i<n;i++){
            scanf("%d %d",&s,&e);
            for(int j=s;j<=e;j++){
                pnt[j]++;
            }
        }
        //printf("hola");
        for(int i=1;i<=p;i++){
            pf[i].num=i;
            scanf("%d",&pf[i].lane);
            pf[i].pts=pnt[pf[i].lane];
        }
        sort(pf+1,pf+p+1,myCond);
        for(int i=1;i<=p;i++){
            printf("%d %d\n",pf[i].num,pf[i].pts);
        }
    }
    return 0;
}

