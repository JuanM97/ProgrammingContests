/* 
 * File:   P573_TheSnail.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 9:21 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;


int h,d,day;
double f,u,hs,ds,dn;

int main() {
    while(scanf("%d %lf %d %lf",&h,&u,&d,&f)){
        if(h==0)break;
        hs=0;
        ds=u;
        dn=u*(f/100);
        day=1;
        while(1){
            if(ds<0){
                ds=0;
            }
            hs+=(ds);
            ds-=dn;
            if(hs>h){
                printf("success on day %d\n",day);
                break;
            }
            hs-=d;
            if(hs<0){
                printf("failure on day %d\n",day);
                break;
            }
            day++;
        }        
    }
    return 0;
}

