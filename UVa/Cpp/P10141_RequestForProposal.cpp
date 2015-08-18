/* 
 * File:   P10141_RequestForProposal.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 10:36 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int n,p,metReq,maxReq,caseN=1;
double price,minp;
char curP[97],acP[97];
int main() {
    while(scanf("%d %d\n",&n,&p)){
        if(n==0&&p==0)break;
        while(n--){
            gets(curP);
        }
        maxReq=-1;
        minp=-1;
        while(p--){
            gets(curP);
            scanf("%lf %d\n",&price,&metReq);
            if(metReq>maxReq){
                maxReq=metReq;
                minp=price;
                strcpy(acP,curP);
            }else{
                if(metReq==maxReq&&price<minp){
                    maxReq=metReq;
                    minp=price;
                    strcpy(acP,curP);
                }
            }
            for(int i=0;i<metReq;i++){
                gets(curP);
            }
        }
        if(caseN>1)printf("\n");
        printf("RFP #%d\n%s\n",caseN++,acP);
    }
    return 0;
}

