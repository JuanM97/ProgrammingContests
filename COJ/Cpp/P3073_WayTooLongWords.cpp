/* 
 * File:   P3073_WayTooLongWords.cpp
 * Author: JuanM
 *
 * Created on November 27, 2014, 10:12 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
#include <set>
using namespace std;

int main() {
    int t;
    char w[110];
    scanf("%d",&t);
    while(t--){
        scanf("%s",w);
        if(strlen(w)>10) printf("%c%d%c\n",w[0],strlen(w)-2,w[strlen(w)-1]);
        else printf("%s\n",w);
    }
    return 0;
}

