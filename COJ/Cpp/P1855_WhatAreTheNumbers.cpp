/* 
 * File:   P1855_WhatAreTheNumbers.cpp
 * Author: JuanM
 *
 * Created on June 6, 2013, 11:32 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <vector>
using namespace std;

bool nums[310000000];
vector<long int> ns;

int main() {
    int t,n,idx;
    bool found;
    scanf("%d",&t);
    
    while(t--){
        scanf("%d",&n);
        found=false;
        ns.clear();
        while(n--){
            scanf("%d",&idx);
            if(nums[idx]){
                found=true;
                printf("%d\n",idx);
            }else{
                nums[idx]=1;
                ns.push_back(idx);
            }
        }
        if(!found){
            printf("Not found!\n");
        }
        for(int i=0;i<ns.size();i++){
            nums[ns[i]]=0;
        }
    }
    return 0;
}

