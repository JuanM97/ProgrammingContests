/* 
 * File:   P2936_TrianglesAndQuadrilaterals.cpp
 * Author: JuanM
 *
 * Created on September 22, 2014, 10:26 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    long long int n,m;
    while(scanf("%lld %lld",&n,&m)!=EOF){
        printf("Triangles: %lld\n",m*(m-1)/2*n+n*(n-1)/2*m);
        printf("Quadrilaterals: %lld\n\n",m*(m-1)/2*n*(n-1)/2);
    }
    return 0;
}

