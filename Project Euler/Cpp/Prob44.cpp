/* 
 * File:   Prob44.cpp
 * Author: JuanM
 *
 * Created on June 12, 2014, 7:07 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 5000
using namespace std;

bool isPent(int number) {
    double penTest=(sqrt(1+24*number)+1.0)/6.0;
    return penTest==(int)penTest;
}

int main() {
    int mind=INT_MAX,dd=0,n=0,m=0;
    for(int i=2;i<smx;i++){
        n=i*(3*i-1)/2;
        for(int j=i-1;j>0;j--){
            m=j*(3*j-1)/2;
            if(isPent(n-m)&&isPent(n+m)){
                //printf("%d_%d, %d_%d  ",n,i,m,j);
                dd=n-m;
                if(dd<mind)mind=dd;
            }
        }
    }
    printf("%d\n",mind);
    return 0;
}

