/* 
 * File:   P3078_AnalogDial.cpp
 * Author: JuanM
 *
 * Created on November 29, 2014, 1:28 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 250010
using namespace std;

//TLE ):
int main() {
    int n,m,a,b;
    char inc[smx];
    //guarda suma
    int ini[smx];
    while(scanf("%d %d",&n,&m)!=EOF){
        scanf("%s",inc);
        ini[1]=inc[0]-'0';
        for(int i=2;i<=n;i++){
            ini[i]=(inc[i-1]-'0'+ini[i-1]);
        }
        while(m--){
            scanf("%d %d",&a,&b);
            printf("%d\n",ini[b]-ini[a-1]);
            for(int i=a,idx=1;i<=b;i++,idx++){
                ini[i]+=idx;
            }
        }
    }
    return 0;
}

