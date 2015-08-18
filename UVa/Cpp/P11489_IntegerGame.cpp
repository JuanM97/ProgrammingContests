/* 
 * File:   P11489_IntegerGame.cpp
 * Author: JuanM
 *
 * Created on May 31, 2014, 2:17 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int t,st,nT,csx=1;
char num[1003];
bool canM=false;
int main() {
    scanf("%d",&t);
    
    while(t--){
        scanf("%s",&num);
        st=0;
        for(int i=0;i<strlen(num);i++){
            st+=num[i]-'0';
        }
        canM=false;
        nT=0;
        for(int i=0;i<strlen(num);i++){
            if((st-(num[i]-'0'))%3==0){
                num[i]='0';
                canM=true;
                break;
            }
        }
        if(canM){
            for(int i=0;i<strlen(num);i++){
                if(num[i]>'0'&&((num[i]-'0')%3)==0)nT++;
            }
        }
        //printf("sss %d %d sss\n",canM,nT);
        if(canM){
            if(nT%2){
                printf("Case %d: T\n",csx++);
            }else{
                printf("Case %d: S\n",csx++);
            }
        }else{
            printf("Case %d: T\n",csx++);
        }
    }
    
    return 0;
}

