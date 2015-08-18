/* 
 * File:   P3071_TheatreSquare.cpp
 * Author: JuanM
 *
 * Created on November 27, 2014, 10:56 PM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    double n,m,a;
    
    while(scanf("%lf %lf %lf",&n,&m,&a)!=EOF){
        printf("%lld\n",(long long int)ceil(n/a)*(long long int)ceil(m/a));
    }
    
    return 0;
}

