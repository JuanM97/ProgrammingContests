/* 
 * File:   P1598_DeterminationOfSeries.cpp
 * Author: JuanM
 *
 * Created on June 27, 2013, 1:01 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;


int main() {
    double r1,r2,r3,a,b,c;
    while(scanf("%lf %lf %lf",&r1,&r2,&r3)!=EOF){
        c=r1;
        b=(4*r2-r3-3*r1)/2;
        a=r2-r1-b;
        r1=a*9+b*3+c;
        r2=a*16+b*4+c;
        r3=a*25+b*5+c;
        printf("%.0lf %.0lf %.0lf\n",r1,r2,r3);
    }
    return 0;
}

