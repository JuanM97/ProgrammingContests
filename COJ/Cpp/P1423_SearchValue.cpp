/* 
 * File:   P1423_SearchValue.cpp
 * Author: JuanM
 *
 * Created on May 12, 2013, 9:55 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;

int main() {
    double a;
    while(scanf("%lf",&a)!=EOF){
        printf("%.6lf\n",a*sqrt(3)/4);
    }
    return 0;
}

