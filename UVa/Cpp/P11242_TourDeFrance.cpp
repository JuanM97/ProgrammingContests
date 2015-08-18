/* 
 * File:   P11242_TourDeFrance.cpp
 * Author: JuanManuel
 *
 * Created on 27 de mayo de 2015, 19:33
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 110
#define smx2 10100
using namespace std;
int tf[smx],tr[smx];
double spr[smx2],ddiv[smx2];

int main() {
    int n,m,k,k2;
    double mmx;
    while(scanf("%d",&n)&&n){
        scanf("%d",&m);
        for(int i=0;i<n;i++){
            scanf("%d",&tf[i]);
        }
        for(int i=0;i<m;i++){
            scanf("%d",&tr[i]);
        }
        k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                spr[k++]=(double)tr[j]/tf[i];
            }
        }
        sort(spr,spr+k);
        mmx=-1;
        k2=0;
        for(int i=1;i<k;i++){
            //printf("%.3lf ",spr[i]);
            ddiv[k2++]=spr[i]/spr[i-1];
        }
        for(int i=0;i<k2;i++){
            if(mmx<ddiv[i])mmx=ddiv[i];
        }
        printf("%.2lf\n",mmx);
    }
    return 0;
}

