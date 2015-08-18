/* 
 * File:   P1842_DistanceOfManhattan.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 1:13 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;

int main() {
    long int t,x1,y1,x2,y2;
    scanf("%ld",&t);
    while(t--){
        scanf("%ld %ld %ld %ld",&x1,&y1,&x2,&y2);
        printf("%ld\n",abs(x2-x1)+abs(y2-y1));
    }
    return 0;
}

