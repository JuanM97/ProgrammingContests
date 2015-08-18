/* 
 * File:   P1937_Diagonals.cpp
 * Author: JuanM
 *
 * Created on January 21, 2015, 2:05 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

//d(n)=n*(n-3)/2 -> Solve for n and ceil it

int main() {
    long long int d;
    int idx=1;
    
    while(scanf("%lld",&d)!=EOF&&d!=0){
        printf("Case %d: %lld\n",idx++,(long long int)ceil((3+sqrt(9+8*d))/2));
    }
    
    return 0;
}

