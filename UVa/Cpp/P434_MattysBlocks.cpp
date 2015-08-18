/* 
 * File:   P434_MattysBlocks.cpp
 * Author: JuanM
 *
 * Created on July 25, 2013, 4:58 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int frnt[23];
int lat[23];
int t,n,mmin,mtot;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        for(int i=0;i<n;i++){
            scanf("%d",&frnt[i]);
        }
        for(int i=0;i<n;i++){
            scanf("%d",&lat[i]);
        }
        sort(frnt,frnt+n);
        sort(lat,lat+n);
        mmin=0;mtot=0;
        for(int i=0;i<n;i++){
                if(frnt[i]==lat[i]){
                    mmin+=frnt[i];
                }else{
                    mmin=mmin+(frnt[i]+lat[i]);
                }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(frnt[i]!=0){
                    if(lat[j]>frnt[i]){
                        mtot+=frnt[i];
                    }else{
                        mtot+=lat[j];
                    }
                }
            }
        }
        printf("Matty needs at least %d blocks, and can add at most %d extra blocks.\n",mmin,mtot-mmin);
    }
    return 0;
}

