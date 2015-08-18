/* 
 * File:   P1580_HailstoneSequence.cpp
 * Author: JuanM
 *
 * Created on June 6, 2013, 10:01 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#define maxS 300
using namespace std;

long int hs[maxS];
long int n;

long int hailseq(){
    long int m=n;
    long int max=n;
    while(m!=1){
        if(m<maxS&&hs[m]!=0){
            if(max>hs[m]){
                return max;
            }else{
                return hs[m];
            }
            return hs[n];
        }else{
            if(m&1){
                m=3*m+1;
            }else{
                m>>=1;
            }
        }
        if(m>max){
            max=m;
        }
    }
    if(n<maxS){
        hs[n]=max;
    }
    return max;
}

int main() {
    memset(hs,0,sizeof(hs));
    hs[0]=0;hs[1]=1;
    while(1){
        scanf("%ld",&n);
        if(n==0)break;
        printf("%ld\n",hailseq());
    }
    return 0;
}

