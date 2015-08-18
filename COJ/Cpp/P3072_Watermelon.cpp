/* 
 * File:   P3072_Watermelon.cpp
 * Author: JuanM
 *
 * Created on November 27, 2014, 10:01 PM
 */


#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
#include <set>
using namespace std;

int main() {
    int w;
    while(scanf("%d",&w)!=EOF){
        if(w>2) printf("%s\n",w&1?"NO":"YES");
        else printf("NO\n");
    }
    return 0;
}

