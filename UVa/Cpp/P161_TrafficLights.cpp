/* 
 * File:   P161_TrafficLights.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 2:08 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int ls[107];
int n,nmx,hh,mm,ss;

bool isGreen(int t,int n){
    return (t%(2*n))<(n-5);
}

void formatH(int t){
    hh=0;mm=0;ss=0;
    if(t<60){
        ss=t;
    }else{
        ss=t%60;
        mm=t/60;
        hh=mm/60;
        mm%=60;
        hh%=24;
    }
}

bool g,ff;
int main() {
    while(scanf("%d %d %d",&ls[0],&ls[1],&ls[2])){
        if(ls[0]==0&&ls[1]==0&&ls[2]==0)break;
        nmx=-1;
        nmx=max(ls[0],max(ls[1],ls[2]));
        n=2;
        if(ls[2]!=0){
            n=0;
            for(n=3;;n++){
                scanf("%d",&ls[n]);
                if(ls[n]==0)break;
                if(nmx<ls[n])nmx=ls[n];
            }
        }
        
        ff=false;
        for(int t=2*nmx;t<=18000;t++){
            g=true;
            for(int i=0;i<n;i++){
                if(!isGreen(t,ls[i])){
                    g=false;
                    break;
                }
            }
            if(g){
                formatH(t);
                printf("%02d:%02d:%02d\n",hh,mm,ss);
                ff=true;
                break;
            }
        }
        if(!ff){
            printf("Signals fail to synchronise in 5 hours\n");
        }
    }
    return 0;
}

