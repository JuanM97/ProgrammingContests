/* 
 * File:   P3031_MixedFractions.cpp
 * Author: JuanManuel
 *
 * Created on 3 de febrero de 2015, 17:40
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    long int n,d;
    while(scanf("%ld %ld",&n,&d)!=EOF&&n>0&&d>0){
        printf("%ld %ld / %ld\n",n/d,n%d,d);
    }
    return 0;
}

