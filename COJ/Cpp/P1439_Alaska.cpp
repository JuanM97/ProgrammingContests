/* 
 * File:   P1439_Alaska.cpp
 * Author: JuanM
 *
 * Created on June 10, 2013, 9:23 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;

int pos[1500];

void print(int b){
    for(int i=0;i<b;i++){
        printf("%d ",pos[i]);
    }printf("\n");
}

int main() {
    int n;
    bool ach;
    while(1){
        scanf("%d",&n);
        if(n==0)break;
        memset(pos,0,sizeof(pos));
        for(int i=0;i<n;i++){
            scanf("%d",&pos[i]);
        }
        ach=true;
        //print(n);
        sort(pos,pos+n);
        //print(n);
        if(pos[0]-0>200){
            ach=false;
        }
        for(int i=1;i<n;i++){
            if(pos[i]-pos[i-1]>200){
                ach=false;
                break;
            }
        }
        if(2*(1422-pos[n-1])>200){
            ach=false;
        }
        if(ach){
            printf("POSSIBLE\n");
        }else{
            printf("IMPOSSIBLE\n");
        }
    }
    return 0;
}

