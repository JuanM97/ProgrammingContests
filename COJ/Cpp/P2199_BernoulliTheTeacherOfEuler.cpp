/* 
 * File:   P2199_BernoulliTheTeacherOfEuler.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 1:27 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#define smx 13
using namespace std;

double sq[smx];

int main() {
    sq[2]=sqrt(2);
    sq[3]=sqrt(2-sqrt(2));
    sq[4]=sqrt(2-sqrt(2+sqrt(2)));
    sq[5]=sqrt(2-sqrt(2+sqrt(2+sqrt(2))));
    sq[6]=sqrt(2-sqrt(2+sqrt(2+sqrt(2+sqrt(2)))));
    sq[7]=sqrt(2-sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2))))));
    sq[8]=sqrt(2-sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2)))))));
    sq[9]=sqrt(2-sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2))))))));
    sq[10]=sqrt(2-sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2)))))))));
    sq[11]=sqrt(2-sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2+sqrt(2))))))))));
    int t,n;
    double r;
    scanf("%d",&t);
    while(t--){
        scanf("%lf %d",&r,&n);
        printf("%.4lf\n",r*sq[n]);
    }
    return 0;
}

