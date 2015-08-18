/* 
 * File:   P1395_BiNumberII.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 9:25 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#define maxs 10000003
using namespace std;

double digs[maxs];

void preCalc(){
    digs[0]=1;
    for(int i=1;i<maxs;i++){
        digs[i]=log10(i)+digs[i-1];
    }
}

int main() {
    int t,n;
    preCalc();
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        printf("%d\n",(int)digs[n]);
    }
    return 0;
}

