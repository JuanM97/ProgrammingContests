/* 
 * File:   P12468_Zapping.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 4:39 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#define chN 100
using namespace std;

int a,b,nmin,nmax;

int main() {
    while(scanf("%d %d",&a,&b)){
        if(a==-1 && b==-1)break;
        nmin=min(a,b);
        nmax=max(a,b);
        printf("%d\n",(nmax-nmin)<(nmin-nmax+chN)%chN?(nmax-nmin):(nmin-nmax+chN)%chN);
    }
    return 0;
}

