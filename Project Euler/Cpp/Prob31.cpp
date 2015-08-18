/* 
 * File:   Prob31.cpp
 * Author: JuanM
 *
 * Created on June 10, 2014, 9:39 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
//Max value of money
#define maxNum 7500
using namespace std;

int coins[]={1,2,5,10,20,50,100,200};
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
    for(int i=0;i<sizeof(coins)/sizeof(coins[0]);i++){
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
    printf("coins=200 -> #ways=%d\n",dp[200]);
    
    return 0;
}

