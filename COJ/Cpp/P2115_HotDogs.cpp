/* 
 * File:   P2115_HotDog.cpp
 * Author: JuanM
 *
 * Created on May 12, 2013, 4:21 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;

int main() {
    int a,b;
    while(scanf("%d %d",&a,&b)!=EOF){
        printf("%.2lf\n",(double)a/(double)b);
    }
    return 0;
}

