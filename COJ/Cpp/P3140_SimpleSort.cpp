/* 
 * File:   P3140_SimpleSort.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 2:15 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#define smx 1000100
using namespace std;

long long int nums[smx];

int main() {
    int n;
    while(scanf("%d",&n)!=EOF){
        for(int i=0;i<n;i++){
            scanf("%lld",&nums[i]);
        }
        sort(nums,nums+n);
        for(int i=0;i<n;i++){
            printf("%lld\n",nums[i]);
        }
    }
    return 0;
}

