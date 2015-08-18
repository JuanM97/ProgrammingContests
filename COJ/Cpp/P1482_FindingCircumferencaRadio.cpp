/* 
 * File:   P1482_FindingCircumferencaRadio.cpp
 * Author: JuanM
 *
 * Created on December 3, 2014, 9:29 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <cfloat>
using namespace std;

int main() {
    double a,b,c;
    double cr,ir;
    
    while(scanf("%lf %lf %lf",&a,&b,&c)!=EOF){
        if(a+b>=c&&a+c>=b&&b+c>=a){
            cr=(a*b*c)/sqrt((a+b+c)*(a+b-c)*(b+c-a)*(a+c-b));
            ir=2*sqrt(((a+b+c)/2)*((a+b-c)/2)*((a+c-b)/2)*((b+c-a)/2))/(a+b+c);
            printf("%.2lf %.2lf\n",ir,(cr>DBL_MAX?max(a,max(b,c))/2:cr));
        }else{
            printf("ERROR\n");
        }
    }
    
    return 0;
}

