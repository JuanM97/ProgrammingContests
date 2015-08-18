/* 
 * File:   P10407_SimpleDivision.cpp
 * Author: JuanM
 *
 * Created on March 23, 2013, 12:35 AM
 */

#include <cstdlib>
#include <cmath>
#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cstring>
using namespace std;
        
int gcd(int a, int b){
    if(b==0){
        return a;
    }else{
        return gcd(b,a%b);
    }
}

int main() {
    int a[1003];
    int n,ct,gcD,d;
    while(1){
        int i=0;
        while(1){
            scanf("%d",&n);
            if(n==0)break;
            a[i++]=n;
        }
        if(i==0)break;
        //sort(a,a+i);
        d=a[0];
        gcD=0;
        for(int j=1;j<i;j++){
            gcD=gcd(gcD,a[j]-d);
        }
        printf("%d\n",abs(gcD));
    }
    
    return 0;
}

