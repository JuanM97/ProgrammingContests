/* 
 * File:   P2415_FindTheeddingCakeVolume.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 12:30 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#define pi acos(-1)
using namespace std;

int main() {
    int t,n,r,h;
    double v;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        v=0;
        while(n--){
            scanf("%d %d",&r,&h);
            v+=(pi*r*r*h);
        }
        printf("%.2lf\n",v);
    }
    return 0;
}

