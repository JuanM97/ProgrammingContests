/* 
 * File:   P1515_R3.cpp
 * Author: JuanManuel
 *
 * Created on 6 de septiembre de 2014, 13:06
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;


int main() {
    int t;
    double r,rd;
    //printf("%.3lf",DBL_MAX);
    scanf("%d",&t);
    while(t--){
        scanf("%lf",&r);
        rd=2*r*r*r/3;
        printf("%.3lf\n",rd);
    }
    return 0;
}

