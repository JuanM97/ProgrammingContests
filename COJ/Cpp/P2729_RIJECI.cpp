/* 
 * File:   P2729_RIJECI.cpp
 * Author: JuanM
 *
 * Created on April 7, 2015, 3:00 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 100
using namespace std;

int fib[smx];

void fibonacci(){
    fib[0]=0;
    fib[1]=1;
    for(int i=2;i<smx;i++){
        fib[i]=fib[i-1]+fib[i-2];
    }
}

int main() {
    int k;
    fibonacci();
    while(scanf("%d",&k)!=EOF){
        printf("%d %d\n",fib[k-1],fib[k]);
    }
    return 0;
}

