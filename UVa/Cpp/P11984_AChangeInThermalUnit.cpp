/* 
 * File:   P11984_AChangeInThermalUnit.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 5:02 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

int t;
double C,dT;
int main() {
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
        scanf("%lf %lf",&C,&dT);
        printf("Case %d: %.2lf\n",i,C+5*dT/9);
    }
    return 0;
}

