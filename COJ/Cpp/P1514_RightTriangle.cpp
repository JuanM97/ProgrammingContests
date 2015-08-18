/* 
 * File:   P1514_RightTriangle.cpp
 * Author: JuanM
 *
 * Created on June 6, 2013, 12:59 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int t;
    double b,c,r;
    char num[200];
    scanf("%d",&t);
    while(t--){
        scanf("%lf %lf",&b,&c);
        r=(b*c)*(b*c)/((b+c)*(b+c));
        //Issues with format :/
        sprintf(num,"%.4lf",r);
        //printf("num: %s ",num);
        if(num[strlen(num)-1]=='0'){
            if(num[strlen(num)-2]=='0'){
                if(num[strlen(num)-3]=='0'){
                    if(num[strlen(num)-4]=='0'){
                        printf("%.0lf\n",r);
                    }else{
                        printf("%.1lf\n",r);
                    }
                }else{
                    printf("%.2lf\n",r);
                }
            }else{
                printf("%.3lf\n",r);
            }
        }else{
            printf("%.4lf\n",r);
        }
    }
    return 0;
}

