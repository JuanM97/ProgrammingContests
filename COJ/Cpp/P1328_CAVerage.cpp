/* 
 * File:   P1328_CAVerage.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 12:23 AM
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <math.h>
using namespace std;
double avg[55];

int main() {
    int cases,num,cont;
    double a,pts;
    scanf("%d",&cases);
    while(cases--){
        scanf("%d",&num);
        pts=0;
        for(int i=0;i<num;i++){
            scanf("%lf",&avg[i]);
            pts+=avg[i];
        }
        for(int i=0;i<num;i++){
            scanf("%lf",&a);
            pts+=a;
            avg[i]+=a;avg[i]/=2;
        }
        pts/=(2*num);
        cont=0;
        for(int i=0;i<num;i++){
            if(avg[i]<pts)cont++;
        }
        printf("%d\n",cont);
    }
    return 0;
}

