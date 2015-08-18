/* 
 * File:   P10070_LeapYearOrNotLeapYearAnd....cpp
 * Author: JuanM
 *
 * Created on July 16, 2013, 4:44 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cstring>
#include <algorithm>
using namespace std;

char y[1000003];
int m4,m100,m400,m15,m55;
bool leap,fest,pp=false;
int main() {
    while(scanf("%s",&y)!=EOF){
        m4=m100=m400=m15=m55=0;
        leap=false;
        fest=false;
        if(pp)printf("\n");
        pp=true;
        for(int i=0;i<strlen(y);i++){
            m4=(m4*10+y[i]-'0')%4;
            m100=(m100*10+y[i]-'0')%100;
            m400=(m400*10+y[i]-'0')%400;
            m15=(m15*10+y[i]-'0')%15;
            m55=(m55*10+y[i]-'0')%55;
        }
        //printf("Mods: %d %d %d %d %d\n",m4,m100,m400,m15,m55);
        if((m4==0&&m100!=0)||m400==0){
            printf("This is leap year.\n");
            leap=true;
            fest=true;
        }
        if(m15==0){
            printf("This is huluculu festival year.\n");
            fest=true;
        }
        if(m55==0&&leap){
            printf("This is bulukulu festival year.\n");
        }
        if(!fest){
            printf("This is an ordinary year.\n");
        }
    }
    return 0;
}

