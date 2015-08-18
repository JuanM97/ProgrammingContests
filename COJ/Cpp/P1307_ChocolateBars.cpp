/* 
 * File:   P1307_ChocolateBars.cpp
 * Author: JuanM
 *
 * Created on June 10, 2013, 9:58 PM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;


int main() {
    int t,n,c,r,nn;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        r=0;
        nn=2*n;
        while(nn--){
            scanf("%d",&c);
            r=(r+c)%n;
        }
        if(r%n==0&&!(r&1)){
            printf("NO\n");
        }else{
            printf("YES\n");
        }
    }
    return 0;
}

