/* 
 * File:   P2410_AreaOfSquares.cpp
 * Author: JuanManuel
 *
 * Created on 4 de febrero de 2015, 2:38
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int t,n,idx;
    double l;
    idx=1;
    scanf("%d",&t);
    while(t--){
        scanf("%lf %d",&l,&n);
        printf("Case #%d: %.2lf\n",idx++,ceil((l*l*100)/pow(2,n-1))/100);
    }
    return 0;
}

