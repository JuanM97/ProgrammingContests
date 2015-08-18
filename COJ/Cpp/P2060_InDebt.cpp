/* 
 * File:   P2060_InDebt.cpp
 * Author: JuanM
 *
 * Created on May 12, 2013, 3:56 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;

int main() {
    int n,a,t,cnt;
    while(scanf("%d",&n)&&n!=-1){
        t=0;cnt=0;
        while(n--){
            scanf("%d",&a);
            t+=a;
            if(t%100==0)cnt++;
        }
        printf("%d\n",cnt);
    }
    return 0;
}

