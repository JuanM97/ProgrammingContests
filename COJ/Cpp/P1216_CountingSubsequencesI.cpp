/* 
 * File:   P1216_CountingSubsequencesI.cpp
 * Author: JuanManuel
 *
 * Created on 22 de octubre de 2014, 11:39
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 1001000
using namespace std;

int t,n,cnt;
int num[smx];

void printt(){
    for(int i=0;i<n;i++){
        printf("%d ",num[i]);
    }
}

int main() {    
    int j,k,sum,perf=47;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        for(int i=0;i<n;i++){
            scanf("%d",&num[i]);
        }
        j=0,k=0,sum=num[0];
        cnt=0;
        while(k<n){
            if(sum==47){
                //printf("igual %d %d\n",j,k);
                cnt++;
                sum+=num[++k];
            }else{
                if(sum<47){
                    sum+=num[++k];
                }else{
                    sum-=num[j++];
                }
            }
        }
        printf("%d\n",cnt);
        //printt();
    }
    return 0;
}

