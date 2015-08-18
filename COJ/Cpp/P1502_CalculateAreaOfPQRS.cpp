/* 
 * File:   P1502_CalculateAreaOfPQRS.cpp
 * Author: JuanM
 *
 * Created on February 15, 2015, 6:11 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

//Must use commas as decimals separator ... -.-

int main() {
    int t;
    double a;
    char sa[1000];
    scanf("%d",&t);
    while(t--){
        scanf("%lf",&a);
        memset(sa,0,sizeof(sa));
        sprintf(sa,"%.3lf\n",2*a*a/9);
        for(int i=0;i<strlen(sa);i++) if(sa[i]=='.')sa[i]=',';
        printf("%s\n",sa);
    }
    return 0;
}

