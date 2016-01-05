/* 
 * File:   P3410_Reports.cpp
 * Author: JuanM
 *
 * Created on November 30, 2015, 11:56 PM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#define smx 2030
using namespace std;

long tm[smx];

int main() {
    int N;
    int y;
    long r;
    while(scanf("%d",&N)!=EOF){
        if(N<0)break;
        memset(tm,0,sizeof(tm));
        while(N--){
            scanf("%d %ld",&y,&r);
            tm[y]+=r;
        }
        for(int i=0;i<smx;i++){
            if(tm[i]!=0) printf("%d %ld\n",i,tm[i]);
        }
    }
    return 0;
}

