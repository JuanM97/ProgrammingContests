/* 
 * File:   P12356_ArmyBuddies.cpp
 * Author: JuanM
 *
 * Created on July 25, 2013, 2:18 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int s,kd,l,r,ll,rr;
int sds[100010][2];

int main() {
    while(scanf("%d %d",&s,&kd)>0&&s>0&&kd>0){
        for(int i=1;i<=s;i++){
            sds[i][0]=i-1;
            sds[i][1]=i+1;
        }
        sds[s][1]=0;
        while(kd--){
            scanf("%d %d",&l,&r);
            sds[l][0]!=0?printf("%d ",sds[l][0]):printf("* ");
            sds[r][1]!=0?printf("%d\n",sds[r][1]):printf("*\n");
            sds[sds[l][0]][1]=sds[r][1];
            sds[sds[r][1]][0]=sds[l][0];
        }printf("-\n");
    }
    return 0;
}

