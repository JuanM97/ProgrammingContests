/* 
 * File:   P2432_SimpleMedian.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 2:03 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#define smx 100003
using namespace std;

double nums[smx];

int main() {
    int n,mid;    
    while(scanf("%d",&n)){
        if(n==0)break;
        for(int i=0;i<n;i++){
            scanf("%lf",&nums[i]);
        }
        sort(nums,nums+n);
        mid=n&1?(n-1)/2:n/2;
        if(n&1){
            printf("%.1lf\n",nums[mid]);
        }else{
            printf("%.1lf\n",(nums[mid]+nums[mid-1])/2);
        }
    }
    return 0;
}

