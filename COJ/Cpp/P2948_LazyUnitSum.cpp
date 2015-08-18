/* 
 * File:   P2948_LazyUnitSum.cpp
 * Author: JuanM
 *
 * Created on September 22, 2014, 10:19 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    char c[1100];
    int t,n;
    scanf("%d",&t);
    while(t--){
        scanf("%s",c);
        n=0;
        for(int i=0;i<strlen(c);i++){
            n=(n+c[i]-'0')%9;
        }
        n%=9;
        printf("%d\n",n==0?9:n);
    }
    return 0;
}

