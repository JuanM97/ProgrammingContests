/* 
 * File:   P10339_WatchingWatches.cpp
 * Author: JuanM
 *
 * Created on July 16, 2013, 6:04 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
long long int a,b,minutes,hh,mm;
int main() {
    int k,m;
    while(scanf("%d %d",&k,&m)!=EOF) {
        if(k==m){
            printf("%d %d 12:00\n",k,m);
            continue;
        }
        minutes = (86400LL-k)*43200/(60*abs(k-m));
        a=(86400LL-k)*43200;
        b=60LL*abs(k-m);
        if((a%b)*2>=b) minutes++;
        hh=(minutes/60)%12;
        mm=minutes%60;
        if(hh==0) hh=12;
        printf("%d %d %02lld:%02lld\n", k, m, hh, mm);
    }
    return 0;
}

