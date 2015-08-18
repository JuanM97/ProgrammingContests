/* 
 * File:   P10978_LetsPlayMagic.cpp
 * Author: JuanM
 *
 * Created on July 17, 2013, 11:27 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

char wrd[20],crd[20];
char lst[70][20];
bool isB[70];
int n,ix,ss;

int main() {
    while(scanf("%d",&n)&&n!=0){
        ix=-1;
        memset(isB,false,sizeof isB);
        for(int i=0;i<n;i++){
            scanf("%s %s",&crd,&wrd);
            ss=strlen(wrd);
            while(ss>0){
                ix=(ix+1)%n;
                if(isB[ix])continue;
                ss--;
            }
            strcpy(lst[ix],crd);
            isB[ix]=true;
        }
        for(int i=0;i<n;i++){
            if(i==0) printf("%s",lst[i]);
            else
                printf(" %s",lst[i]);
        }printf("\n");
    }
    return 0;
}

