/* 
 * File:   Prob14.cpp
 * Author: JuanM
 *
 * Created on June 5, 2014, 7:41 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 65536
using namespace std;

int coll[smx];

void initCollatz(){
    coll[0]=0;
    coll[1]=1;
    for(int a=0,c,i=2;i<smx;i++){
        a=i;
        c=0;
        while(a!=1){
            c++;
            if(a%2==0)a/=2;
            else a=3*a+1;
        }
        coll[i]=c;
    }
}

int getCollatz(long long int a){
    if(a<smx&&coll[a]>0)return coll[a];
    if(a%2==0)a/=2;
    else a=3*a+1;
    return 1+getCollatz(a);
}

void printC(int a){
    for(long long int i=0;i<a;i++){
        printf("%d ",coll[i]);
    }printf("\n");
}
int c,mC;
long long int num;
int main() {
    initCollatz();
    //printC(25);
    c=0;mC=-1;num=0;
    for(int i=1;i<=1000000;i++){
        c=getCollatz(i);
        if(c>mC){
            mC=c;
            num=i;
        }
    }
    printf("%lld %d\n",num,mC);
    return 0;
}

