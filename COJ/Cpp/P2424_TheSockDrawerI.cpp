/* 
 * File:   P2424_TheSockDrawer.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 12:50 PM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int main() {
    int t,n,c,cmax,cse;
    scanf("%d",&t);
    cse=1;
    while(t--){
        scanf("%d",&n);
        cmax=-1;
        for(int i=0;i<n;i++){
            scanf("%d",&c);
            if(c>cmax)cmax=c;
        }
        printf("Case %d: %d %d\n",cse++,n+1,cmax+1);
    }
    return 0;
}

