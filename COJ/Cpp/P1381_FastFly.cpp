/* 
 * File:   P1381_FastFly.cpp
 * Author: JuanM
 *
 * Created on July 1, 2013, 12:07 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int main() {
    int css;
    double d,v1,v2,m,t;
    scanf("%d",&css);
    while(css--){
        scanf("%lf %lf %lf %lf",&d,&v1,&v2,&m);
        t=d/(v1+v2);
        printf("%.2lf\n",m*t);
    }
    return 0;
}

