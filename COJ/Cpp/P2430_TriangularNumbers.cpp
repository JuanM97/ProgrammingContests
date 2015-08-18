/* 
 * File:   P2430_TriangularNumbers.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 11:43 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;

//Problem with precision. AC solution in python :)

int main() {
    unsigned long long int k,r;
    while(scanf("%llu",&k)){
        if(k==0)break;
        r=(unsigned long long int)((sqrt(1+8*k))-1)/2;
        //printf("%llu",k*8+1);
        if((r*(r+1)>>1)==k){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}

