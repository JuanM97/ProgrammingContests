/* 
 * File:   P3103_Darts.cpp
 * Author: JuanManuel
 *
 * Created on 3 de febrero de 2015, 1:27
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smx 11
using namespace std;

int pts[smx];

void fillPts(){
    for(int i=0,j=20;i<smx;i++,j+=20){
        pts[i]=j*j;
    }
}

int main() {
    fillPts();
    //for(int i=0;i<smx;i++)printf("%d ",pts[i]);
    int t,n,ps,pT,idx;
    double x,y,r;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        ps=0;pT=0;
        while(n--){
            scanf("%lf %lf",&x,&y);
            r=x*x+y*y;
            ps=10;
            idx=0;
            while(ps>0&&r>pts[idx++]){
                ps--;
            }
            //printf("%d ",ps);
            pT+=ps;
        }
        printf("%d\n",pT);
    }
    
    return 0;
}

