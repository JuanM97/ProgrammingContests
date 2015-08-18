/* 
 * File:   P12279_EmoogleBalance.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 12:17 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;


int n,ct,c,caseN=1,na;
int main() {
    while(scanf("%d",&n)){
        if(n==0)break;
        c=0;
        na=n;
        while(na--){
            scanf("%d",&ct);
            if(ct==0)c++;
        }
        printf("Case %d: %d\n",caseN++,n-(c<<1));
    }
    return 0;
}

