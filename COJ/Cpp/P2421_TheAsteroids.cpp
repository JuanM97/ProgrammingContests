/* 
 * File:   P2421_TheAsteroids.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 12:38 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <climits>
using namespace std;


int main() {
    int n,idx;
    double xs,ys,xa,ya,r,dmin,d;
    while(scanf("%d",&n)){
        if(n==0)break;
        scanf("%lf %lf",&xs,&ys);
        dmin=INT_MAX;
        idx=1;
        for(int i=1;i<=n;i++){
            scanf("%lf %lf %lf",&xa,&ya,&r);
            d=sqrt((xs-xa)*(xs-xa)+(ys-ya)*(ys-ya))-r;
            if(d<dmin){
                dmin=d;
                idx=i;
            }
        }
        printf("%d\n",idx);
    }
    return 0;
}

