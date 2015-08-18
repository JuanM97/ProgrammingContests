/* 
 * File:   P12136_ScheduleOfAMarriedMan.cpp
 * Author: JuanM
 *
 * Created on July 16, 2013, 7:00 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int toMins(char dt[]){
    int h=(dt[0]-'0')*10+(dt[1]-'0');
    int m=(dt[3]-'0')*10+(dt[4]-'0');
    return h*60+m;
}

int t;
char wi[9],wf[9],mi[9],mf[9];
int wmi,wmf,mmi,mmf,caseN=1;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%s %s %s %s",&wi,&wf,&mi,&mf);
        wmi=toMins(wi);
        wmf=toMins(wf);
        mmi=toMins(mi);
        mmf=toMins(mf);
        if((mmi>=wmi&&mmi<=wmf)||(mmf>=wmi&&mmf<=wmf)||(wmi>=mmi&&wmf<=mmf)){
            printf("Case %d: Mrs Meeting\n",caseN++);
        }else{
            printf("Case %d: Hits Meeting\n",caseN++);
        }
    }
    return 0;
}

