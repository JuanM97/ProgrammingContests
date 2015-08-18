/* 
 * File:   P2444_BinaryGenocide.cpp
 * Author: JuanM
 *
 * Created on August 25, 2014, 1:42 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

int main() {
    int n=0,nu,nt=0;
    while(scanf("%d",&n)!=EOF){
        if(n<0)break;
        nu=0;
        while(n){
            if(n&1) nu++;
            n>>=1;
        }
        if(!(nu%2))nt++;
    }
    printf("%d\n",nt);
    return 0;
}

