/* 
 * File:   P1357_BeingLate.cpp
 * Author: JuanM
 *
 * Created on June 27, 2013, 1:43 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;


int main() {
    int t,oh,om,ah,am,ct;
    while(scanf("%d",&t)!=EOF){
        ct=0;
        for(int i=0;i<t;i++){
            scanf("%d %d %d %d",&oh,&om,&ah,&am);
            if(ah>oh){
                am+=60;
                om=am-om;
            }else{
                if(am>om){
                    om=am-om;
                }else{
                    om=0;
                }
            }
            //printf("mins: %d\n",om);
            ct+=om;
        }
        printf("%d\n",(ct/t));
    }
    return 0;
}

