/* 
 * File:   P3067_SortingAndSearchingI.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 3:28 AM
 */


#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#include <set>
#define nmax 1100
using namespace std;
int nums[nmax];
int main() {
    int n,q1,q2,q;
    set<int>isIn;
    while(scanf("%d",&n)!=EOF){
        isIn.clear();
        for(int i=0;i<n;i++){
            scanf("%d",&nums[i]);
            isIn.insert(nums[i]);
        }
        scanf("%d %d",&q1,&q2);
        for(int i=0;i<q1;i++){
            scanf("%d",&q);
            printf("%s\n",isIn.find(q)!=isIn.end()?":)":":(");
        }
        sort(nums,nums+n);
        for(int i=0;i<q2;i++){
            scanf("%d",&q);
            printf("%d\n",nums[q-1]);
        }
    }
    return 0;
}


