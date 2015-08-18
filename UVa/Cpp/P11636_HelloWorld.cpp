/* 
 * File:   P11636_HelloWorld.cpp
 * Author: JuanM
 *
 * Created on March 17, 2013, 2:57 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main() {
    int n,cc=1;
    double t;
    while(scanf("%d",&n)&&n>0){
        t=ceil(log(n)/log(2));
        printf("Case %d: %.0f\n",cc++,t);
    }
    return 0;
}

