/* 
 * File:   P3056_AutomaticCheckingMachine.cpp
 * Author: JuanManuel
 *
 * Created on 4 de febrero de 2015, 1:36
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smx 7
using namespace std;

int a,b,bit;
//Maybe would've been better with arrays ... :P
int main() {
    while(scanf("%d",&bit)!=EOF){
        a=0;b=0;
        a=bit;
        for(int i=0;i<4;i++){
            scanf("%d",&bit);
            a=((a<<1)|(bit));
        }
        for(int i=0;i<5;i++){
            scanf("%d",&bit);
            b=((b<<1)|(bit));
        }
        printf("%s\n",(a^b)==31?"Y":"N");
    }
    return 0;
}

