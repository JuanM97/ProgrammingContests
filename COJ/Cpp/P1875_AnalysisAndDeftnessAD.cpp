/* 
 * File:   P1875_AnalysisAndDeftnessA&D.cpp
 * Author: JuanM
 *
 * Created on June 6, 2013, 12:38 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#define PI 3.14159265358979323846264
using namespace std;


int main() {
    int t;
    double r;
    scanf("%d",&t);
    while(t--){
        scanf("%lf",&r);
        printf("%.2lf\n",6*r*r*sin(PI/6)*cos(PI/6));
    }
    return 0;
}

