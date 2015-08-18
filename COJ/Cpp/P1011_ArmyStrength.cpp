/* 
 * File:   P1011_ArmyStrength.cpp
 * Author: JuanM
 *
 * Created on March 26, 2013, 1:00 AM
 */

#include <cstdlib>
#include <algorithm>
#include <cstring>
#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main() {
    long int t,g,g2,a,mg,mg2,ng,ng2;
    
    scanf("%ld",&t);
    
    while(t--){
        scanf("%ld %ld",&g,&g2);
        mg=-2000;
        mg2=-2000;
        ng=-10;
        ng2=-10;
        for(int i=0;i<g;i++){
            scanf("%ld",&a);
            if(a>mg){
                mg=a;
                ng=1;
            }else{
                if(a==mg){
                    ng++;
                }
            }
        }
        for(int i=0;i<g2;i++){
            scanf("%ld",&a);
            if(a>mg2){
                mg2=a;
                ng2=1;
            }else{
                if(a==mg2){
                    ng2++;
                }
            }
        }
        if(mg>=mg2){
                printf("Godzilla\n");
            }else{
                printf("MechaGodzilla\n");
            }
    }
    
    return 0;
}

