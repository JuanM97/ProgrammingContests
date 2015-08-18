/* 
 * File:   P1122_Yeehaa!.cpp
 * Author: JuanM
 *
 * Created on November 17, 2014, 6:30 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <cstring>
#include <algorithm>
#define PI 3.141592653589793
using namespace std;

int main() {
    int t,n;
    double r;
    
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
        scanf("%lf %d",&r,&n);
        printf("Scenario #%d:\n%.3lf\n\n",i,r*sin(PI/n)/(1+sin(PI/n)));
    }
    
    return 0;
}

