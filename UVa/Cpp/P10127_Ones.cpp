/* 
 * File:   P10127_Ones.cpp
 * Author: JuanM
 *
 * Created on April 14, 2013, 10:02 PM
 */

#include <cstdlib>
#include <cstdio>
#include <iostream>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int n,i;
    long long int l;
    while(scanf("%d",&n)!=EOF){
        if(n<0)break;
        l=1;
        for(i=1;;i++){
            if(l%n==0){
                break;
            }else{
                l=(l*10+1)%n;
            }
        }
        printf("%d\n",i);
    }
    return 0;
}

