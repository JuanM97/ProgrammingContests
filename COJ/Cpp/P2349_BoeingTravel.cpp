/* 
 * File:   P2349_BoeingTravel.cpp
 * Author: JuanManuel
 *
 * Created on 20 de mayo de 2015, 19:40
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int t,a,N,ret;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&a,&N);
        ret=(a+N*(N-1)/2)%N;
        printf("%d\n",(ret==0?N:ret));
    }
    return 0;
}

