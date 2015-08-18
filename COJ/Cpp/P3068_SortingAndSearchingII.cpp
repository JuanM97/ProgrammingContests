/* 
 * File:   P3068_SortingAndSearchingII.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 3:05 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#define nmax 500100
using namespace std;
bool isIn[nmax];
int nums[nmax];
int main() {
    int n,q1,q2,q;
    while(scanf("%d",&n)!=EOF){
        memset(isIn,0,sizeof(isIn));
        for(int i=0;i<n;i++){
            scanf("%d",&nums[i]);
            isIn[nums[i]]=true;
        }
        scanf("%d %d",&q1,&q2);
        for(int i=0;i<q1;i++){
            scanf("%d",&q);
            printf("%s\n",isIn[q]?":)":":(");
        }
        sort(nums,nums+n);
        for(int i=0;i<q2;i++){
            scanf("%d",&q);
            printf("%d\n",nums[q-1]);
        }
    }
    return 0;
}

