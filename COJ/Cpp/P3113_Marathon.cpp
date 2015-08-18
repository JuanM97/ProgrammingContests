/* 
 * File:   P3113_Marathon.cpp
 * Author: JuanManuel
 *
 * Created on 15 de abril de 2015, 10:53
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define mxN 100010
using namespace std;

int cX[mxN];
int cY[mxN];
int dist1[mxN];
int dist2[mxN];

int main() {
    int n,dM,dT,dc,dcmax;
    while(scanf("%d",&n)!=EOF){
        scanf("%d %d",&cX[0],&cY[0]);
        dist1[0]=0;
        dT=0;
        for(int i=1;i<n;i++){
            scanf("%d %d",&cX[i],&cY[i]);
            dist1[i]=abs(cX[i]-cX[i-1])+abs(cY[i]-cY[i-1]);
            dT+=dist1[i];
        }
        dM=0;dc=0;dcmax=-1;;
        for(int i=1;i<n-1;i++){
            //if(dist1[i]+dist1[i+1]>abs(cX[i+1]-cX[i-1])+abs(cY[i+1]-cY[i-1]){ //Esto siempre se cumple...
            dc = dist1[i]+dist1[i+1]-(abs(cX[i+1]-cX[i-1])+abs(cY[i+1]-cY[i-1]));
            //}
            //printf("%d ",dc);
            if(dcmax<dc)dcmax=dc;
        }
        printf("%d\n",dT-dcmax);
    }
    return 0;
}

