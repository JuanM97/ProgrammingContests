/* 
 * File:   P3110_SuccessorAndPredecessor.cpp
 * Author: JuanM
 *
 * Created on April 7, 2015, 12:35 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 2000100
using namespace std;

char prod[smx];

int main() {
    int n,idx;
    while(scanf("%d",&n)!=EOF){
        n<<=1;
        idx=0;
        memset(prod,0,sizeof(prod));
        if(n%3!=0) prod[idx++]=(n%3==1?'1':'3');
        n-=(n%3);
        while(n>0){
            prod[idx++]='7';
            n-=3;
        }
        printf("%s\n",prod);
    }
    return 0;
}

