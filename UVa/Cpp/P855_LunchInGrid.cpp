/* 
 * File:   P855_LunchInGrid.cpp
 * Author: JuanM
 *
 * Created on March 17, 2013, 6:49 PM
 */
//:(
#include <cstdlib>
#include <cmath>
#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main() {
    int t,s,a,f,n,m,sn,sm;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d %d",&s,&a,&f);
        sn=0;sm=0;
        for(int i=0;i<f;i++){
            scanf("%d %d",&n,&m);
            sn+=n;
            sm+=m;
        }
        printf("(Street: %d, Avenue: %d)",(int)((double)sn/(double)f),(int)((double)sm/(double)f));
    }
    return 0;
}

