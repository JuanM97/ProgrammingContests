/* 
 * File:   P2373_MathTable.cpp
 * Author: JuanManuel
 *
 * Created on 5 de noviembre de 2014, 11:14
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;


int main() {
    
    double a,b,c,d,r0,r1,r2,r3,rmx;
    
    while(scanf("%lf %lf %lf %lf",&a,&b,&c,&d)!=EOF){
        r0=a/b+c/d;
        r1=c/a+d/b;
        r2=d/c+b/a;
        r3=b/d+a/c;
        rmx=max(r0,max(r1,max(r2,r3)));
        if(rmx==r0){
            printf("0\n");
        }else{
            if(rmx==r1){
                printf("1\n");
            }else{
                if(rmx==r2){
                    printf("2\n");
                }else{
                    printf("3\n");
                }
            }
        }
    }
    
    return 0;
}

