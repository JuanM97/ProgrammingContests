
/* 
 * File:   P1143_ToAndFro.cpp
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
#define smx 210
using namespace std;

char msg[smx][smx];
char msc[smx];
int n,l,k;
int main(){
    while(scanf("%d",&n)!=EOF){
        if(n==0)break;
        scanf("%s",msc);
        l=strlen(msc)/n;
        k=0;
        for(int i=0;i<l;i++){
            if(i&1){
                for(int j=n-1;j>=0;j--){
                    msg[i][j]=msc[k++];
                }
            }else{
                for(int j=0;j<n;j++){
                    msg[i][j]=msc[k++];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                printf("%c",msg[j][i]);
            }
        }
        printf("\n");
    }
    return 0;
}


