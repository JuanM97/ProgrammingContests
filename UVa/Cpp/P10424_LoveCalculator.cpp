/* 
 * File:   P10424_LoveCalculator.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 11:21 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <ctype.h>
#include <cmath>
#include <algorithm>
using namespace std;

int sum(int number){
    int num=0,temp;
    while(number>0){
        temp=number%10;
        num+=temp;
        number/=10;
    }
    return num;
}

char n1[31],n2[31];
int s1,s2,temp;
double p;
int main() {
    while(scanf("%s",&n1)!=EOF){
        scanf("%s",&n2);
        s1=0;s2=0;
        for(int i=0;i<strlen(n1);i++){
            if(isalpha(n1[i])){
                s1+=((int)tolower(n1[i])-96);
                //printf("plus: %d\n",((int)tolower(n1[i])-96));
            }
        }
        for(int i=0;i<strlen(n2);i++){
            if(isalpha(n2[i])){
                s2+=((int)tolower(n2[i])-96);
            }
        }
        while(s1>9){
            s1=sum(s1);
        }
        while(s2>9){
            s2=sum(s2);
        }
        if(s1<s2){
            p=(double)s1*100.0/(double)s2;
        }else{
            p=(double)s2*100.0/(double)s1;
        }
        printf("%.2lf %%\n",p);
    }
    return 0;
}

