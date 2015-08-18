/* 
 * File:   P1079_SumsInATriangleI.cpp
 * Author: JuanM
 *
 * Created on June 2, 2013, 10:49 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

int t,n;
long int nums[101][101];
long int sum[101][101];
long int maxSum;

void printSum(){
    int i=1;
    for(int ix=0;ix<n;ix++){
        for(int j=0;j<i;j++){
            printf("%ld ",sum[ix][j]);
        }i++;printf("\n");
    }
}

void printNums(){
    int i=1;
    for(int ix=0;ix<n;ix++){
        for(int j=0;j<i;j++){
            printf("%ld ",nums[ix][j]);
        }i++;printf("\n");
    }
}

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        maxSum=0;
        int i=1;
        memset(nums,0,sizeof(nums));
        memset(sum,0,sizeof(sum));
        for(int ix=0;ix<n;ix++){
            for(int jx=0;jx<i;jx++){
                scanf("%ld",&nums[ix][jx]);
            }i++;
        }i=2;
        sum[0][0]=nums[0][0];
        for(int ix=1;ix<n;ix++){
            for(int jx=0;jx<i;jx++){
                if(sum[ix-1][jx]+nums[ix][jx]>sum[ix][jx]){
                    sum[ix][jx]=sum[ix-1][jx]+nums[ix][jx];
                }
                if(sum[ix-1][jx]+nums[ix][jx+1]>sum[ix][jx+1]){
                    sum[ix][jx+1]=sum[ix-1][jx]+nums[ix][jx+1];
                }
            }i++;
        }
        //printSum();
        
        for(int i=0;i<n;i++){
            if(sum[n-1][i]>maxSum){
                maxSum=sum[n-1][i];
            }
        }
        printf("%ld\n",maxSum);
    }
    return 0;
}

