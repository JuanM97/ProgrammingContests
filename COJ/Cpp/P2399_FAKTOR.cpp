/* 
 * File:   P2399_FAKTOR.cpp
 * Author: JuanM
 *
 * Created on January 11, 2014, 2:00 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int main() {
    int a,b;
    while(scanf("%d %d",&a,&b)!=EOF){
        printf("%d\n",(a*(b-1))+1);
    }
    return 0;
}

