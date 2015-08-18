/* 
 * 
 * File:   P1484_HotestMountain.cpp
 * Author: JuanM
 *
 * Created on April 24, 2013, 11:01 PM
 */


#include <cstdlib>
#include <cstdio>
#include <iostream>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int t,d;
    double a,M;
    while(scanf("%d",&t)!=EOF){
        M=-10.0;
        for(int i=1;i<=t;i++){
            scanf("%f",&a);
            if(a>=M){
                M=a;
                d=i;
            }
        }
        printf("%d\n",d);
    }
    return 0;
}




