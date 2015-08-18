/* 
 * File:   P1777_MakingPermutations.cpp
 * Author: JuanManuel
 *
 * Created on 4 de febrero de 2015, 3:02
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smx 10010
using namespace std;

int nums[smx];

int main() {
    int n,chn,tmp;
    while(scanf("%d",&n)!=EOF){
        memset(nums,0,sizeof(nums));
        for(int i=1;i<=n;i++){
            scanf("%d",&tmp);
            nums[tmp]=1;
        }
        chn=0;
        for(int i=1;i<=n;i++){
            if(nums[i]!=1)chn++;
        }
        printf("%d\n",chn);
    }
    return 0;
}

