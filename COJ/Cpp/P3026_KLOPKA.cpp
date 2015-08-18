/* 
 * File:   P3026_KLOPKA.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 3:37 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
using namespace std;

int main() {
    int n,minx,miny,maxx,maxy,x,y,l;
    while(scanf("%d",&n)!=EOF){
        minx=1000;miny=1000;
        maxx=-1;maxy=-1;
        for(int i=0;i<n;i++){
            scanf("%d %d",&x,&y);
            if(minx>x)minx=x;
            if(maxx<x)maxx=x;
            if(miny>y)miny=y;
            if(maxy<y)maxy=y;
        }
        l=max(maxx-minx,maxy-miny);
        printf("%d\n",l*l);
    }
    return 0;
}

