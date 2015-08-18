/* 
 * File:   P1105_CountOnCantor.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 1:51 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;


int t,n,r,d,s,a,b;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        r=(int)(-1./2.+sqrt(1./4.+2*n));
        d=n-r*(r+1)/2;
        s=r%2;
        if(!s){
            if(!d){
                a=r;
                b=1;
            }else{
                a=r+2-d;
                b=r-a+2;
            }
        }else{
            if(!d){
                a=1;
                b=r;
            }else{
                a=d;
                b=r+2-a;
            }
        }
        printf("TERM %d IS %d/%d\n",n,a,b);
    }
    return 0;
}

