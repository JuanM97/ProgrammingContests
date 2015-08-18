/* 
 * File:   P3115_SquareToys.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 2:55 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#define smx 1010
using namespace std;
int piles[smx];
int main() {
    int t,n,a,b,mx,emp;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        mx=-1;
        for(int i=0;i<n;i++){
            scanf("%d %d",&a,&b);
            piles[i]=a+b;
            if(mx<piles[i])mx=piles[i];
        }
        emp=0;
        for(int i=0;i<n;i++){
            emp+=(mx-piles[i]);
        }
        printf("%d\n",emp);
    }
    return 0;
}

