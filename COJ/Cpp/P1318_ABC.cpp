/* 
 * File:   P1318_ABC.cpp
 * Author: JuanM
 *
 * Created on April 24, 2013, 10:50 PM
 */

#include <cstdlib>
#include <cstdio>
#include <iostream>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int a;
    int r[5];
    char c[5];
    while(scanf("%d",&a)!=EOF){
        r[0]=a;
        scanf("%d",&a);
        r[1]=a;
        scanf("%d",&a);
        r[2]=a;
        sort(r,r+3);
        scanf("%s",&c);
        printf("%d %d %d",r[c[0]-'A'],r[c[1]-'A'],r[c[2]-'A']);
    }
    return 0;
}

