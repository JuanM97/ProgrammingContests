/* 
 * File:   P3075_TaxicabGeometry.cpp
 * Author: JuanManuel
 *
 * Created on 15 de mayo de 2015, 17:27
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define PI 3.14159265358979323
using namespace std;

int main() {
    int r;
    while(scanf("%d",&r)!=EOF){
        printf("%.6lf\n%.6lf\n",PI*r*r,2.*r*r);
    }
    return 0;
}

