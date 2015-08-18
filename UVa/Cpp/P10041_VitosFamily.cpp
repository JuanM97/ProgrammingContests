/* 
 * File:   P10041_VitosFamily.cpp
 * Author: JuanM
 *
 * Created on April 9, 2013, 11:34 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double a[505];
    memset(a,0,sizeof(a));
    double t,n,mdn,r;
    int k,i;
    scanf("%lf",&t);
    while(t--){
        scanf("%lf",&n);
        i=0;
        while(n--){
            scanf("%lf",&a[i++]);
        }
        sort(a,a+i);
        mdn=(i-1)%2==0?a[(int)((i-1)/2)]:a[(int)((i-2)/2)];
        
        r=0;
        for(int j=0;j<i;j++){
            r+=abs(a[j]-mdn);
        }
        printf("%ld\n",(long int)r);
        memset(a,0,sizeof(a));
    }
    return 0;
}

