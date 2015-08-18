/* 
 * File:   P3251_Cesta.cpp
 * Author: JuanManuel
 *
 * Created on 29 de abril de 2015, 16:48
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <functional>
#define smx 100100
using namespace std;

int main() {
    char num[smx];
    bool hasZero;
    int sumT;
    while(scanf("%s",&num)!=EOF){
        hasZero=false;
        sumT=0;
        for(int i=0;i<strlen(num);i++){
            if(num[i]=='0')hasZero=true;
            sumT=(sumT+num[i]-'0')%3;
        }
        if(!sumT && hasZero){
            sort(num,num+strlen(num),greater<int>());
            for(int i=0;i<strlen(num);i++){
                if(num[i]=='0'){
                    num[i]=num[strlen(num)-1];
                    num[strlen(num)-1]='0';
                    break;
                }
            }
            printf("%s\n",num);
        }else{
            printf("-1\n");
        }
    }
    return 0;
}

