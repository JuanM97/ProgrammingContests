/* 
 * File:   P1631_TripleFatLadies.cpp
 * Author: JuanM
 *
 * Created on July 1, 2013, 12:36 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;

int main() {
    int t;
    unsigned long long int n;
    scanf("%d",&t);
    while(t--){
        scanf("%llu",&n);
        printf("%llu\n",(n-1)*250+192);
    }
    return 0;
}

