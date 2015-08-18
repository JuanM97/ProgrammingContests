/* 
 * File:   P3077_LukaIsParking.cpp
 * Author: JuanM
 *
 * Created on November 28, 2014, 2:41 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 110
using namespace std;

int main() {
    int a,b,c,r1,r2,c1,c2,c3;
    int pk[smx];
    while(scanf("%d %d %d",&a,&b,&c)!=EOF){
        memset(pk,0,sizeof(pk));
        c1=0,c2=0,c3=0;
        for(int i=0;i<3;i++){
            scanf("%d %d",&r1,&r2);
            for(int i=r1;i<r2;i++){
                pk[i]++;
            }
        }
        for(int i=0;i<smx;i++){
            if(pk[i]==1)c1++;
            else if(pk[i]==2)c2++;
            else if(pk[i]==3)c3++;
        }
        printf("%d\n",c1*a+2*c2*b+3*c3*c);
    }
    return 0;
}

