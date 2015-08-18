/* 
 * File:   P3095_FibonacciBrain.cpp
 * Author: JuanManuel
 *
 * Created on 3 de febrero de 2015, 1:49
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;

int fibM10[]={0,1,1,2,3,5,8,3,1,4,5,9,4,3,7,0,7,7,4,1,5,6,1,7,8,5,3,8,1,9,0,9,9,8,7,5,2,7,9,6,5,1,6,7,3,0,3,3,6,9,5,4,9,3,2,5,7,2,9,1};

int main() {
    long long int n;
    //printf("%d ",sizeof(fibM10)/sizeof(int));
    while(scanf("%lld",&n)!=EOF){
        printf("%d\n",fibM10[n%60]);
    }
    return 0;
}

