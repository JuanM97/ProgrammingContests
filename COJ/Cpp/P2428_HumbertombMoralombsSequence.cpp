/* 
 * File:   P2428_HumbertombMoralombsSequence.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 1:11 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;

int main() {
    double n;
    while(scanf("%lf",&n)){
        if(n==0)break;
        printf("%d\n",(int)ceil(sqrt(n)));
    }
    return 0;
}

