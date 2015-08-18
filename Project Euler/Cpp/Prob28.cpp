/* 
 * File:   Prob28.cpp
 * Author: JuanM
 *
 * Created on June 10, 2014, 7:47 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 1001
using namespace std;

int main() {
    int s=0,ant=1,k=1,init=0;
    for(int i=1;ant<=smx*smx;i++){
        k=2*i;
        init=ant+k;
        for(int j=0;j<4;j++){
            if(ant>smx*smx)break;
            //printf("%d ",ant);
            s+=ant;
            ant+=k;
        }
    }
    printf("%d\n",s);
    return 0;
}

