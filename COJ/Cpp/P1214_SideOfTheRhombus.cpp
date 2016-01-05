/* 
 * File:   P1214_SideOfTheRhombus.cpp
 * Author: JuanManuel
 *
 * Created on 5 de noviembre de 2015, 15:26
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <algorithm>
using namespace std;

int main() {
    int t;
    double A,S,a,b,th,L;
    scanf("%d",&t);
    while(t--){
        scanf("%lf %lf",&A,&S);
        if(S*S<8*A){
            b=S/2;
        }else{
            b=(-S-sqrt(((S*S))-(8*A)))/(-2);
        }
        a=S-b;
        a/=2;
        b/=2;
        L=sqrt(a*a+b*b);
        printf("%.2lf\n",L);
    }
    return 0;
}


