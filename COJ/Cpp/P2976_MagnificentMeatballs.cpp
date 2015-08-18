/* 
 * File:   P2976_MagnificentMeatballs.cpp
 * Author: JuanManuel
 *
 * Created on 30 de abril de 2015, 14:20
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int n,g,s,idx;
    int nums[37];
    while(scanf("%d",&n)!=EOF && n){
        s=0;g=0;idx=0;
        for(int i=0;i<n;i++){
            scanf("%d",&nums[i]);
            s+=nums[i];
        }
        if(s&1){
            printf("No equal partitioning.\n");
        }else{
            g=(s>>1);s=0;
            for(int i=0;i<n;i++){
                idx=i;
                s+=nums[i];
                if(s>=g)break;
            }
            idx++;
            if(s==g){
                printf("Sam stops at position %d and Ella stops at position %d.\n",idx,idx+1);
            }else{
                printf("No equal partitioning.\n");
            }
        }
        
    }
    return 0;
}

