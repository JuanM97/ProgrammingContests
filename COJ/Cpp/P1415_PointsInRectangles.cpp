/* 
 * File:   P1415_PointsInRectangles.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 9:54 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

struct rect{
    double xs,ys,xi,yi;
};

rect p[13];

int main() {
    char r[2];
    int m=0,pt;
    double x,y;
    bool f;
    while(1){
        scanf("%s",&r);
        if(strcmp(r,"*")==0)break;
        scanf("%lf %lf %lf %lf",&p[m].xs,&p[m].ys,&p[m].xi,&p[m].yi);
        //printf("All: %lf %lf %lf %lf\n",p[m].xi,p[m].yi,p[m].xs,p[m].ys);
        m++;
    }
    /*for(int mm=0;mm<m;mm++){
        printf("Rs: %lf %lf %lf %lf\n",p[mm].xi,p[mm].yi,p[mm].xs,p[mm].ys);
    }
    printf("M= %d",m);*/
    pt=0;
    while(1){
        pt++;
        scanf("%lf %lf",&x,&y);
        if(x==9999.9 && y==9999.9)break;
        f=false;
        for(int i=0;i<m;i++){
            if(x>p[i].xs && x<p[i].xi && y>p[i].yi && y<p[i].ys){
                printf("Point %d is contained in figure %d\n",pt,i+1);
                f=true;
            }
        }     
        if(!f){
            printf("Point %d is not contained in any figure\n",pt);
        }
    }
    return 0;
}

