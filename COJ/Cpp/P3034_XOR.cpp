/* 
 * File:   P1658_LongestIncreasingSubsequence.cpp
 * Author: JuanM
 *
 * Created on June 27, 2013, 3:01 AM
 */

#include <cstdlib>
#include <cmath>
#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <vector>
//No subir más el smx
#define smx 10000100
using namespace std;
/*
int xors[smx];

void preCalc(){
    xors[0]=0;
    for(int i=1;i<smx;i++){
        xors[i]=(xors[i-1]^i);
    }
}
*/
int main(){
    /*
    preCalc();
    for(int i=0;i<50;i++){
        printf("%d: %d ..",i,xors[i]);
    }
    */
    int t,a,b,k,ca,cb,x;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&a,&b);
        --a;
        k=a>>2;
        /*switch(a&3){
            case 0:
                ca=k<<2;
                break;
            case 1:
                ca=1;
                break;
            case 2:
                ca=(k<<2)+3;
                break;
            case 3:
                ca=0;
                break;
        }*/
        x=a&3;
        /*if(x==0){ca=k<<2;
        }else{
            if(x==1){ca=1;
            }else{
                if(x==2){ca=(k<<2)+3;
                }else{ca=0;}
            }
        }*/
        ca=((x==0)?(k<<2):(x==1)?1:(x==2)?((k<<2)+3):0);
        k=b>>2;
        /*switch(b&3){
            case 0:
                cb=k<<2;
                break;
            case 1:
                cb=1;
                break;
            case 2:
                cb=(k<<2)+3;
                break;
            case 3:
                cb=0;
                break;
        }*/
        x=b&3;
        cb=((x==0)?(k<<2):(x==1)?1:(x==2)?((k<<2)+3):0);
        //printf("%d ",xors[b]^xors[a]);
        printf("%d\n",cb^ca);
    }
    return 0;
}

