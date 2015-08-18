/* 
 * File:   P1324_SnowWhite.cpp
 * Author: JuanM
 *
 * Created on May 1, 2013, 2:21 AM
 */
/*
//Purchase of Turkeys ... ):
#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    printf("%.2lf\n%.2lf\n",6.7896/72,96.7896/72);
    return 0;
}
*/

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <math.h>
using namespace std;
int ds[11];

int sum(){
    int sum=0;
    for(int ii=0;ii<7;ii++){
        sum+=ds[ii];
    }
    return sum;
}
void print(){
    for(int ii=0;ii<7;ii++){
        printf("%d\n",ds[ii]);
    }
}

int main() {
    int i=0;
    while(scanf("%d",&ds[i++])!=EOF){
        for(i=1;i<9;i++){
            scanf("%d",&ds[i]);
        }
        sort(ds,ds+i);
        while(next_permutation(ds,ds+9)){
            if(sum()==100){
                print();
                break;
            }
        }
    }
    return 0;
}
