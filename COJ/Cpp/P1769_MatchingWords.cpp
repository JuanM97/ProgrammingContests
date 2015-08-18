/* 
 * File:   P1769_MatchingWords.cpp
 * Author: JuanM
 *
 * Created on January 11, 2014, 12:42 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define sz 100010
#define ssz 128
using namespace std;

bool bba[ssz];
bool bbb[ssz];
bool isIn;
char a[sz],b[sz];

void printBB(){
    for(int i=60;i<ssz;i++)
        printf("%s ",bba[i]?"1":"0");
    printf("\n");
}

int ca,cb;
int main() {
    while(scanf("%s %s",&a,&b)!=EOF){
        memset(bba,0,sizeof(bool)*ssz);
        memset(bbb,0,sizeof(bool)*ssz);
        ca=0;cb=0;
        for(int i=0;i<strlen(a);i++){
            ca+=(bba[a[i]]==0?1:0);
            if(ca==26)break;
            bba[a[i]]=1;
        }
        for(int i=0;i<strlen(b);i++){
            cb+=(bbb[b[i]]==0?1:0);
            if(cb==26)break;
            bbb[b[i]]=1;
        }
        isIn=true;
        if(ca>cb){
            for(int i=0;i<ssz;i++){
                if(bbb[i]==1&&bba[i]!=1){
                    isIn=false;
                    break;
                }
            }
            printf("%s\n",isIn?"YES":"NO");
        }else{
            for(int i=0;i<ssz;i++){
                if(bba[i]==1&&bbb[i]!=1){
                    isIn=false;
                    break;
                }
            }
            printf("%s\n",isIn?"YES":"NO");
        }
    }
    return 0;
}

