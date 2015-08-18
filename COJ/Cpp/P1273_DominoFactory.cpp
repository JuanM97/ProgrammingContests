/* 
 * File:   P1273_DominoFactory.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 12:45 AM
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <math.h>
#include <cmath>
using namespace std;

int main() {
    int t,n,l,w;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d %d",&n,&l,&w);
        printf("%d\n",(n+1)*(n+2)/2*l*w);
    }
    return 0;
}

