/* 
 * File:   P1076_BiasedStanding.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 4:22 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
using namespace std;

int nums[10007];

void printN(int b){
    printf("\n");
    for(int i=0;i<b;i++){
        printf("%d ",nums[i]);
    }printf("\n");
}

int main() {
    int t,n,p;
    char team[23];
    scanf("%d",&t);
    while(t--){
        memset(nums,0,sizeof(nums));
        scanf("%d",&n);
        p=0;
        for(int i=0;i<n;i++){
            scanf("%s %d",&team,&nums[i]);
        }
        sort(nums,nums+n);
        //printN(n);
        for(int i=1;i<=n;i++){
            p+=abs(i-nums[i-1]);
        }
        printf("%d\n",p);
    }
    return 0;
}

