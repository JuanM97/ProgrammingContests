/* 
 * File:   P1378_PhilosophersStone.cpp
 * Author: JuanM
 *
 * Created on July 14, 2013, 2:21 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#define smx 107
using namespace std;

int rm[107][107];
int sum[107][107];
int t,a,b,maxn;
int main() {
    scanf("%d",&t);
    while(t--){
        for(int i=0;i<smx;i++){
            for(int j=0;j<smx;j++){
                rm[i][j]=0;
                sum[i][j]=0;
            }
        }
        scanf("%d %d",&a,&b);
        for(int i=0;i<a;i++){
            for(int j=1;j<=b;j++){
                scanf("%d",&rm[i][j]);
            }
        }
        /*
        printf("\n");
        for(int i=0;i<a;i++){
            for(int j=1;j<=b;j++){
                printf("%d ",rm[i][j]);
            }printf("\n");
        }
        printf("\n");*/
        
        for(int i=1;i<=b;i++){
            sum[0][i]=rm[0][i];
        }
        
        for(int i=1;i<a;i++){
            for(int j=1;j<=b;j++){
                if(sum[i-1][j-1]+rm[i][j]>sum[i][j]){
                    sum[i][j]=sum[i-1][j-1]+rm[i][j];
                }
                if(sum[i-1][j]+rm[i][j]>sum[i][j]){
                    sum[i][j]=sum[i-1][j]+rm[i][j];
                }
                if(sum[i-1][j+1]+rm[i][j]>sum[i][j]){
                    sum[i][j]=sum[i-1][j+1]+rm[i][j];
                }
            }
        }
        /*
        printf("\n");
        for(int i=0;i<a;i++){
            for(int j=1;j<=b;j++){
                printf("%d ",sum[i][j]);
            }printf("\n");
        }
        printf("\n");
        */
        maxn=-1;
        for(int i=1;i<=b;i++){
            if(sum[a-1][i]>maxn)maxn=sum[a-1][i];
        }
        printf("%d\n",maxn);
    }
    return 0;
}

