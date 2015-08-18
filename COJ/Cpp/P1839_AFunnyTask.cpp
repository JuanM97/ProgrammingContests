/* 
 * File:   P1839_AFunnyTask.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 1:09 AM
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <math.h>
using namespace std;

int main() {
    long long int t,a;
    scanf("%lld",&t);
    while(t--){
        scanf("%lld",&a);
        printf("%lld\n",2*((2*((2*(a+3))+3))+3));
    }
    return 0;
}

