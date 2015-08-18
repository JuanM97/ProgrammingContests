/* 
 * File:   P11173_GreyCode.cpp
 * Author: JuanM
 *
 * Created on February 28, 2013, 12:07 AM
 */

#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
using namespace std;

int main() {
    int t;
    scanf("%d",&t);
    int n,k;
    while(t-->0){
        scanf("%d %d",&n,&k);
        printf("%d\n",k^k>>1);
    }
    return 0;
}

