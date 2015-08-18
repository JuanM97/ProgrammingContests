/* 
 * File:   Prob11.cpp
 * Author: JuanM
 *
 * Created on June 5, 2014, 12:21 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int gp;
int a[23][23];

int main(int argc, char** argv) {
    FILE *pf;
    pf=fopen("P11.txt","r");
    for(int i=0;i<20;i++){
        for(int j=0;j<20;j++){
            fscanf(pf,"%d",&a[i][j]);
        }
    }
    
    for(int i=0;i<20;i++){
        for(int j=0;j<20;j++){
            printf("%d ",a[i][j]);
        }printf("\n");
    }
    printf("\n");
    gp=0;
    //Horizontal
    for(int i=0;i<20;i++){
        for(int j=0;j<17;j++){
            if(a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3]>gp)gp=a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
        }
    }
    //Vertical
    for(int i=0;i<17;i++){
        for(int j=0;j<20;j++){
            if(a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j]>gp)gp=a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j];
        }
    }
    //Diagonal D
    for(int i=0;i<17;i++){
        for(int j=0;j<17;j++){
            if(a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3]>gp)gp=a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3];
        }
    }
    //Diagonal I
    for(int i=16;i>=0;i--){
        for(int j=19;j>=3;j--){
            if(a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3]>gp)gp=a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3];
        }
    }
    printf("%d\n",gp);
    return 0;
}

