/* 
 * File:   P12372_PackingForHoliday.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 12:31 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int t,l,w,h,caseN=1;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d %d %d",&l,&w,&h);
        if(l<21&&w<21&&h<21){
            printf("Case %d: good\n",caseN++);
        }else{
            printf("Case %d: bad\n",caseN++);
        }
    }
    return 0;
}

