/* 
 * File:   P1857_TheKnightsOfTheRoundTable.cpp
 * Author: JuanManuel
 *
 * Created on 20 de mayo de 2015, 21:57
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;
//Don't know whats happening ... ):
int main() {
    double a,b,c,ret,s;
    while(scanf("%lf %lf %lf",&a,&b,&c)!=EOF){
        s=(a+b+c)/2;
        ret=2*sqrt(s*(s-a)*(s-b)*(s-c))/(a+b+c);
        printf("The radius of the round table is: %.3lf\n",ret);
    }
    return 0;
}

