/* 
 * File:   P1358_EvanMoneyLesson.cpp
 * Author: JuanM
 *
 * Created on June 3, 2013, 12:34 AM
 */

#include <cstdlib>
#include <cstdio>
#include <string.h>
#include <limits.h>
using namespace std;
int t;
char m[13];
char M[13];
long int money[103];
long int min,max;
bool eq;
char cN[13];
int c5,c10,c20;

void printM(){
    for(int i=0;i<t;i++){
        printf("%ld ",money[i]);
    }printf("\n");
}

int main() {
    while(true){
        scanf("%d",&t);
        if(t==-1)break;
        min=INT_MAX;
        max=INT_MIN;
        for(int i=0;i<t;i++){
            scanf("%s %d %d %d",&cN,&c5,&c10,&c20);
            money[i]=5*c5+10*c10+20*c20;
            if(money[i]>max){
                max=money[i];
                strcpy(M,cN);
            }
            if(money[i]<min){
                min=money[i];
                strcpy(m,cN);
            }
        }
        eq=true;
        for(int i=1;i<t;i++){
            if(money[i]!=money[i-1]){
                eq=false;
                break;
            }
        }
        if(eq){
            printf("All have the same amount.\n");
        }else{
            printf("%s has most, %s has least money.\n",M,m);
        }
    }
    return 0;
}

