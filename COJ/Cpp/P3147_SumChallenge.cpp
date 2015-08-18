
#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 70
#define smxG 100100
using namespace std;

//No sale

int t,n,goal,offset;
int nums[smx],dp[smxG];

int main() {
    offset = 0;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        for(int i=0;i<n;i++) scanf("%d",&nums[i]);
        
        for(int i=0;i<n;i++) nums[i]+=offset;
        
        //Subset sum
        goal = offset;
        int d;
        for(d=1;d<=n;d++){
            memset(dp,0,sizeof(dp));
            dp[0]=1;
            for(int i=0; i<n; i++){
                for(int j=goal*d; j>=nums[i]; j--)
                    dp[j] += dp[j-nums[i]];
            }
            for(int j=0; j<d*goal; j++)
                    printf("%d ",dp[j]);
            printf("\n");
            if(dp[d*goal]) printf("%d ",d);
            if(dp[d*goal]==d) break;
        }
        
        printf("%s\n",dp[d*goal]?"YES":"NO");
    }
    return 0;
}


