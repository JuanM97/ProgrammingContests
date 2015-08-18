/* 
 * File:   P2144_SavingTheFuel.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 3:45 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;

int wg[1003];

void printW(int b){
    for(int i=0;i<b;i++){
        printf("%d ",wg[i]);
    }printf("\n");
}

int main() {
    int t,n,s,fr;
    char r[20];
    scanf("%d",&t);
    while(t--){
        scanf("%d %d %s",&n,&s,&r);
        for(int i=0;i<n;i++){
            scanf("%d",&wg[i]);
        }
        fr=0;
        sort(wg,wg+n);
        //printW(n);
        if(strcmp(r,"regulate")==0){
            for(int i=n-1;s>0;s--,i--){
                fr+=wg[i];
            }
        }else{
            for(int i=0;s>0;s--,i++){
                fr+=wg[i];
            }
        }
        printf("%d\n",fr);
    }
    return 0;
}
