/* 
 * File:   P2342_ProblemWithCoins.cpp
 * Author: JuanM
 *
 * Created on July 3, 2013, 10:53 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
#include <climits>
using namespace std;

int a[10003];
int b[10003];
int dp[10003];

int sequence(int numbers[],int n){
        int maxsf =numbers[0], me=numbers[0];

        for(size_t i=1; i<n;i++){
                if(me<0){
                    me=numbers[i];
                }else{
                    me+=numbers[i];
                }
                
                if(me>=maxsf ){
                    maxsf =me;
                }
        }
        return maxsf ;
}

int main() {
    int t,n,smx1,smx2;
    char nm1[23];
    char nm2[23];
    scanf("%d",&t);
    while(t--){
        scanf("%d %s",&n,&nm1);
        for(int i=0;i<n;i++){
            scanf("%d",&a[i]);
        }
        scanf("%s",&nm2);
        for(int i=0;i<n;i++){
            scanf("%d",&b[i]);
        }
        smx1=sequence(a,n);
        smx2=sequence(b,n);
        
        if(smx1>smx2){
            printf("%s %d\n",nm1,smx1);
        }else{
            if(smx2>smx1){
                printf("%s %d\n",nm2,smx2);
            }else{
                printf("Tied %d\n",smx1);
            }
        }
    }
    return 0;
}

