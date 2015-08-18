/* 
 * File:   P1126_TheCircumferenceOfTheCircle.cpp
 * Author: JuanM
 *
 * Created on June 26, 2013, 11:58 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#define pi 3.141592653589793
using namespace std;


//Incomplete
int main() {
    double x1,y1,x2,y2,x3,y3,xm1,ym1,xm2,ym2,m1,m2,mt1,mt2,b1,b2,xc,yc,r;
    while(scanf("%lf %lf %lf %lf %lf %lf",&x1,&y1,&x2,&y2,&x3,&y3)!=EOF){
        xm1=(x1+x2)/2;
        ym1=(y1+y2)/2;
        xm2=(x2+x3)/2;
        ym2=(y2+y3)/2;
        if(x2-x1!=0){
            m1=(y2-y1)/(x2-x1);
            //Check when m=0 -> mt=inf
            if(m1==0){
                
            }
            mt1=-1/m1;
        }else{
            mt1=0;
        }
        if(x2-x3!=0){
            m2=(y2-y3)/(x2-x3);
            mt2=-1/m2;
        }else{
            mt2=0;
        }
        
        b1=ym1-mt1*xm1;
        b2=ym2-mt2*xm2;
        
        xc=(b2-b1)/(mt2-mt1);
        yc=mt1*xc+b1;
        
        r=sqrt((y1-yc)*(y1-yc)+(x1-xc)*(x1-xc));
        printf("Ans:: %.2lf\n",2*pi*r);
    }
    return 0;
}

