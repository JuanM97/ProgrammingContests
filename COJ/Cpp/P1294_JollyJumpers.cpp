/* 
 * File:   P1294_JollyJumpers.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 12:03 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <cstring>
#include <algorithm>
using namespace std;
int t;
bool isJ;
int a[3005];
bool difs[3004];

void print(){
    printf("\n");
    for(int i=0;i<t;i++){
        printf("%d ",a[i]);
    }printf("\n");
    for(int i=0;i<t-1;i++){
        printf("%d ",difs[i]);
    }printf("\n");
}

int main() {
    while(scanf("%d",&t)!=EOF){
        for(int i=0;i<t;i++){
            scanf("%d",&a[i]);
        }
        memset(difs,0,sizeof difs);
        for(int i=0;i<t-1;i++){
            difs[abs(a[i+1]-a[i])]=true;
        }
        //print();
        isJ=true;
        for(int i=1;i<=t-1;i++){
            if(difs[i]==false){
                isJ=false;
                break;
            }
        }
        if(isJ){
            printf("Jolly\n");
        }else{
            printf("Not jolly\n");
        }
    }
    return 0;
}

