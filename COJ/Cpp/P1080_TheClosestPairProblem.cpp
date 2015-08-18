/* 
 * File:   P1080_TheClosestPairProblem.cpp
 * Author: JuanM
 *
 * Created on January 22, 2015, 11:23 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define maxn 10010
using namespace std;


int main() {
    int t;
    double cp[maxn][2];
    double dm=0,dt=0;
    while(scanf("%d",&t)&&t){
        for(int i=0;i<t;i++){
            scanf("%lf",&cp[i][0]);
            scanf("%lf",&cp[i][1]);
        }
        dm=10000,dt=10000;
        for(int i=0;i<t;i++){
            for(int j=i+1;j<t;j++){
                dt=sqrt((cp[j][0]-cp[i][0])*(cp[j][0]-cp[i][0])+(cp[j][1]-cp[i][1])*(cp[j][1]-cp[i][1]));
                dm=(dt<dm?dt:dm);
            }
        }
        if(dm<10000)
            printf("%.4lf\n",dm);
        else
            printf("INFINITY\n");
        
    }
    
    return 0;
}
