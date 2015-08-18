/* 
 * File:   P2243_MagicConstant.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 1:06 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
using namespace std;

int main() {
    long long int n;
    while(scanf("%lld",&n) && n){
        printf("%lld\n",n*(n*n+1)>>1);
    }
    return 0;
}

