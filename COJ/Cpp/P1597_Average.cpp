/* 
 * File:   P1597_Average.cpp
 * Author: JuanM
 *
 * Created on July 1, 2013, 12:44 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
using namespace std;

long int avs[5000007];

int main() {
    int h,l,n;
    double avg;
    while(scanf("%d %d %d",&h,&l,&n)!=EOF){
        if(h==0 && l==0 && n==0)break;
        for(int i=0;i<n;i++){
            scanf("%ld",&avs[i]);
        }
        sort(avs,avs+n);
        avg=0;
        for(int i=l;i<n-h;i++){
            avg+=avs[i];
        }
        printf("%.6lf\n",avg/(n-h-l));
    }
    return 0;
}

