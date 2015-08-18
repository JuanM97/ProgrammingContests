/* 
 * File:   P2853_RegularOctagon.cpp
 * Author: JuanManuel
 *
 * Created on 6 de mayo de 2015, 17:17
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define PI 3.14159265358979323
using namespace std;

int main() {
    double c,ap,a,r;
    while(scanf("%lf",&c)!=EOF&&c){
        a=c*(sqrt(2)-1);
        r=a/(2*sin(22.5*PI/180));
        ap=sqrt(r*r-a*a/4);
        printf("%.3lf\n",4*a*ap);
    }
    return 0;
}

