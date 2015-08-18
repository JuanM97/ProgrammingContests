/* 
 * File:   P1457_BaseballTournament.cpp
 * Author: JuanM
 *
 * Created on May 4, 2013, 12:23 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;

int main() {
    long long int teams,games;
    while(scanf("%lld",&teams)!=EOF){
        scanf("%lld",&games);
        printf("%lld\n",((teams-1)*(teams))/2*games);
    }
    return 0;
}

