/* 
 * File:   P2153_PlayingWithTriangles.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 12:00 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;

bool isC(int p0x,int p0y,int p1x,int p1y,int px,int py){
    return sqrt((px-p0x)*(px-p0x)+(py-p0y)*(py-p0y))+sqrt((px-p1x)*(px-p1x)+(py-p1y)*(py-p1y))==sqrt((p0x-p1x)*(p0x-p1x)+(p0y-p1y)*(p0y-p1y));
}

int main() {
    int p0x,p0y,p1x,p1y,p2x,p2y,px,py;
    double A,s,t;
    while(scanf("%d %d %d %d %d %d %d %d",&p0x,&p0y,&p1x,&p1y,&p2x,&p2y,&px,&py)!=EOF){
        A = (-p1y*p2x + p0y*(-p1x + p2x) + p0x*(p1y - p2y) + p1x*p2y)/2.;
        A=abs(A);
        s = 1/(2*A)*(p0y*p2x - p0x*p2y + (p2y - p0y)*px + (p0x - p2x)*py);
        t = 1/(2*A)*(p0x*p1y - p0y*p1x + (p0y - p1y)*px + (p1x - p0x)*py);
        //printf("AMS: %lf %lf %lf\n",A,s,t);
        if(isC(p0x,p0y,p1x,p1y,px,py)||isC(p0x,p0y,p2x,p2y,px,py)||isC(p2x,p2y,p1x,p1y,px,py)){
            printf("1\n");
        }else{
            if(abs(s)>=0&&abs(t)>=0&&abs(1-s-t)>=0){
                printf("1\n");
            }else{
                printf("0\n");
            }
        }
    }
    return 0;
}

