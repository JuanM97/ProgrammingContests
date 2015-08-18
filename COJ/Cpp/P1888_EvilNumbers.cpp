/* 
 * File:   P1888_EvilNumbers.cpp
 * Author: JuanM
 *
 * Created on June 11, 2013, 12:21 AM
 */


#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

char num[1000000003];

int main() {
    int sum,sum3;
    bool hasSix,isMult2;
    while(scanf("%s",num)!=EOF){
        sum=0;
        sum3=0;
        hasSix=false;
        isMult2=false;
        for(long i=0;i<strlen(num);i++){
            sum=((sum+(num[i]-'0'))%6);
            sum3=((sum3+(num[i]-'0'))%3);
            if(num[i]=='6'){
                hasSix=true;
            }
        }
        if(num[strlen(num)-1]=='0'||num[strlen(num)-1]=='2'||num[strlen(num)-1]=='4'||num[strlen(num)-1]=='6'||num[strlen(num)-1]=='8'){
            isMult2=true;
        }
        if(hasSix && isMult2 && sum3%3==0 && sum%6==0){
            printf("EVIL\n");
        }else{
            printf("GOOD\n");
        }
    }
    return 0;
}

