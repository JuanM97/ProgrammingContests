/* 
 * File:   P12085_MobileCasanova.cpp
 * Author: JuanM
 *
 * Created on May 29, 2014, 1:22 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
#define stn 100005
using namespace std;

struct num{
    char ds[13];
    int d;
}tn[stn];

int n,idx=1;
num first,act,last;
char cad[11];
int main() {
    while(scanf("%d",&n)!=EOF&&n!=0){
        for(int i=0;i<stn;i++){
            memset(tn[i].ds,0,sizeof(tn[i].ds));
            tn[i].d=0;
        }
        for(int i=0;i<n;i++){
            scanf("%s",&tn[i].ds);
            tn[i].d=atoi(tn[i].ds);
        }
        if(idx==1)printf("Case %d:\n",idx++);
        else printf("Case %d:\n",idx++);
        first=tn[0];
        for(int i=0;i<n;i++){
            act=tn[i];
            
            if(tn[i+1].d-act.d!=1){
                last=act;
                //print
                if(first.d==last.d){
                    printf("%s\n",first.ds);
                }else{
                    int i=0;
                    for(i=0;i<min(strlen(first.ds),strlen(last.ds));i++){
                        if(first.ds[i]!=last.ds[i])break;
                    }
                    memset(cad,0,sizeof(cad));
                    for(int j=0;i+j<strlen(last.ds);j++){
                        cad[j]=last.ds[i+j];
                    }
                    printf("%s-%s\n",first.ds,(cad));
                }
                first=tn[i+1];
            }
        }
        printf("\n");
    }
    return 0;
}

