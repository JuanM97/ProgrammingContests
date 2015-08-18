/* 
 * File:   P3148_ColorOfTheCell.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 12:55 AM
 */

#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
using namespace std;

int main() {
    int t;
    char pos[5];
    scanf("%d",&t);
    while(t--){
        scanf("%s",pos);
        printf("%s\n",(pos[0]+pos[1])&1?"BLACK":"WHITE");
    }
    return 0;
}

