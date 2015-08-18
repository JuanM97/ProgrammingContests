/* 
 * File:   P10114_LoansomeCarDriver.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 2:22 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#define smx 110
using namespace std;

int mnth,q,cmth,ix;
double loans[smx];
double pay,cost,pct,antpct,owes,mthlypay,ln,curLoan,curVal;
int main() {
    while(scanf("%d %lf %lf %d",&mnth,&pay,&cost,&q)){
        if(mnth<0)break;
        memset(loans,0,sizeof loans);
        mthlypay=cost/mnth;
        
        while(q--){
            scanf("%d %lf",&ix,&ln);
            for(int i=ix;i<smx;i++){
                loans[i]=ln;
            }
        }
        curLoan=cost;
        curVal=(cost+pay)*(1-loans[0]);
        ix=0;
        while(curVal<curLoan){
            ix++;
            curLoan-=mthlypay;
            curVal=curVal*(1-loans[ix]);
        }
        if(ix!=1){
            printf("%d months\n",ix);
        }else{
            printf("%d month\n",ix);
        }
    }
    return 0;
}

