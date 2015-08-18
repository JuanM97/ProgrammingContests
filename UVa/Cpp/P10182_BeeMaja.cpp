/* 
 * File:   P10182_BeeMaja.cpp
 * Author: JuanM
 *
 * Created on June 4, 2014, 9:32 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 100010
using namespace std;

int n;
int x[smx];
int y[smx];

void preCalc(){
    //|mx| es max valor a llegar y tmax es máximo num de repeticiones en el max
    int mx=1,tmax=2,val=0;
    x[0]=0;
    for(int i=1;i<smx;i++){
        for(int j=0;val>-mx;j++,i++){
            x[i]=val;
            val--;
        }
        for(int j=0;j<tmax;j++,i++){
            x[i]=val;
        }
        val++;
        for(int j=0;val<mx;j++,i++){
            x[i]=val;
            val++;
        }
        for(int j=0;j<tmax;j++,i++){
            x[i]=val;
        }
        for(int j=0;val>=1;j++,i++){
            x[i]=val;
            val--;
        }
        tmax++;
        mx++;
        val=0;
        i--;
    }
    
    mx=1,tmax=2,val=mx;
    y[0]=0;
    for(int i=1;i<smx;i++){
        for(int j=0;j<tmax;j++,i++){
            y[i]=val;
        }
        val--;
        for(int j=0;val>-mx;j++,i++){
            y[i]=val;
            val--;
        }
        for(int j=0;j<tmax;j++,i++){
            y[i]=val;
        }
        for(int j=0;val<mx;j++,i++){
            y[i]=val+1;
            val++;
        }
        tmax++;
        mx++;
        val=mx;
        i--;
    }
}

int dx[6] = {-1, -1, 0, 1, 1, 0};
int dy[6] = {1, 0, -1, -1, 0, 1};
int xx,yy;
int getNs(int a){
    int n,s,z=a;
    n = (int)ceil( (-3 + sqrt(12 * z - 3)) / 6 );
    xx = n - (n > 0);
    yy = n > 0;
    z -= 3 * (n - 1) * n + 1 + (n > 0);
    for(int i = 0; z && i < 6; ++i){
            s= min(n - (i == 0), z);
            z -= s;
            xx += dx[i] * s;
            yy += dy[i] * s;
    }
}

int main() {
    preCalc();
    while(scanf("%d",&n)){
        printf("%d %d\n",x[n-1],y[n-1]);
    }
    return 0;
}

