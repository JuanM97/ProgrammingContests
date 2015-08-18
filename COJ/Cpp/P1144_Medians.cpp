/* 
 * File:   P1144_Medians.cpp
 * Author: JuanM
 *
 * Created on July 1, 2013, 4:08 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <iostream>
using namespace std;

int main() {
    double a,b,c,s;
    while(scanf("%lf %lf %lf",&a,&b,&c)!=EOF){
        s=(a+b+c)/2.;
        a=(4./3.)*sqrt(s*(s-a)*(s-b)*(s-c));
        if(a>0){
            printf("%.3lf\n",a);
        }else{
            printf("-1.000\n");
        }
    }
    return 0;
}

