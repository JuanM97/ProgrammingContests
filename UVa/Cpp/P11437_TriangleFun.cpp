/* 
 * File:   P11437_TriangleFun.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 4:49 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

double ax,ay,bx,by,cx,cy,a;
int t;

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%lf %lf %lf %lf %lf %lf",&ax,&ay,&bx,&by,&cx,&cy);
        printf("%.lf\n",abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2)/7);
    }
    return 0;
}

