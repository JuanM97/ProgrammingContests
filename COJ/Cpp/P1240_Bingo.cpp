/* 
 * File:   P1240_Bingo!.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 7:23 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <cstring>
#define maxS 97
using namespace std;

int nums[maxS];
bool mrkd[maxS];

void printM(){
    for(int i=0;i<maxS;i++){
        printf("%d ",mrkd[i]);
    }printf("\n");
}

int main() {
    int n,b;
    while(1){
        memset(mrkd,0,sizeof(mrkd));
        bool c;
        scanf("%d %d",&n,&b);
        if(n==0&&b==0)break;
        for(int i=0;i<b;i++){
            scanf("%d",&nums[i]);
        }
        mrkd[0]=1;
        for(int i=0;i<b;i++){
            for(int j=i+1;j<b;j++){
                mrkd[abs(nums[i]-nums[j])]=1;
            }
        }
        //printM();
        c=true;
        for(int i=0;i<=n;i++){
            if(mrkd[i]!=1){
                c=false;
                break;
            }
        }
        printf("%s\n",c?"Y":"N");
    }    
    return 0;
}

