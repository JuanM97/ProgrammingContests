/* 
 * File:   P1280_WalkLikeAnEgyptian.cpp
 * Author: JuanM
 *
 * Created on May 4, 2013, 12:49 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;


int main() {
    long int n;
    while(scanf("%ld",&n)&&n!=0){
        printf("%ld => %ld\n",n,n*n-n+1);
    }
    return 0;
}

