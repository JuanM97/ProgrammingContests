/* 
 * File:   P11130_BilliardBounces.cpp
 * Author: JuanM
 *
 * Created on June 3, 2014, 2:36 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define PI 3.141592653589793238462643383279502884
using namespace std;

double hw,vw,v,ang,t,a,dx,dy;
int bv,bh;

int main() {
    
    while(scanf("%lf %lf %lf %lf %lf",&hw,&vw,&v,&ang,&t)){
        if(hw==0&&vw==0&&v==0&&ang==0&&t==0)break;
        a=v/t;
        dx=v*cos(ang*PI/180)*t-0.5*a*cos(ang*PI/180)*t*t;
        dy=v*sin(ang*PI/180)*t-0.5*a*sin(ang*PI/180)*t*t;
        //printf("dds: %lf %lf\n",dx,dy);
        bh=0;bv=0;
        if(dx>=hw/2){
            dx-=(hw/2);
            bh++;
        }
        bh+=(int)(dx/hw);
        if(dy>=vw/2){
            dy-=(vw/2);
            bv++;
        }
        bv+=(int)(dy/vw);
        printf("%d %d\n",bh,bv);
    }
    
    return 0;
}

