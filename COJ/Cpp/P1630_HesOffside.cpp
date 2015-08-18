/* 
 * File:   P1630_HesOffsde.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 4:26 PM
 */

#include <cstdlib>
#include <cstdio>
#include <limits.h>
#include <algorithm>
using namespace std;


int main() {
    int a,d,at,d1,d2,ca,cd;
    while(1){
        scanf("%d %d",&a,&d);
        if(a==0&&d==0)break;
        at=INT_MAX;
        d1=INT_MAX;
        d2=INT_MAX;
        while(a--){
            scanf("%d",&ca);
            if(ca<at)
                at=ca;
        }
        scanf("%d",&d1);
        d-=1;
        while(d--){
            scanf("%d",&cd);
            if(cd<d1){
                d1=cd;
            }else{
                if(cd<d2)
                    d2=cd;
            }
        }
        //printf("Mins: %d %d %d\n",at,d1,d2);
        if((at==d1&&at==d2)||at==max(d1,d2)){
            printf("N\n");
        }else{
            if(at<max(d1,d2)){
                printf("Y\n");
            }else{
                printf("N\n");
            }
        }
    }
    return 0;
}

