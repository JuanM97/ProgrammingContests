/* 
 * File:   P2845_Quadrants.cpp
 * Author: JuanM
 *
 * Created on January 21, 2015, 12:10 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    double a,b;
    
    while(scanf("%lf %lf",&a,&b)!=EOF){
        if(a==0&&b==0){
            printf("AXIS\n");
            break;
        }else{
            if(a*b==0){
                printf("AXIS\n");
            }else{
                if(a>0&&b>0){
                    printf("Q1\n");
                }else{
                    if(a<0&&b>0){
                        printf("Q2\n");
                    }else{
                        if(a<0&&b<0){
                            printf("Q3\n");
                        }else{
                            printf("Q4\n");
                        }
                    }
                }
            }
        }
    }
    
    return 0;
}

