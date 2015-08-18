/* 
 * File:   P1179_OptimalParking.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 12:35 AM
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <climits>
using namespace std;

int main() {
    int t,shops,min,max,a;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&shops);
        min=INT_MAX;
        max=INT_MIN;
        while(shops--){
            scanf("%d",&a);
            if(a<min)min=a;
            if(a>max)max=a;
        }
        printf("%d\n",2*(max-min));
    }
    return 0;
}

