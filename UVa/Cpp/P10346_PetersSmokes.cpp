/* 
 * File:   P10346_PetersSmokes.cpp
 * Author: JuanM
 *
 * Created on March 17, 2013, 1:07 AM
 */

#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstring>
#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    long int n,k,t;
    while(scanf("%ld %ld",&n,&k)!=EOF){
        //t=(n-1)/(k-1);        // -.-
        t=n;
        while(n>=k){
            t+=n/k;
            n=(n/k)+n%k;
        }
        printf("%ld\n",t);
    }
    return 0;
}

