/* 
 * File:   P2656_PARKET.cpp
 * Author: JuanM
 *
 * Created on April 7, 2015, 12:22 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int R,B,w,l;
    while(scanf("%d %d",&R,&B)!=EOF){
        for(w=1;w<=R/2-2;w++){
            l=(R>>1)-2-w;
            if(l*w==B)break;
        }
        printf("%d %d\n",(l+2),(w+2));
    }
    
    return 0;
}

