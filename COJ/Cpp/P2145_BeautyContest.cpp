/* 
 * File:   P2145_BeautyContest.cpp
 * Author: JuanM
 *
 * Created on January 11, 2014, 1:21 AM
 */

#include <cstdlib>
//#include <algorithm>
#include <cstdio>
//#include <cmath>
using namespace std;

int i,csn,n,min,max,s,aux;

int main() {
    scanf("%d",&n);
    csn=1;
    while(n--){
        s=0;
        min=1000;
        max=-1;
        i=10;
        while(i--){
            scanf("%d",&aux);
            s+=aux;
            if(aux<min)min=aux;
            if(aux>max)max=aux;
        }
        printf("%d %d\n",csn++,s-min-max);
    }
    return 0;
}

