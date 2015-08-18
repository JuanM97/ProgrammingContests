/* 
 * File:   P3013_EiropeanBus.cpp
 * Author: JuanManuel
 *
 * Created on 8 de octubre de 2014, 11:12
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

int main() {
    int t;
    long long int n;
    scanf("%d",&t);
    while(t--){
        scanf("%lld",&n);
        printf("%lld\n",(1L<<n)-1);
    }
    return 0;
}

