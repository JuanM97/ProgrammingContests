/* 
 * File:   P245_Exponent.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 1:53 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;

int main() {
    int n;
    double a,b,ma,mb;
    while(scanf("%d",&n)){
        if(n==0)break;
        scanf("%lf %lf",&ma,&mb);
        while(n-->1){
            scanf("%lf %lf",&a,&b);
            if(mb<b*log(a)/log(ma)){
                mb=b;
                ma=a;
            }
        }
        printf("%.lf %.lf\n",ma,mb);
    }
    return 0;
}

