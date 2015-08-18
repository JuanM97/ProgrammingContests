/* 
 * File:   P2642_DivisibilityBy3.cpp
 * Author: JuanM
 *
 * Created on January 22, 2015, 11:12 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int t,e,o;
    char b[10100];
    scanf("%d",&t);
    while(t--){
        scanf("%s",b);
        e=0,o=0;
        for(int i=strlen(b);i>=0;i--){
            if(i&1)o+=(b[i]-'0');
            else e+=(b[i]-'0');
        }
        printf("%s\n",((o-e)%3==0)?"YES":"NO");
    }
    return 0;
}

