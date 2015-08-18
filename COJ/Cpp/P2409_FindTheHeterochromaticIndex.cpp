/* 
 * File:   P2409_FindTheHeterochromaticIndex.cpp
 * Author: JuanM
 *
 * Created on January 21, 2015, 3:17 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

char cat[30];
long int l,r;

int main() {
    
    while(scanf("%s",cat)!=EOF){
        scanf("%ld %ld",&l,&r);
        printf("%s %ld\n",cat,abs(l-r));
    }
    
    return 0;
}

