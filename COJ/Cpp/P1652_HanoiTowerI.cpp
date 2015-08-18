/* 
 * File:   P1652_HanoiTowerI.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 5:49 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;

void towers(int n,int frompeg,int topeg,int auxpeg){ 
    if(n==1){
        printf("Move ring from stick %d to stick %d.\n",frompeg,topeg);
        return;
      }
    //Move top n-1 disks from A to B, using C as auxiliary
    towers(n-1,frompeg,auxpeg,topeg);
    //Move remaining disks from A to C
    printf("Move ring from stick %d to stick %d.\n",frompeg,topeg);
    //Move n-1 disks from B to C using A as auxiliary
    towers(n-1,auxpeg,topeg,frompeg);
}

main(){
    int n;
    while(scanf("%d",&n)!=EOF){
        towers(n,1,3,2);
        printf("You needs %ld moves.\n",(long int)pow(2,n)-1);
    }
    return 0;
}


