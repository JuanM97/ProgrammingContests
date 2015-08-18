/* 
 * File:   P2633_MaxVolume.cpp
 * Author: JuanM
 *
 * Created on January 19, 2015, 11:16 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define PI 3.14159
using namespace std;

int n;
char fig[5];
double a,h,vv,vmax;

int main() {
    scanf("%d",&n);
    vmax=-1,vv=0;
    while(n--){
        scanf("%s",fig);
        if(strcmp(fig,"S")==0){
            scanf("%lf",&a);
            vv=4*PI*a*a*a/3;
        }else{
            scanf("%lf %lf",&a,&h);
            if(strcmp(fig,"C")==0){
                vv=PI*a*a*h;
            }else{
                vv=PI*a*a*h/3;
            }
        }
        if(vv>vmax)vmax=vv;
    }
    printf("%.3lf\n",vmax);
    return 0;
}

