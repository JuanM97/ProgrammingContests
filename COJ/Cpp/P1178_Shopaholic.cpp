/* 
 * File:   P1178_Shopaholic.cpp
 * Author: JuanM
 *
 * Created on June 27, 2013, 2:45 AM
 */

#include <cstdlib>
#include <cstdio>
#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;

int items[20010];

void printI(int n){
    for(int i=0;i<n;i++){
        printf("%d ",items[i]);
    }printf("\n");
}

int main() {
    int t,n,d;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        for(int i=0;i<n;i++){
            scanf("%d",&items[i]);
        }
        sort(items,items+n,greater<int>());
        //printI(n);
        d=0;
        for(int i=0;i<n;i++){
            if(i%3==2){
                d+=items[i];
            }
        }
        printf("%d\n",d);
    }
    return 0;
}

