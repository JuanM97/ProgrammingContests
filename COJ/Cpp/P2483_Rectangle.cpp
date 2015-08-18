/* 
 * File:   P2483_Rectangle.cpp
 * Author: JuanM
 *
 * Created on January 11, 2014, 12:23 AM
 */

#include <cstdlib>
#include <cstdio>
//#include <cstring>
//#include <cmath>      //cmath interference with y0 (var name)
//#include <algorithm>
using namespace std;

int x0,x1,x2,x,y0,y1,y2,y;
int main() {
    while(scanf("%d %d %d %d %d %d",&x0,&y0,&x1,&y1,&x2,&y2)!=EOF){
        x=(x0==x1?x2:(x0==x2?x1:x0));
        y=(y0==y1?y2:(y0==y2?y1:y0));
        printf("%d %d\n",(x0==x1?x2:(x0==x2?x1:x0)),(y0==y1?y2:(y0==y2?y1:y0)));
    }
    return 0;
}

