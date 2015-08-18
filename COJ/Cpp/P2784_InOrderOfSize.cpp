/* 
 * File:   P2784_InOrderOfSize.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 5:04 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define llmax 10003
using namespace std;

void printt(int *arr,int a){
    for(int i=0;i<a;i++){
        printf("%d ",arr[i]);
    }printf("\n");
}

int main() {
    int hi[llmax];
    int n;
    while(scanf("%d",&n)!=EOF){
        for(int i=0;i<n;i++){
            scanf("%d",&hi[i]);
        }
        sort(hi,hi+n);
        printf("%d",hi[n-1]);
        for(int i=0;i<n-1;i++){
            printf(" %d",hi[i]);
        }printf("\n");
    }
    
    
    return 0;
}

