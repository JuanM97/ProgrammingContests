/* 
 * File:   P2091_CountingTask.cpp
 * Author: JuanM
 *
 * Created on May 12, 2013, 1:43 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <math.h>
#include <cstring>
using namespace std;
int dp[128];
char s[10005];
int t,cnt;

int main() {
    scanf("%d",&t);
    while(t--){
        memset(dp,0,sizeof(dp));
        cnt=0;
        scanf("%s",&s);
        for(int i=0;i<strlen(s);i++){
            if(dp[(int)s[i]]==0){
                dp[(int)s[i]]=1;
                cnt++;
            }
        }
        printf("%d\n",cnt);
    }
    return 0;
}

