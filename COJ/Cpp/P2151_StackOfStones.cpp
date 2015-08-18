/* 
 * File:   P2151_StackOfStones.cpp
 * Author: JuanM
 *
 * Created on June 27, 2013, 2:38 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;


int main() {
    int t,n,s,nm,c;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        s=0;nm=-1;
        while(n--){
            scanf("%d",&c);
            if(c>nm)nm=c;
            s+=c;
        }
        printf("%d\n",s-nm);
    }
    return 0;
}

