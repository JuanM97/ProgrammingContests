/* 
 * File:   P2297_DeathKnightHero.cpp
 * Author: JuanM
 *
 * Created on January 20, 2015, 11:54 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int n,r;
    char s[1100];
    scanf("%d",&n);
    r=n;
    while(n--){
        scanf("%s",s);
        for(int i=0;i<strlen(s)-1;i++){
            if(s[i]=='C'&&s[i+1]=='D')r--;
        }
    }
    printf("%d\n",r);
    
    return 0;
}

