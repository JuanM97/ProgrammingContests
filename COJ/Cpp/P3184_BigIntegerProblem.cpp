/* 
 * File:   P3184_BigIntegerProblem.cpp
 * Author: JuanManuel
 *
 * Created on 15 de mayo de 2015, 17:14
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    long long int k,d;
    while(scanf("%lld %lld",&k,&d)!=EOF){
        printf("%lld\n",(long long int)ceil((d-1)/log10(k)));
    }
    return 0;
}

