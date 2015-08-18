/* 
 * File:   P11666_Logarithms.cpp
 * Author: JuanM
 *
 * Created on March 17, 2013, 3:13 AM
 */

#include <cstdlib>
#include <cmath>
#include <cstdio>
#include <iostream>
using namespace std;

int main() {
    long int n;
    double x,p,t;
    while(scanf("%ld",&n)&&n>0){
        for(double i=0.;;i+=1.0){
            t=1.-(n/(pow(M_E,i)));
            x=i;
            if(t<1&&t>-1){
                break;
            }
        }
        printf("%.0f %.8f\n",x,t);
    }
    return 0;
}

