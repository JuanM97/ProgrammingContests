/* 
 * File:   P2605_BeautifulYekaterinburg.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 1:13 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

char fYear[]={'1','7','2','3'};
int d;
int main() {
    while(scanf("%d",&d)!=EOF){
        printf("%c\n",fYear[d-1]);
    }
    return 0;
}

