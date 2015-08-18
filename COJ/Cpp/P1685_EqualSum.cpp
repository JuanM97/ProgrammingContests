/* 
 * File:   P1685_EqualSum.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 2:02 PM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <vector>
#define maxs 1000000+7
using namespace std;

int nums[maxs];
vector<int>v;

int main() {
    int n,q,ct,c;
    while(scanf("%d",&n)!=EOF){
        v.clear();
        c=0;
        for(int i=0;i<n;i++){
            scanf("%d",&c);
            v.push_back(c);
            nums[c]=1;
        }
        scanf("%d",&q);
        ct=0;
        for(int i=0;i<v.size();i++){
            if(q-v[i]<maxs-3 && q-v[i]>0 && nums[q-v[i]]){
                ct++;
            }
        }
        printf("%d\n",ct&1?(ct-1)/2:ct/2);
        for(int i=0;i<v.size();i++){
            nums[v[i]]=0;
        }
    }
    return 0;
}

