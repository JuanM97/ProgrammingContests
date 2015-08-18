/* 
 * File:   P661_BlowingFuses.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 10:16 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int n,m,c,maxp,curp,pc,caseN=1;
int dev[23][2];
bool brknF,isF=true;
int main() {
    while(scanf("%d %d %d",&n,&m,&c)){
        if(n==0&&m==0&&c==0)break;
        memset(dev,0,sizeof dev);
        for(int i=0;i<n;i++){
            scanf("%d",&dev[i][0]);
        }
        curp=0;
        maxp=-1;
        brknF=false;
        for(int i=0;i<m;i++){
            scanf("%d",&pc);
            if(!dev[pc-1][1]){
                dev[pc-1][1]=1;
                curp+=dev[pc-1][0];
            }else{
                dev[pc-1][1]=0;
                curp-=dev[pc-1][0];
            }
            if(curp>c)brknF=true;
            if(curp>maxp)maxp=curp;
        }
        /*if(!isF){
            printf("\n");
        }
        isF=false;*/
        printf("Sequence %d\n",caseN++);
        if(brknF){
            printf("Fuse was blown.\n");
        }else{
            printf("Fuse was not blown.\nMaximal power consumption was %d amperes.\n",maxp);
        }
        printf("\n");
        
    }
    return 0;
}

