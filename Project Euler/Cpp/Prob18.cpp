/* 
 * File:   Prob18.cpp
 * Author: JuanM
 *
 * Created on June 5, 2014, 8:31 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 16
using namespace std;

int nums[smx][smx];
int sum[smx][smx];

void printS(){
    for(int i=0;i<smx;i++){
        for(int j=0;j<i;j++){
            printf("%d ",sum[i][j]);
        }printf("\n");
    }printf("\n");
}

int main() {
    
    for(int i=0;i<smx;i++){
        for(int j=0;j<i;j++){
            scanf("%d",&nums[i][j]);
        }
    }
    
    sum[0][0]=nums[0][0];
    for(int i=1;i<smx;i++){
        for(int j=0;j<=i;j++){
            if(j==0||j==i-1){
                if(j==0)sum[i][j]=nums[i][j]+sum[i-1][j];
                else sum[i][j]=nums[i][j]+sum[i-1][j-1];
            }else{
                sum[i][j]=max(nums[i][j]+sum[i-1][j],nums[i][j]+sum[i-1][j-1]);
            }
        }
    }
    //printS();
    int mx=-1;
    for(int i=0;i<smx;i++){
        if(sum[smx-1][i]>mx)mx=sum[smx-1][i];
    }
    printf("%d\n",mx);
    return 0;
}

