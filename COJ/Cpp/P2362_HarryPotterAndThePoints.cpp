/* 
 * File:   P2362_HarryPotterAndThePoints.cpp
 * Author: JuanM
 *
 * Created on January 11, 2014, 2:20 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;

int main() {
    int t;
    long long int n;
    scanf("%d",&t);
    while(t--){
        scanf("%lld",&n);
        printf("%lld\n",2*n*(n-1)+1);
    }
    return 0;
}

