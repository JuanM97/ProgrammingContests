/* 
 * File:   P1610_Hubulullu.cpp
 * Author: JuanManuel
 *
 * Created on 4 de febrero de 2015, 3:55
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int t,n,p;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&n,&p);
        printf("%s wins.\n",(p&1)?"Pagfloyd":"Airborne");
    }
    return 0;
}

