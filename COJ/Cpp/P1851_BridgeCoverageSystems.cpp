/* 
 * File:   P1851_BridgeCoverageSystems.cpp
 * Author: JuanManuel
 *
 * Created on 20 de mayo de 2015, 21:43
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 100100
using namespace std;

int towers[smx];

int main() {
    int n,mx;
    while(scanf("%d",&n)!=EOF){
        mx=0;
        for(int i=0;i<n;i++){
            scanf("%d",&towers[i]);
            if(mx<towers[i])mx=towers[i];
        }
        for(int i=0;i<n;i++){
            printf("%d\n",mx-towers[i]);
        }
    }
    return 0;
}

