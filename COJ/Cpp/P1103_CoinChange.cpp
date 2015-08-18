/* 
 * File:   P1103_CoinChange.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 2:50 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define maxNum 7500
using namespace std;

int coins[]={1,5,10,25,50};
int dp[maxNum];

void printt(int a){
    printf("\n");
    for(int i=0;i<a;i++){
        printf("%d ",dp[i]);
    }printf("\n");
}

void BUdp(){
    memset(dp,0,sizeof(dp));
    dp[0]=1;
    for(int i=0;i<5;i++){
        for(int j=coins[i];j<maxNum;j++){
            dp[j]+=dp[j-coins[i]];
        }
    }
}
/*
int TBdp(int n,int m){
  int cnt = 0;
  if (n==0) return 1;
  if (dp[n][m]!=-1) return dp[n][m];
  for (int i=0;i<=m;i++)
    if(coins[i]<=n) cnt+=TBdp(n-coins[i],i);
  return dp[n][m]=cnt;
}
*/

int main() {
    int n;
    BUdp();
    while(scanf("%d",&n)!=EOF){
        printf("%d\n",dp[n]);
    }
    
    return 0;
}

