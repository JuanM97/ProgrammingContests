/* 
 * File:   P2846_IDKey.cpp
 * Author: JuanM
 *
 * Created on January 21, 2015, 2:15 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int sumOfDigits(long long int num){
    int rr=0;
    while(num>=1){
        rr+=(num%10);
        num/=10;
    }
    return rr;
}

int main() {
    int n,a,b;
    long long int id;
    scanf("%d",&n);
    while(n--){
        scanf("%lld",&id);
        a=sumOfDigits(id);
        //printf("a::%d %lld::\n",a,id);
        b=(id%1000)*10;
        a+=b;
        if(a>9999){
            printf("%04d\n",a%10000);
        }else{
            if(a<1000){
                printf("%04d\n",a+1000);
            }else{
                printf("%04d\n",a);
            }
        }
    }
    return 0;
}

