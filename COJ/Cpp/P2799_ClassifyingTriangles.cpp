/* 
 * File:   P2799_ClassifyingTriangles.cpp
 * Author: JuanManuel
 *
 * Created on 5 de noviembre de 2014, 12:14
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

int main() {
    
    int a1,a2,a3;
    
    while(scanf("%d %d %d",&a1,&a2,&a3)!=EOF){
        if(a1+a2+a3!=180){
            printf("Error\n");
        }else{
            if(a1==a2&&a2==a3){
                printf("Equilateral\n");
            }else{
                if(a1==a2||a1==a3||a2==a3){
                    printf("Isosceles\n");
                }else{
                    printf("Scalene\n");
                }
            }
        }
    }

    return 0;
}

