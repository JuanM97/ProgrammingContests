/* 
 * File:   P11875_BrickGame.cpp
 * Author: JuanM
 *
 * Created on April 4, 2014, 10:39 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int t,n,cap,caseN,i,c;
    scanf("%d",&t);
    caseN=1;
    while(t--){
        scanf("%d",&n);
        for(i=0;i<=n/2;i++){
            scanf("%d",&cap);
        }
        for(;i<n;i++){
            scanf("%d",&c);
        }
        printf("Case %d: %d\n",caseN++,cap);
    }
    return 0;
}

