/* 
 * File:   Prob26.cpp
 * Author: JuanM
 *
 * Created on June 10, 2014, 6:31 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;

bool res[1003]={false};

int findCycle(int a){
    memset(res,0,sizeof(res));
    int num=1,initR=1,antR=1,c=0;
    do{
        res[num]=true;
        antR=num;
        num=(antR*10)%a;
        c++;
    }while(num!=0&&!res[num]);
    return num==0?0:c;
}

int maxCy=0,maxNum=0,cy=0;

int main() {
    printf("init:\n");
    for(int i=2;i<=1000;i++){
        cy=findCycle(i);
        //printf("%d: %d\n",i,cy);
        if(cy>maxCy){
            maxCy=cy;
            maxNum=i;
        }
    }
    printf("num: %d cycle: %d\n",maxNum,maxCy);
    return 0;
}

