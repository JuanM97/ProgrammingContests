/* 
 * File:   P2979_AnotherSortingProblem.cpp
 * Author: JuanManuel
 *
 * Created on 7 de octubre de 2014, 11:36
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define smx 43
using namespace std;

int main() {
    int t,n,cur,count;
    scanf("%d",&t);
    while(t--){
        count=0;
        scanf("%d",&n);
        for(int i=1;i<=n;i++){
            scanf("%d",&cur);
            if(cur==i)count++;
        }
        printf("%d\n",n-count);
    }
    return 0;
}

