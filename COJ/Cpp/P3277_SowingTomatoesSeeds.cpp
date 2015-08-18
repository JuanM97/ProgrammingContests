/* 
 * File:   P3277_SowingTomatoesSeeds.cpp
 * Author: JuanManuel
 *
 * Created on 15 de mayo de 2015, 16:55
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 1000100
using namespace std;
int tom[smx];
int main() {
    int n,d;
    bool ed;
    while(scanf("%d",&n)!=EOF){
        for(int i=0;i<n;i++){
            scanf("%d",&tom[i]);
        }
        if(n==1){
            printf("YES\n");
        }else{
            sort(tom,tom+n);
            d=tom[1]-tom[0];
            ed=true;
            for(int i=2;i<n;i++){
                if((tom[i]-tom[i-1])!=d){
                    ed=false;
                    break;
                }
            }
            printf("%s\n",ed?"YES":"NO");
        }
        
    }
    return 0;
}

