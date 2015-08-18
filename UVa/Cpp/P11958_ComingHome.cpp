/* 
 * File:   P11958_CurrentTime.cpp
 * Author: JuanM
 *
 * Created on July 16, 2013, 6:18 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <climits>
using namespace std;

int t,n,trt,min,time,crtime,mmin,caseN=1;
char ct[9],tm[9];

int toMins(char dt[]){
    int h=(dt[0]-'0')*10+(dt[1]-'0');
    int m=(dt[3]-'0')*10+(dt[4]-'0');
    return h*60+m;
}

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d %s",&n,&ct);
        crtime=toMins(ct);
        mmin=INT_MAX;
        while(n--){
            scanf("%s %d",&tm,&trt);
            time=toMins(tm);
            if(time<crtime)time+=1440;
            time+=trt;
            if(mmin>time-crtime)mmin=time-crtime;
        }
        printf("Case %d: %d\n",caseN++,mmin);
    }
    return 0;
}

