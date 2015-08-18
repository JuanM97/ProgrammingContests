/* 
 * File:   P11889_Benefit.cpp
 * Author: JuanM
 *
 * Created on March 17, 2013, 7:55 PM
 */

#include <cstdlib>
#include <iostream>
#include <cmath>
#include <cstdio>
#include <algorithm>
#include <cstring>
using namespace std;

long long int gcd(long long int a,long long int b){
    if(b==0){
        return a;
    }else{
        return gcd(b,a%b);
    }
}

int lcm(long long int a,long long int b){
    return (a*b)/gcd(a,b);
}

int main() {
    int t;
    long long int a,mcm,r,lcmm;
    scanf("%d",&t);
    while(t--){
        scanf("%lld %lld",&a,&mcm);
        if(mcm%a!=0){
            printf("NO SOLUTION\n");
        }else{
            r=mcm/a;
            if(gcd(r,a)==1){
                printf("%lld\n",r);
            }else{
                for(long long int i=r;i<=mcm;i+=r){
                    lcmm=lcm(a,i);
                    if(lcmm==mcm){
                        printf("%lld\n",i);
                        break;
                    }
                }
            }
        }
    }
    return 0;
}

