/* 
 * File:   P108_MaximumSum.cpp
 * Author: JuanM
 *
 * Created on May 27, 2014, 10:11 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define lls 103
using namespace std;
/*
 Suma desde ar[0][0], calcular en O(n^4) la mayor suma ...
 Checar Kadane's Algorithm para solución en O(n^3)
 
 */
int main() {
    int ar[lls][lls];
    int sar[lls][lls];
    int smax,n,act;
    while(scanf("%d",&n)!=EOF){
        memset(ar,0,sizeof(ar[0][0])*lls*lls);
        memset(sar,0,sizeof(sar[0][0])*lls*lls);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                scanf("%d",&ar[i][j]);
                sar[i][j]=ar[i][j];
                if(i>0)sar[i][j]+=sar[i-1][j];
                if(j>0)sar[i][j]+=sar[i][j-1];
                if(i>0&&j>0)sar[i][j]-=sar[i-1][j-1];
            }
        }
        smax=INT_MIN,act=0;
        /*
        printf("ddd\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                printf("%d ",sar[i][j]);
            }printf("\n");
        }printf("\n");
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=i;k<n;k++){
                    for(int l=j;l<n;l++){
                        act=sar[k][l];
                        if(i>0)act-=sar[i-1][l];
                        if(j>0)act-=sar[k][j-1];
                        if(i>0&&j>0)act+=sar[i-1][j-1];
                        smax=max(act,smax);
                    }
                }
            }
        }
        printf("%d\n",smax);
    }
    return 0;
}

