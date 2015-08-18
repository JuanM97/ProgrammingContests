/* 
 * File:   P1355_TheCrossI.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 1:34 AM
 */

#include <cstdlib>
#include <cstdio>
#define PI 3.141592653589793
using namespace std;

int main() {
    const double c=1.-PI*1./3.*1./3.-2.*1./3.*1./2.;
    double a;
    while(scanf("%lf",&a)!=EOF){
        printf("%.4lf\n",c*a*a);
    }
    return 0;
}

